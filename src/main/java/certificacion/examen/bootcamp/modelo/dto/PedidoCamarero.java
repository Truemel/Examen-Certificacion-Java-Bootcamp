package certificacion.examen.bootcamp.modelo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;

public class PedidoCamarero {

    private Pedido pedido;
    private Camarero camarero;

    public PedidoCamarero(){
        pedido = new Pedido();
        camarero = new Camarero();
    }

    public PedidoCamarero(Pedido pedido){
        this.pedido = pedido;
        camarero = new Camarero();
    }

    public PedidoCamarero(Pedido pedido, Camarero camarero){
        setPedido(pedido);
        setCamarero(camarero);
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Camarero getCamarero() {
        return camarero;
    }

    public void setCamarero(Camarero camarero) {
        this.camarero = camarero;
    }

    @Override
    public String toString() {
        return "PedidoCamarero{" +
                "pedido=" + pedido +
                ", camarero=" + camarero +
                '}';
    }
}