package be.enterpriseapps.ngoapp.model;

import java.time.LocalDateTime;

public class Event {

    private Long id;
    private LocalDateTime tijdstip;
    private String titel;
    private String omschrijving;
    private String organisatie;
    private String emailContactpersoon;
    private Location locatie;


    public Event() {
    }

    public Event(Long id,
                 LocalDateTime tijdstip,
                 String titel,
                 String omschrijving,
                 String organisatie,
                 String emailContactpersoon,
                 Location locatie) {
        this.id = id;
        this.tijdstip = tijdstip;
        this.titel = titel;
        this.omschrijving = omschrijving;
        this.organisatie = organisatie;
        this.emailContactpersoon = emailContactpersoon;
        this.locatie = locatie;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public LocalDateTime getTijdstip() {
        return tijdstip;
    }

    public void setTijdstip(LocalDateTime tijdstip) {
        this.tijdstip = tijdstip;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public String getOrganisatie() {
        return organisatie;
    }

    public void setOrganisatie(String organisatie) {
        this.organisatie = organisatie;
    }

    public String getEmailContactpersoon() {
        return emailContactpersoon;
    }

    public void setEmailContactpersoon(String emailContactpersoon) {
        this.emailContactpersoon = emailContactpersoon;
    }

    public Location getLocatie() {
        return locatie;
    }

    public void setLocatie(Location locatie) {
        this.locatie = locatie;
    }
}
