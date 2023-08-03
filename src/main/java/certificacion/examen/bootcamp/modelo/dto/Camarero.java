package certificacion.examen.bootcamp.modelo.dto;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "camarero")
public class Camarero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private int edad;
    private Date fechaInicio;

    public Camarero(){
        id = edad = 0;
        nombre = "";
        fechaInicio = new Date(0);
    }

    public Camarero(int id, String nombre, int edad, Date fechaInicio){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaInicio = fechaInicio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Override
    public String toString() {
        return "Camarero{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", fechaInicio=" + fechaInicio +
                '}';
    }
}