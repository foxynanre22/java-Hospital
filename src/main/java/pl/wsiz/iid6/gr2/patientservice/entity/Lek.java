package pl.wsiz.iid6.gr2.patientservice.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Lek")
public class Lek {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String producent;
    private Integer ilosc;

    public Integer getIlosc() { return ilosc; }
    public String getName() {
        return name;
    }

    public String getProducent() {
        return producent;
    }

    public Long getId() {
        return id;
    }

    protected Lek() {
    }

    public Lek(String name, String producent) {
        this.name = name;
        this.producent = producent;
    }

    public Lek(String name, String producent, Integer ilosc) {
        this.name = name;
        this.producent = producent;
        this.ilosc = ilosc;
    }

    @Override
    public String toString(){
        return String.format( "Lek[id=%d, name='%s', producent='%s']", id, name, producent);
    }
}
