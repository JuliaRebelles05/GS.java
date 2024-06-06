package br.com.tech4change;

public class Usuario {
    private String login;
    private String senha;
    private String email;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public Object getEmail() {

        return email;
    }

}