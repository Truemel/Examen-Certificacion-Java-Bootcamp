package certificacion.examen.bootcamp.controlador;

import certificacion.examen.bootcamp.modelo.dto.Pedido;
import certificacion.examen.bootcamp.modelo.servicio.PedidoServ;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pedido")
public class PedidoController {

    private final PedidoServ service;

    public PedidoController(PedidoServ service){
        this.service = service;
    }

    @GetMapping("/listar-pedido")
    public String getPedidoList(Model model){
        model.addAttribute("lista", service.getPedidoCamareroList());
        return "listar-pedido";
    }

    @GetMapping("/editar-pedido/{id}")
    public String editarPedidoById(@PathVariable int id, Model model){
        model.addAttribute("pedido", service.getPedidoById(id));
        return "editar-pedido";
    }

    @PostMapping("/editar-pedido")
    public String editarPedido(@ModelAttribute Pedido ped){
        service.updatePedido(ped);
        return "redirect://listar-pedido";
    }
}