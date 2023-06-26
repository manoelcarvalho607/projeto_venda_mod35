/**
 * 
 */
package br.com.carvalho.dao.generic.jpa;

import java.io.Serializable;
import java.util.Collection;

import br.com.carvalho.dao.Persistente;
import br.com.carvalho.exceptions.DAOException;
import br.com.carvalho.exceptions.MaisDeUmRegistroException;
import br.com.carvalho.exceptions.TableException;
import br.com.carvalho.exceptions.TipoChaveNaoEncontradaException;





/**
 * @author Manoel.Carvalho
 *
 */
public interface IGenericJpaDAO <T extends Persistente, E extends Serializable>{
	
	 public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;
	 
	 public void excluir(T entity) throws DAOException;
	 
	 public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;
	 
	 public T consultar(E id) throws MaisDeUmRegistroException, TableException, DAOException;
	    
	 public Collection<T> buscarTodos() throws DAOException;
}
