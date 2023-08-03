package certificacion.examen.bootcamp.modelo.servicio;

import certificacion.examen.bootcamp.modelo.dto.Plato;

import java.util.List;
import java.util.Optional;

public interface PlatoServ {
    public Optional<List<Plato>> getPlatoList();
    public Optional<Plato> getPlatoById(int id);
    public Optional<Plato> addPlato(Plato plato);
    public Optional<Plato> updatePlato(Plato plato);
    public boolean deletePlatoById(int id);
}