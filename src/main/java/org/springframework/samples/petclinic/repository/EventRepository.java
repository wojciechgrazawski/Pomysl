package org.springframework.samples.petclinic.repository;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Event;

import java.util.Collection;

/**
 * Created by wojciech on 12.07.15.
 */
public interface EventRepository {

    Collection<Event> znajdzEventy() throws DataAccessException;

    Event findById(int id) throws DataAccessException;

}
