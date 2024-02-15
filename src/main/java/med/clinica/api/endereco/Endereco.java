package med.clinica.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String lagradouro; 
    private String bairro; 
    private String cep; 
    private String cidade; 
    private String uf; 
    private String complemento; 
    private String numero;
    
    public Endereco(Endereco endereco) {
        this.lagradouro = endereco.lagradouro;
        this.bairro = endereco.bairro;
        this.cep = endereco.cep;
        this.uf = endereco.uf;
        this.cidade = endereco.cidade;
        this.complemento = endereco.complemento;
        this.numero = endereco.numero;
    }
}
