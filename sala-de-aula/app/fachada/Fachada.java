package fachada;

import controladores.ControleCadastrarUsuario;
import entidades.Usuario;

public class Fachada {
    public void cadastrarUsuario(String email, String senha, int tipoUsuario){
        Usuario usuario = new Usuario();
        usuario.email = email;
        usuario.senha = senha;
        usuario.tipoUsuario = tipoUsuario;
        ControleCadastrarUsuario controleCadastrarUsuario = new ControleCadastrarUsuario();
        controleCadastrarUsuario.cadastrarUsuario(usuario);
    }
}
