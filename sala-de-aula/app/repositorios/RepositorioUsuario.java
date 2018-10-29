package repositorios;

import entidades.Usuario;

public class RepositorioUsuario implements IRepositorioUsuario {
    @Override
    public void inserir(Usuario usuario) {
        usuario.save();
    }

    @Override
    public boolean existe(String email) {
        return !Usuario.find.query().where().eq("email", email).findList().isEmpty();
    }
}
