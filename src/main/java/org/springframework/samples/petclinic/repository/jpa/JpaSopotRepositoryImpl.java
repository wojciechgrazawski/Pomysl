package org.springframework.samples.petclinic.repository.jpa;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.model.Sopot;
import org.springframework.samples.petclinic.repository.SopotRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;

/**
 * Created by wojciech on 12.07.15.
 */
@Repository
public class JpaSopotRepositoryImpl implements SopotRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Collection<Sopot> znajdzPomysly() throws DataAccessException {
        Query query = this.em.createQuery("SELECT*FROM sopot");
        return query.getResultList();
    }
}

