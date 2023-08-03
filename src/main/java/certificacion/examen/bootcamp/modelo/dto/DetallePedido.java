package certificacion.examen.bootcamp.modelo.dto;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalle_pedido")
public class DetallePedido {

    @Embedded
    private DetalleCompID id;
    private int cantidad;
    private float subtotal;

    public DetallePedido(){
        id = new DetalleCompID();
        cantidad = 0;
        subtotal = 0f;
    }

    public DetallePedido(DetalleCompID id, int cantidad, float subtotal){
        this.id = id;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public DetallePedido(int pedidoId, int platoId, int cantidad, float subtotal){
        id = new DetalleCompID(pedidoId, platoId);
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public DetalleCompID getId() {
        return id;
    }

    public void setId(DetalleCompID id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "DetallePedido{" +
                "id=" + id +
                ", cantidad=" + cantidad +
                ", subtotal=" + subtotal +
                '}';
    }
}