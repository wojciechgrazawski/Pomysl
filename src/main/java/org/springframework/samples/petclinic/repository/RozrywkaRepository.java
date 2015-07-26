package org.springframework.samples.petclinic.repository;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Event;
import org.springframework.samples.petclinic.model.Rozrywka;

import java.util.Collection;

/**
 * Created by emanuel on 26.07.15.
 */
public interface RozrywkaRepository {

    Collection<Rozrywka> znajdzRozrywki() throws DataAccessException;

    Rozrywka findById(int id) throws DataAccessException;
}
