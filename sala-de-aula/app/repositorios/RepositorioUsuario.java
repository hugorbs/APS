package repositorios;

import entidades.Usuario;

public class RepositorioUsuario implements IRepositorioUsuario {
    @Override
    public void inserir(Usuario usuario) {

    }

    @Override
    public boolean existe(String email) {
        return false;
    }
}
