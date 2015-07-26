package org.springframework.samples.petclinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Rozrywka;
import org.springframework.samples.petclinic.repository.RozrywkaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * Created by emanuel on 26.07.15.
 */
@Service
public class RozrywkaServiceImpl implements RozrywkaService{

    private RozrywkaRepository rozrywkaRepository;

    @Autowired
    public RozrywkaServiceImpl(RozrywkaRepository rozrywkaRepository) {
        this.rozrywkaRepository = rozrywkaRepository;
    }

    @Override
    @Transactional
    public Collection<Rozrywka> znajdzWszystkieRozrywki() throws DataAccessException {
        return rozrywkaRepository.znajdzRozrywki();
    }

    @Override
    public Rozrywka findRozrywkaById(int id) throws DataAccessException {
        return rozrywkaRepository.findById(id);
    }
}
