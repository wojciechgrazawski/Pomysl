package org.springframework.samples.petclinic.repository.jpa;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Rozrywka;
import org.springframework.samples.petclinic.repository.RozrywkaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;

/**
 * Created by emanuel on 26.07.15.
 */
@Repository
public class JpaRozrywkaRepositoryImpl implements RozrywkaRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Collection<Rozrywka> znajdzRozrywki() throws DataAccessException {
        Query query = this.em.createQuery("SELECT distinct rozrywka FROM Rozrywka rozrywka ORDER BY rozrywka.rodzaj");
        return query.getResultList();
    }

    @Override
    public Rozrywka findById(int id) throws DataAccessException {
        Query query = this.em.createQuery("SELECT rozrywka FROM Rozrywka rozrywka WHERE rozrywka.id =:id");
        query.setParameter("id", id);
        return (Rozrywka) query.getSingleResult();
    }
}
