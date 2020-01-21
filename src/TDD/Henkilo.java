package TDD;

import java.time.LocalDate;

public class Henkilo {
    private String etunimi;
    private String sukunimi;
    private LocalDate syntymapaiva;


    public String getEtunimi() {
        return etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public LocalDate getSyntymapaiva() {
        return syntymapaiva;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public void setSyntymapaiva(LocalDate syntymapaiva) {
        this.syntymapaiva = syntymapaiva;
    }


}
