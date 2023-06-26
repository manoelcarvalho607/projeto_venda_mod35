/**
 * 
 */
package br.com.carvalho.dao.jpa;

import br.com.carvalho.dao.generic.jpa.GenericJpaDAO;
import br.com.carvalho.domain.jpa.ClienteJpa;

/**
 * @author manoel.carvalho
 *
 */
public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
