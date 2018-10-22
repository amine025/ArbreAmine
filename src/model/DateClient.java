
package model;

public class DateClient {
    int annee;
    int mois;
    int jour;

    public DateClient(int annee, int mois, int jour) {
        this.annee = annee;
        this.mois = mois;
        this.jour = jour;
    }
    
    public DateClient(){
        
    }

    public int getAnnee() {
        return annee;
    }

    public int getMois() {
        return mois;
    }

    public int getJour() {
        return jour;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }
    
    
}
