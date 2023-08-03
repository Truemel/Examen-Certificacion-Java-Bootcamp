package certificacion.examen.bootcamp.modelo.servicio;

import certificacion.examen.bootcamp.modelo.dto.Plato;
import certificacion.examen.bootcamp.modelo.repository.PlatoRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlatoServImp implements PlatoServ{

    private PlatoRepo repo;

    public PlatoServImp(PlatoRepo repo){
        this.repo = repo;
    }

    @Override
    public Optional<List<Plato>> getPlatoList() {
        return Optional.of(repo.findAll());
    }

    @Override
    public Optional<Plato> getPlatoById(int id) {
        return repo.findById(id);
    }

    @Override
    public Optional<Plato> addPlato(Plato plato) {
        return Optional.of(repo.save(plato));
    }

    @Override
    public Optional<Plato> updatePlato(Plato plato) {
        if(repo.existsById(plato.getId()))
            return Optional.of(repo.save(plato));
        return Optional.empty();
    }

    @Override
    public boolean deletePlatoById(int id) {
        if (repo.existsById(id)){
            repo.deleteById(id);
            return true;
        }
        return false;
    }
}