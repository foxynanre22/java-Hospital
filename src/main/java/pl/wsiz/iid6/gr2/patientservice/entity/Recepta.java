package pl.wsiz.iid6.gr2.patientservice.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Recepta")
public class Recepta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String peselPacjenta;
    private LocalDate dataWaznosci;

    public Long getId() {
        return id;
    }

    public String getPeselPacjenta() {
        return peselPacjenta;
    }

    public LocalDate getDataWaznosci() {
        return dataWaznosci;
    }

    public Recepta() {
    }

    public Recepta(String peselPacjenta, LocalDate dataWaznosci) {
        this.peselPacjenta = peselPacjenta;
        this.dataWaznosci = dataWaznosci;
    }
}
