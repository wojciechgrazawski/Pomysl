package org.springframework.samples.petclinic.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.core.style.ToStringCreator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

/**
 * Created by emanuel on 26.07.15.
 */
@Entity
@Table(name = "rozrywka")
public class Rozrywka extends Pomysl {
    @Column(name = "ilosc_miejsc")
    @NotEmpty
    private String ilosc_miejsc;

    @Column(name = "cena_biletu")
    @NotEmpty
    private String cena_biletu;

    @Column(name = "godzina")
    @NotEmpty
    private String godzina;


    @Column(name = "telefon")
    @NotEmpty
    @Digits(fraction = 0, integer = 10)
    private String telefon;

    public String getIlosc_miejsc() {
        return this.ilosc_miejsc;
    }

    public void setIlosc_miejsc(String ilosc_miejsc) {
        this.ilosc_miejsc = ilosc_miejsc;
    }

    public String getCena_biletu() {
        return this.cena_biletu;
    }

    public void setCena_biletu(String cena_biletu) {
        this.cena_biletu = cena_biletu;
    }

    public String getGodzina() {
        return this.godzina;
    }

    public void setGodzina(String godzina) {
        this.godzina = godzina;
    }

    public String getTelefon() {
        return this.telefon;
    }

    public void setTelefon(String telephone) {
        this.telefon = telefon;
    }
    @Override
    public String toString() {
        return new ToStringCreator(this)

                .append("id", this.getId())
                .append("new", this.isNew())
                .append("nazwa", this.getNazwa())
                .append("rodzaj", this.getRodzaj())
                .append("adres", this.ilosc_miejsc)
                .append("adres", this.cena_biletu)
                .append("telefon", this.telefon)
                .toString();
    }

}
