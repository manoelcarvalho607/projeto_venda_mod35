/**
 * 
 */
package br.com.carvalho.dao.jpa;

import br.com.carvalho.dao.generic.jpa.IGenericJpaDAO;
import br.com.carvalho.domain.jpa.VendaJpa;
import br.com.carvalho.exceptions.DAOException;
import br.com.carvalho.exceptions.TipoChaveNaoEncontradaException;


/**
 * @author manoel.carvalho
 *
 */
public interface IVendaJpaDAO extends IGenericJpaDAO<VendaJpa, Long> {
	
public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public VendaJpa consultarComCollection(Long id);
}
