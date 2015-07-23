package org.springframework.samples.petclinic.repository.jpa;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Event;
import org.springframework.samples.petclinic.model.Sopot;
import org.springframework.samples.petclinic.repository.EventRepository;
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
public class JpaEventRepositoryImpl implements EventRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Collection<Event> znajdzEventy() throws DataAccessException {
        Query query = this.em.createQuery("SELECT distinct event FROM Event event ORDER BY event.rodzaj");
        return query.getResultList();
    }

    @Override
    public Event findById(int id) throws DataAccessException {
        Query query = this.em.createQuery("SELECT event FROM Event event WHERE event.id =:id");
        query.setParameter("id", id);
        return (Event) query.getSingleResult();
    }
}

