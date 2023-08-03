package certificacion.examen.bootcamp.api;

import certificacion.examen.bootcamp.modelo.dto.Plato;
import certificacion.examen.bootcamp.modelo.servicio.PlatoServ;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/platos")
public class PlatosRestController {

    private final PlatoServ service;

    public PlatosRestController(PlatoServ service){
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity<List<Plato>> getPlatoList(){
        return service.getPlatoList().map(lista -> new ResponseEntity<>(lista, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Plato> getPlatoById(@PathVariable int id){
        return service.getPlatoById(id).map(plato -> new ResponseEntity<>(plato, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/add")
    public ResponseEntity<Plato> addPlato(@RequestBody Plato plato){
        return service.addPlato(plato).map(plat -> new ResponseEntity<>(plat, HttpStatus.CREATED))
                .orElse(new ResponseEntity<>(HttpStatus.CONFLICT));
    }

    @PatchMapping("/update")
    public ResponseEntity<Plato> updatePlatoById(@RequestBody Plato plato){
        return service.updatePlato(plato).map(plat -> new ResponseEntity<>(plat, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deletePlatoById(@PathVariable int id){
        return new ResponseEntity<Boolean>(service.deletePlatoById(id), HttpStatus.OK);
    }
}