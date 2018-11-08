package controllers;

import fachada.Fachada;
import play.mvc.*;
import play.Logger;
import views.html.*;
import play.data.*;

import javax.inject.*;
public class ControleTelaCadastroUsuario extends Controller {
    private FormFactory formFactory;
    private Fachada fachada;

    @Inject
    public ControleTelaCadastroUsuario(FormFactory formFactory) {
        this.formFactory = formFactory;
        this.fachada = new Fachada();
    }

    public Result index() {
        return ok(views.html.telaCadastrarUsuario.render());
    }

    public Result save() {
        DynamicForm requestData = formFactory.form().bindFromRequest();

        String email = requestData.get("email");
        String senha = requestData.get("senha");
        int usuarioTipo = Integer.parseInt(requestData.get("papel"));

        fachada.cadastrarUsuario(email,senha, usuarioTipo);

        return ok(views.html.telaCadastrarUsuario.render());
    }
}
