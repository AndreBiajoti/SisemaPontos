package bcc.ifsuldeminas.SistemaPontos.Sistema.model.entity.Posto;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class FuncionarioAdmin extends Funcionario{

    private String senhaAdmin;
}
