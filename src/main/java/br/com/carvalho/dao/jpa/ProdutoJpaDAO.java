/**
 * 
 */
package br.com.carvalho.dao.jpa;

import br.com.carvalho.dao.generic.jpa.GenericJpaDAO;
import br.com.carvalho.domain.jpa.ProdutoJpa;

/**
 * @author manoel.carvalho
 *
 */
public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO{
	
	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}
}
