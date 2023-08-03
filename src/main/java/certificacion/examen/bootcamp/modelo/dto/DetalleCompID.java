package certificacion.examen.bootcamp.modelo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class DetalleCompID implements Serializable {

    @Column(name = "pedido_id")
    private int pedidoId;
    @Column(name = "plato_id")
    private int platoId;

    public DetalleCompID(){
        pedidoId = platoId = 0;
    }

    public DetalleCompID(int pedidoId, int platoId){
        this.pedidoId = pedidoId;
        this.platoId = platoId;
    }

    public int getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    public int getPlatoId() {
        return platoId;
    }

    public void setPlatoId(int platoId) {
        this.platoId = platoId;
    }

    @Override
    public String toString() {
        return "DetalleCompID{" +
                "pedidoId=" + pedidoId +
                ", platoId=" + platoId +
                '}';
    }
}