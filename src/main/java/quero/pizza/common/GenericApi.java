package quero.pizza.common;

import static javax.ws.rs.core.Response.Status.CREATED;

import javax.inject.Inject;
import javax.websocket.server.PathParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

public abstract class GenericApi<T> {

	@Inject
	private GenericDAO<T> dao;
	
	protected abstract Class<T> getType();
	
	@GET
	@Path("{id}")
	public Response getObject(@PathParam("id") Long id){
		return Response.ok(
				dao.buscar(id)
				).build();
	}
	
	@GET
	public Response list(){
		return Response.ok(
				dao.listar(getType())
				).build();
	}
	
	@POST
	public Response insert(T toSave){
		
		T saved = dao.save(toSave);
		
		return Response.status(CREATED)
				.entity(saved)
				.build();
	}
	
	@DELETE
	@Path("{id}")
	public Response remove(@PathParam("id") Long id){
		dao.excluir(id, getType());
		
		return Response.ok().build();
	}
	
}
