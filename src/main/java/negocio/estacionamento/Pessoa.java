package negocio.estacionamento;

import util.estacionamento.Endereco;

import javax.persistence.*;

@Entity
@Table(name = "pessoa")
@Inheritance (strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo_pessoa",discriminatorType = DiscriminatorType.STRING)

public class Pessoa {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 30)
    private String nome;

    private Endereco endereco;


    public Pessoa(){

    }

    public Pessoa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
