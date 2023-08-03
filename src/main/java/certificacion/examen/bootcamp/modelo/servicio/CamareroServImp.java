package certificacion.examen.bootcamp.modelo.servicio;

import certificacion.examen.bootcamp.modelo.dto.Camarero;
import certificacion.examen.bootcamp.modelo.repository.CamareroRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CamareroServImp implements CamareroServ{

    private final CamareroRepo repo;

    public CamareroServImp(CamareroRepo repo){
        this.repo = repo;
    }

    @Override
    public Optional<List<Camarero>> getCamareroList() {
        return Optional.of(repo.findAll());
    }

    @Override
    public Optional<Camarero> getCamareroById(int id) {
        return repo.findById(id);
    }

    @Override
    public Optional<Camarero> updateCamarero(Camarero cam) {
        if(repo.existsById(cam.getId()))
            return Optional.of(repo.save(cam));
        return Optional.empty();
    }

    @Override
    public Optional<Camarero> addCamarero(Camarero cam) {
        return Optional.of(repo.save(cam));
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