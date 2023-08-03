package certificacion.examen.bootcamp.modelo.servicio;

import certificacion.examen.bootcamp.modelo.dto.Camarero;

import java.util.List;

public interface CamareroServ {
    public List<Camarero> getCamareroList();
    public Camarero getCamareroById(int id);
    public Camarero updateCamarero(Camarero cam);
    public Camarero addCamarero(Camarero cam);
    public boolean deleteCamareroById(int id);
}