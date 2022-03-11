package negocio.estacionamento;

import util.estacionamento.Endereco;

public class Operador extends Pessoa{
    private String login;
    private String senha;

    public Operador(String nome, Endereco endereco, String login, String senha) {
        super(nome, endereco);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
