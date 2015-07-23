package org.springframework.samples.petclinic.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Sopot;
import org.springframework.samples.petclinic.repository.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * Created by wojciech on 12.07.15.
 */
@Service
public class SopotServiceImpl implements SopotService {
    private SopotRepository sopotRepository;

    @Autowired
    public SopotServiceImpl(SopotRepository sopotRepository) {
        this.sopotRepository = sopotRepository;
    }

    @Override
    @Transactional
    public Collection<Sopot> znajdzWszystkiePomysly() throws DataAccessException {
        return sopotRepository.znajdzPomysly();
    }

    @Override
    public Sopot findSopotById(int id) throws DataAccessException {
        return sopotRepository.findById(id);
    }


}
