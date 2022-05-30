package bcc.ifsuldeminas.SistemaPontos.Sistema.model.entity.Usuario;

import javax.persistence.Entity;
import java.util.Set;

@Entity

public class Cliente  {

    private Set<bcc.ifsuldeminas.SistemaPontos.Sistema.model.entity.Comercial.Compras> Compras;
    private Set<bcc.ifsuldeminas.SistemaPontos.Sistema.model.entity.Pontos> Pontos;
    private Set<bcc.ifsuldeminas.SistemaPontos.Sistema.model.entity.Posto.Abastecimento> Abastecimento;

    private long id;
    private String nome;
    private String endereco;
    private int codigoFidelidade;
    private String senha;


}
