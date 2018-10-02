package fachada;

import controladores.ControleCadastrarUsuario;
import entidades.Usuario;

public class Fachada {
    public void cadastrarUsuario(String email, String senha, int tipoUsuario){
        Usuario usuario = new Usuario(email, senha, tipoUsuario);
        ControleCadastrarUsuario controleCadastrarUsuario = new ControleCadastrarUsuario();
        controleCadastrarUsuario.cadastrarUsuario(usuario);
    }
}
