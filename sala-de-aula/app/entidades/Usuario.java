package entidades;

public class Usuario {
    private int id;
    private int tipoUsuario;
    private String email;
    private String senha;

    public Usuario(String email, String senha, int tipoUsuario) {
        this.setTipoUsuario(tipoUsuario);
        this.setEmail(email);
        this.setSenha(senha);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
