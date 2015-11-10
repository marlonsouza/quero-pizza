package quero.pizza.common;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@SuppressWarnings("unchecked")
@Stateless
public class GenericDAO<T> {
	
	@PersistenceContext(unitName="queroPizzaPU")
	private EntityManager em;
	
	public void excluir(Long id, Class<T> clazz){
		em.remove(em.getReference(clazz, id));
	}
	
	public T save(T entity){
		return em.merge(entity);
	}
	
	public T buscar(Long id){
		return (T) em.find(getClass(), id);
	}
	
	public List<T> listar(Class<T> clazz){
		return em.createQuery("FROM "+clazz.getName()).getResultList();
	}
	
	public List<T> listar(Class<T> clazz, String where){
		return em.createQuery("FROM "+clazz.getName()+where).getResultList();
	}
}
