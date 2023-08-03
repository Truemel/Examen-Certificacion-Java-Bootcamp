package certificacion.examen.bootcamp.modelo.servicio;

import certificacion.examen.bootcamp.modelo.dto.Pedido;
import certificacion.examen.bootcamp.modelo.dto.PedidoCamarero;

import java.util.List;

public interface PedidoServ {
    public List<Pedido> getPedidoList();
    public Pedido getPedidoById(int id);
    public Pedido updatePedido(Pedido ped);
    public Pedido addPedido(Pedido ped);
    public boolean deletePedidoById(int id);
    public List<PedidoCamarero> getPedidoCamareroList();
}