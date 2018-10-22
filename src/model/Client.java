package model;

public class Client {

    String nom;
    String prenom;
    DateClient ddn;
    String ip;
    String nomMachine;
    String localisation;

    public Client(String nom, String prenom, DateClient ddn, String ip, String nomMachine, String localisation) {
        this.nom = nom;
        this.prenom = prenom;
        this.ddn = ddn;
        this.ip = ip;
        this.nomMachine = nomMachine;
        this.localisation = localisation;
    }

    public Client() {

    }

    public Client(String nom, String prenom, DateClient ddn) {
        this.nom = nom;
        this.prenom = prenom;
        this.ddn = ddn;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public DateClient getDdn() {
        return ddn;
    }

    public String getIp() {
        return ip;
    }

    public String getNomMachine() {
        return nomMachine;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDdn(DateClient ddn) {
        this.ddn = ddn;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setNomMachine(String nomMachine) {
        this.nomMachine = nomMachine;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }
    
    

}
