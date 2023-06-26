package br.com.carvalho.services.generic.jpa;

import java.io.Serializable;
import java.util.Collection;

import br.com.carvalho.dao.Persistente;
import br.com.carvalho.exceptions.DAOException;
import br.com.carvalho.exceptions.MaisDeUmRegistroException;
import br.com.carvalho.exceptions.TableException;
import br.com.carvalho.exceptions.TipoChaveNaoEncontradaException;




/**
 * @author manoel.carvalho
 *
 */

public interface IGenericJpaService <T extends Persistente, E extends Serializable>  {
	
	
    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    
    public void excluir(T entity) throws DAOException;

   
    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

   
    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException;

    
    public Collection<T> buscarTodos() throws DAOException;

}
