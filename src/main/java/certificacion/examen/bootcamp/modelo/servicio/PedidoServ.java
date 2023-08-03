package certificacion.examen.bootcamp.modelo.servicio;

import certificacion.examen.bootcamp.modelo.dto.Pedido;
import certificacion.examen.bootcamp.modelo.dto.PedidoCamarero;

import java.util.List;
import java.util.Optional;

public interface PedidoServ {
    public Optional<List<Pedido>> getPedidoList();
    public Optional<Pedido> getPedidoById(int id);
    public Optional<Pedido> updatePedido(Pedido ped);
    public Optional<Pedido> addPedido(Pedido ped);
    public boolean deletePedidoById(int id);
    public Optional<List<PedidoCamarero>> getPedidoCamareroList();
}