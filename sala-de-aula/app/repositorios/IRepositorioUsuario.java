package repositorios;

import entidades.Usuario;

public interface IRepositorioUsuario {
    public void inserir(Usuario usuario);
    public boolean existe(String email);
}
