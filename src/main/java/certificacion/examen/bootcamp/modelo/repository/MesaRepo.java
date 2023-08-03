package certificacion.examen.bootcamp.modelo.repository;

import certificacion.examen.bootcamp.modelo.dto.Mesa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MesaRepo extends JpaRepository<Mesa, Integer> {
}