package certificacion.examen.bootcamp.modelo.dto;

public class Detalle {
    private DetallePedido detPed;
    private Mesa mesa;

    public Detalle(){
        detPed = new DetallePedido();
        mesa = new Mesa();
    }

    public Detalle(DetallePedido detPed, Mesa mesa){
        this.detPed = detPed;
        this.mesa = mesa;
    }

    public DetallePedido getDetPed() {
        return detPed;
    }

    public void setDetPed(DetallePedido detPed) {
        this.detPed = detPed;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return "Detalle{" +
                "detPed=" + detPed +
                ", mesa=" + mesa +
                '}';
    }
}