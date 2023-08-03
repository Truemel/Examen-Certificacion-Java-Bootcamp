package certificacion.examen.bootcamp;


import certificacion.examen.bootcamp.modelo.dto.Detalle;
import certificacion.examen.bootcamp.modelo.dto.DetallePedido;
import certificacion.examen.bootcamp.modelo.dto.Mesa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MainTests {

    ArrayList<Detalle> lista = new ArrayList<>();

    public void setListaCant(){
        lista.clear();
        lista.add(new Detalle(new DetallePedido(1, 1, 1, 7.5f), new Mesa(1, 1, 4, "Interior")));
        lista.add(new Detalle(new DetallePedido(1, 2, 1, 10f), new Mesa(1, 1, 4, "Interior")));
    }

    public void setListaCantMultiMesa(){
        lista.clear();
        lista.add(new Detalle(new DetallePedido(1, 1, 1, 7.5f), new Mesa(1, 1, 4, "Interior")));
        lista.add(new Detalle(new DetallePedido(1, 2, 1, 10f), new Mesa(2, 1, 8, "Interior")));
    }

    /*
    Pruebas en condiciones normales
     */
    @Test
    public void testCalculoCantidad(){
        setListaCant();
        Assertions.assertEquals(0, Main.calcCantidad(lista));
    }

    @Test
    public void testCalculoCantCapac(){
        setListaCant();
        Assertions.assertEquals(0, Main.calcCantiCapa(lista));
    }

    /*
    Pruebas en condiciones de borde
     */

    @Test
    public void testCalculoCantidadMultiMesa(){
        setListaCantMultiMesa();
        Assertions.assertEquals(0, Main.calcCantidad(lista));
    }

    @Test
    public void testCalculoCantCapacMultiMesa(){
        setListaCantMultiMesa();
        Assertions.assertEquals(0, Main.calcCantiCapa(lista));
    }
}