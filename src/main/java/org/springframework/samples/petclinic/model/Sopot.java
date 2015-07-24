package org.springframework.samples.petclinic.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.core.style.ToStringCreator;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import java.util.Set;

/**
 * Created by wojciech on 12.07.15.
 */
@Entity
@Table(name = "sopot")
public class Sopot extends Pomysl {
    @Column(name = "adres")
    @NotEmpty
    private String adres;

    @Column(name = "telefon")
    @NotEmpty
    private String telefon;

    public String getAdres() {
        return this.adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return this.telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return new ToStringCreator(this)

                .append("id", this.getId())
                .append("new", this.isNew())
                .append("nazwa", this.getNazwa())
                .append("rodzaj", this.getRodzaj())
                .append("adres", this.adres)
                .append("telefon", this.telefon)
                .toString();
    }
}
