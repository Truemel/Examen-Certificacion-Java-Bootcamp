package certificacion.examen.bootcamp.modelo.tools;

import certificacion.examen.bootcamp.modelo.dto.Detalle;

import java.util.List;

public class CalculoCantidad implements CalculoDescuento{

    @Override
    public double descuento(List<Detalle> lista) {
        int cant = 0;
        for(int i = 0; i < lista.size(); i++){
            cant += lista.get(i).getDetPed().getCantidad();
        }
        if(cant <= 5)
            return 0;
        else if(cant > 5 && cant < 10)
            return 3;
        else if (cant >= 10 && cant <= 15)
            return 5;
        else
            return 30;
    }
}
