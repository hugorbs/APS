package repositorios;

public class RepositorioFabricaBDR extends RepositoriosFabrica {

    @Override
    public IRepositorioUsuario createRepositorioUsuario() {
        return new RepositorioUsuario();
    }
}
