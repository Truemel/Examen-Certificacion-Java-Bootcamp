package certificacion.examen.bootcamp.modelo.repository;

import certificacion.examen.bootcamp.modelo.dto.Camarero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CamareroRepo extends JpaRepository<Camarero, Integer> {
}