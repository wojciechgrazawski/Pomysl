package org.springframework.samples.petclinic.repository;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.model.Sopot;
import org.springframework.samples.petclinic.model.Visit;

import java.util.Collection;

/**
 * Created by wojciech on 12.07.15.
 */
public interface SopotRepository {

    Collection<Sopot> znajdzPomysly() throws DataAccessException;

    Sopot findById(int id) throws DataAccessException;

    void save(Sopot sopot) throws DataAccessException;
}
