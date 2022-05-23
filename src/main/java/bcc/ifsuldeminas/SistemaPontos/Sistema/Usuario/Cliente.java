package bcc.ifsuldeminas.SistemaPontos.Sistema.Usuario;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.generatedValue;
import javax.persistence.GenerationType;

@Entity

public class Cliente {

    @Id
    @generatedValue(strategy=GenerationType.AUTO);
    private long id;
    private String nome;
    private String endereco;
    private int codigoFidelidade;
    private String senha;
}
