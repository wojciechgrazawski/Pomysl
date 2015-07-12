package org.springframework.samples.petclinic.service;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Sopot;

import java.util.Collection;

/**
 * Created by wojciech on 12.07.15.
 */
public interface SopotService {
    Collection<Sopot> znajdzWszystkiePomysly() throws DataAccessException;
}
