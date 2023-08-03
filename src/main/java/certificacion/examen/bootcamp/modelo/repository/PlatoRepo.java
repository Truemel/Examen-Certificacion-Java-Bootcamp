package certificacion.examen.bootcamp.modelo.repository;

import certificacion.examen.bootcamp.modelo.dto.Plato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlatoRepo extends JpaRepository<Plato, Integer> {
}