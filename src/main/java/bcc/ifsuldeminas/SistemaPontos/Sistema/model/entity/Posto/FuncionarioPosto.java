package bcc.ifsuldeminas.SistemaPontos.Sistema.model.entity.Posto;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class FuncionarioPosto extends Funcionario{

    private String senhaFuncionario;
}
