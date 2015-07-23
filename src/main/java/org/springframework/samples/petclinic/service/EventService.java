package org.springframework.samples.petclinic.service;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Event;
import org.springframework.samples.petclinic.model.Sopot;

import java.util.Collection;

/**
 * Created by wojciech on 12.07.15.
 */
public interface EventService {

    Collection<Event> znajdzWszystkieEventy() throws DataAccessException;

    Event findEventById(int id) throws DataAccessException;
}
