package certificacion.examen.bootcamp.modelo.servicio;

import certificacion.examen.bootcamp.modelo.dto.Camarero;
import certificacion.examen.bootcamp.modelo.repository.CamareroRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CamareroServImp implements CamareroServ{

    private final CamareroRepo repo;

    public CamareroServImp(CamareroRepo repo){
        this.repo = repo;
    }

    @Override
    public List<Camarero> getCamareroList() {
        return repo.findAll();
    }

    @Override
    public Camarero getCamareroById(int id) {
        if(repo.existsById(id)){
            return repo.findById(id).get();
        }
        return null;
    }

    @Override
    public Camarero updateCamarero(Camarero cam) {
        if(repo.existsById(cam.getId()))
            return repo.save(cam);
        return null;
    }

    @Override
    public Camarero addCamarero(Camarero cam) {
        return repo.save(cam);
    }

    @Override
    public boolean deleteCamareroById(int id) {
        if(repo.existsById(id)) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }
}