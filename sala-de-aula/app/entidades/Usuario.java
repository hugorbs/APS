package entidades;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Usuario extends Model {
    @Id
    public int id;

    public int tipoUsuario;

    public String email;

    public String senha;

    public static final Finder<Long, Usuario> find = new Finder<>(Usuario.class);
}
