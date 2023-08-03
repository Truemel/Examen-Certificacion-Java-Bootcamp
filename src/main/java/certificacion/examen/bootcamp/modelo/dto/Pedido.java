package certificacion.examen.bootcamp.modelo.dto;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "mesa_id")
    private int mesaId;
    @Column(name = "camarero_id")
    private int camaId;
    private Date fecha;
    private float total;

    public Pedido(){
        id = mesaId = camaId = 0;
        fecha = new Date(0);
        total = 0f;
    }

    public Pedido(int id, int mesaId, int camaId, Date fecha, float total){
        this.id = id;
        this.camaId = camaId;
        this.mesaId = mesaId;
        this.fecha = fecha;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMesaId() {
        return mesaId;
    }

    public void setMesaId(int mesaId) {
        this.mesaId = mesaId;
    }

    public int getCamaId() {
        return camaId;
    }

    public void setCamaId(int camaId) {
        this.camaId = camaId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", mesaId=" + mesaId +
                ", camaId=" + camaId +
                ", fecha=" + fecha +
                ", total=" + total +
                '}';
    }
}