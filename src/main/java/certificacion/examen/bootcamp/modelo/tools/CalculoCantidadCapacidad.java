package certificacion.examen.bootcamp.modelo.tools;

import certificacion.examen.bootcamp.modelo.dto.Detalle;
import certificacion.examen.bootcamp.modelo.dto.Mesa;

import java.util.ArrayList;
import java.util.List;

public class CalculoCantidadCapacidad implements CalculoDescuento{
    @Override
    public double descuento(List<Detalle> lista) {
        int cant = 0;
        int capac = 0;
        ArrayList<Mesa> mesas = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++){
            if(i == 0) {
                mesas.add(lista.get(0).getMesa());
                capac += mesas.get(0).getCapacidad();
            }else{
                for (int j = 0; j < mesas.size(); j++){
                    if(lista.get(i).getMesa().getId() != mesas.get(j).getId()) {
                        mesas.add(lista.get(i).getMesa());
                        capac += lista.get(i).getMesa().getCapacidad();
                    }
                }
            }
            cant += lista.get(i).getDetPed().getCantidad();
        }
        if(cant > 5 && capac < 4)
            return 15;
        else if(cant >= 5 && cant <= 15 && capac >= 4 && capac <= 6)
            return 20;
        else if(cant > 15 && capac > 6)
            return  30;
        else if(cant > 15 && capac == 2)
            return 15;
        else if(cant < 5 && capac <= 4)
            return 0;
        else
            return 0;
    }
}