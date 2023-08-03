package certificacion.examen.bootcamp;

import certificacion.examen.bootcamp.modelo.dto.Detalle;
import certificacion.examen.bootcamp.modelo.dto.DetallePedido;
import certificacion.examen.bootcamp.modelo.dto.Mesa;
import certificacion.examen.bootcamp.modelo.tools.CalculoCantidad;
import certificacion.examen.bootcamp.modelo.tools.CalculoCantidadCapacidad;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void Main(String[] args){
        ArrayList<Detalle> lista = new ArrayList<>();
        lista.add(new Detalle(new DetallePedido(1, 1, 1, 7.5f), new Mesa(1, 1, 4, "Interior")));
        lista.add(new Detalle(new DetallePedido(1, 2, 1, 10f), new Mesa(1, 1, 4, "Interior")));

        System.out.println("Calculo Cantidad: "+calcCantidad(lista)+"%");
        System.out.println("Calculo Cantidad Capacidad: "+calcCantiCapa(lista)+"%");
    }

    public static double calcCantidad(List<Detalle> lista){
        CalculoCantidad canti = new CalculoCantidad();
        return canti.descuento(lista);
    }

    public static double calcCantiCapa(List<Detalle> lista){
        CalculoCantidadCapacidad cantiCapa = new CalculoCantidadCapacidad();
        return cantiCapa.descuento(lista);
    }
}