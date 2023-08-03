package certificacion.examen.bootcamp.modelo.tools;

import certificacion.examen.bootcamp.modelo.dto.Detalle;
import certificacion.examen.bootcamp.modelo.dto.DetallePedido;

import java.util.List;

public interface CalculoDescuento {
    public double descuento(List<Detalle> lista);
}