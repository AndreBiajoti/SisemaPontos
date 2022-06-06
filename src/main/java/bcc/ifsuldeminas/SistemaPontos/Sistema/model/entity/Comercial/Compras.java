package bcc.ifsuldeminas.SistemaPontos.Sistema.model.entity.Comercial;

import javax.persistence.*;
import java.util.Set;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "class")
public class Compras  {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int codigoCliente;

    @OneToMany
    @JoinColumn(name="Compras_id")
    private Set<ItemCompra> ItemCompra;


    private String itensCompra;
}
