package certificacion.examen.bootcamp.modelo.servicio;

import certificacion.examen.bootcamp.modelo.dto.Pedido;
import certificacion.examen.bootcamp.modelo.dto.PedidoCamarero;
import certificacion.examen.bootcamp.modelo.repository.PedidoRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PedidoServImp implements PedidoServ{

    private PedidoRepo repo;
    private CamareroServImp camServ;

    public PedidoServImp(PedidoRepo repo, CamareroServImp camServ){
        this.repo = repo;
        this.camServ = camServ;
    }

    @Override
    public List<Pedido> getPedidoList() {
        return repo.findAll();
    }

    @Override
    public Pedido getPedidoById(int id) {
        if(repo.existsById(id))
            return repo.findById(id).get();
        else
            return null;
    }

    @Override
    public Pedido updatePedido(Pedido ped) {
        if(repo.existsById(ped.getId()))
            return repo.save(ped);
        return null;
    }

    @Override
    public Pedido addPedido(Pedido ped) {
        return repo.save(ped);
    }

    @Override
    public boolean deletePedidoById(int id) {
        if(repo.existsById(id)) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<PedidoCamarero> getPedidoCamareroList() {
        List<Pedido> ped = getPedidoList();
        if(!ped.isEmpty()){
            ArrayList<PedidoCamarero> lista = new ArrayList<>();
            for (int i = 0; i < ped.size(); i++){
                lista.add(new PedidoCamarero(ped.get(i), camServ.getCamareroById(ped.get(i).getCamaId())));
            }
            return lista;
        }
        return null;
    }
}