package med.clinica.api;


import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.clinica.api.endereco.Endereco;
import med.clinica.api.medico.DadosCadastroUser;
import med.clinica.api.medico.Especialidade;
import med.clinica.api.medico.Medico;
import med.clinica.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    @Autowired
    private MedicoRepository repository;

    @GetMapping("/user")
    public String getUser(){
        return "get no /api/user";
    }

    @PostMapping("/user")
    @Transactional
    public String createUser(@RequestBody @Valid DadosCadastroUser json){
        repository.save(new Medico(json));
        return "Salvou no DB";
    }
}
