package pe.edu.cibertec.app_oauth_client_ef.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/reservas")
public class ReservaController {

    @GetMapping("/espacio-libre")
    public String publicApi(){
        return "En estos momentos el espacio libre en el local es de 10 personas";
    }

    @GetMapping("/reservas-generadas")
    public String privateApi(){
        return "En estos momentos hay 1 reserva generada. Generado por: Hugo Castro con DNI 23145621 para el día 20/10/2024";
    }

}