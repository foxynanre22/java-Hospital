package pl.wsiz.iid6.gr2.patientservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "patient")
public class PatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String pesel;
    private String nrUbezpieczenie;

    public String getNrUbezpieczenie() {
        return nrUbezpieczenie;
    }

    public String getPesel() {
        return pesel;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    protected PatientEntity() {
    }

    public PatientEntity(String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    public PatientEntity(String firstName, String lastName, String pesel, String NrUbezpieczenia) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.nrUbezpieczenie = NrUbezpieczenia;
    }

    @Override
    public String toString(){
        return String.format( "Patient[id=%d, firstName='%s', lastName='%s', idUbezpieczenia='%s']", id, firstName, lastName, nrUbezpieczenie);
    }
}