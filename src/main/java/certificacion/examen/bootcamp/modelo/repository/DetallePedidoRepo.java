package certificacion.examen.bootcamp.modelo.repository;

import certificacion.examen.bootcamp.modelo.dto.DetalleCompID;
import certificacion.examen.bootcamp.modelo.dto.DetallePedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetallePedidoRepo extends JpaRepository<DetallePedido, DetalleCompID> {
}