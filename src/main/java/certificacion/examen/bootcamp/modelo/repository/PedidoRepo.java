package certificacion.examen.bootcamp.modelo.repository;

import certificacion.examen.bootcamp.modelo.dto.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepo extends JpaRepository<Pedido, Integer> {
}