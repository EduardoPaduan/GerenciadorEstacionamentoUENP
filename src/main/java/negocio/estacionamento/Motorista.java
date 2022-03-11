package negocio.estacionamento;

import util.estacionamento.Endereco;

public class Motorista extends Pessoa{

    private long cnh;
    private String secao;

    public Motorista(String nome, Endereco endereco, long cnh, String seção) {
        super(nome, endereco);
        this.cnh = cnh;
        this.secao = seção;
    }

    public long getCnh() {
        return cnh;
    }

    public void setCnh(long cnh) {
        this.cnh = cnh;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }
}
