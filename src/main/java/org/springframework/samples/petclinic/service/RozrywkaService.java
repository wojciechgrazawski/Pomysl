package org.springframework.samples.petclinic.service;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Rozrywka;

import java.util.Collection;

/**
 * Created by emanuel on 26.07.15.
 */
public interface RozrywkaService {

    Collection<Rozrywka> znajdzWszystkieRozrywki() throws DataAccessException;

    Rozrywka findRozrywkaById(int id) throws DataAccessException;
}
