package org.springframework.samples.petclinic.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.support.MutableSortDefinition;
import org.springframework.beans.support.PropertyComparator;
import org.springframework.core.style.ToStringCreator;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import java.util.*;

/**
 * Created by wojciech on 12.07.15.
 */
@MappedSuperclass
public class Pomysl extends BaseEntity {
    @Column(name = "nazwa")
    @NotEmpty
    protected String nazwa;

    @Column(name = "rodzaj")
    @NotEmpty
    protected String rodzaj;

    public String getNazwa() {
        return this.nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getRodzaj() {
        return this.rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

}
