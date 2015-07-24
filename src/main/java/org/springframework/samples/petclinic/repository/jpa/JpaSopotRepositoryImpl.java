package org.springframework.samples.petclinic.repository.jpa;

import org.springframework.dao.DataAccessException;
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
        Query query = this.em.createQuery("SELECT distinct sopot FROM Sopot sopot ORDER BY sopot.adres");
        return query.getResultList();
    }

    @Override
    public Sopot findById(int id) throws DataAccessException {
        Query query = this.em.createQuery("SELECT sopot FROM Sopot sopot WHERE sopot.id =:id");
        query.setParameter("id", id);
        return (Sopot) query.getSingleResult();
    }

    @Override
    public void save(Sopot sopot) throws DataAccessException {
        if (sopot.getId() == null) {
            this.em.persist(sopot);
        }
        else {
            this.em.merge(sopot);
        }
    }
}

