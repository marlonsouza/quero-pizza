package quero.pizza.pessoas.api;

import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import quero.pizza.common.GenericApi;
import quero.pizza.pessoas.Usuario;

@Stateless
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioApi extends GenericApi<Usuario>{

	@Override
	protected Class<Usuario> getType() {
		return Usuario.class;
	}

	
}
