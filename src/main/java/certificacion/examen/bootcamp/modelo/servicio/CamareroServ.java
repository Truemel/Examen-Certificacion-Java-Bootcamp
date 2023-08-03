package certificacion.examen.bootcamp.modelo.servicio;

import certificacion.examen.bootcamp.modelo.dto.Camarero;
import certificacion.examen.bootcamp.modelo.dto.PedidoCamarero;

import java.util.List;
import java.util.Optional;

public interface CamareroServ {
    public Optional<List<Camarero>> getCamareroList();
    public Optional<Camarero> getCamareroById(int id);
    public Optional<Camarero> updateCamarero(Camarero cam);
    public Optional<Camarero> addCamarero(Camarero cam);
    public boolean deleteCamareroById(int id);
}