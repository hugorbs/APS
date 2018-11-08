package controladores;

import entidades.Usuario;
import repositorios.IRepositorioUsuario;
import repositorios.RepositorioFabricaBDR;
import repositorios.RepositoriosFabrica;

public class ControleCadastrarUsuario {
    private RepositoriosFabrica repositoriosFabrica;

    public ControleCadastrarUsuario(){
        this.repositoriosFabrica = new RepositorioFabricaBDR();
    }

    public void cadastrarUsuario(Usuario usuario){
        IRepositorioUsuario repositorioUsuario = repositoriosFabrica.createRepositorioUsuario();

        if(repositorioUsuario.existe(usuario.email) == false){
            repositorioUsuario.inserir(usuario);
        }
    }
}
