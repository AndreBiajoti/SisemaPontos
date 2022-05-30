package bcc.ifsuldeminas.SistemaPontos.Sistema.model.entity.Usuario;


import javax.persistence.Entity;

@Entity

public class PessoaJuridica extends Cliente{
    private String cnpj;
}
