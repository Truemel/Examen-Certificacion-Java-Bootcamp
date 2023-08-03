package certificacion.examen.bootcamp.modelo.servicio;

import certificacion.examen.bootcamp.modelo.dto.Pedido;
import certificacion.examen.bootcamp.modelo.dto.PedidoCamarero;
import certificacion.examen.bootcamp.modelo.repository.PedidoRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PedidoServImp implements PedidoServ{

    private PedidoRepo repo;
    private CamareroServImp camServ;

    public PedidoServImp(PedidoRepo repo, CamareroServImp camServ){
        this.repo = repo;
        this.camServ = camServ;
    }

    @Override
    public Optional<List<Pedido>> getPedidoList() {
        return Optional.of(repo.findAll());
    }

    @Override
    public Optional<Pedido> getPedidoById(int id) {
        return repo.findById(id);
    }

    @Override
    public Optional<Pedido> updatePedido(Pedido ped) {
        if(repo.existsById(ped.getId()))
            return Optional.of(repo.save(ped));
        return Optional.empty();
    }

    @Override
    public Optional<Pedido> addPedido(Pedido ped) {
        return Optional.of(repo.save(ped));
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
    public Optional<List<PedidoCamarero>> getPedidoCamareroList() {
        Optional<List<Pedido>> ped = getPedidoList();
        if(ped.isPresent()){
            ArrayList<PedidoCamarero> lista = new ArrayList<>();
            for (int i = 0; i < ped.get().size(); i++){
                lista.add(new PedidoCamarero(ped.get().get(i), camServ.getCamareroById(ped.get().get(i).getCamaId()).get()));
            }
            return Optional.of(lista);
        }
        return Optional.empty();
    }
}