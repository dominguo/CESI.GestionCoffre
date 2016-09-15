package javacesi;

import java.util.ArrayList;
import javacesi.Client;

public class Agence
{
    private String nom;
    private Secteur secteur;
    private String adresse;
    private Banque banque;
    private ArrayList<Coffre> listeCoffre;
    private ArrayList<Client> listeClient;

    public Agence()
    {
        listeCoffre = new ArrayList<Coffre>();
        listeClient = new ArrayList<Client>();
    }

    public Agence(String nom, Secteur secteur, String adresse, Banque banque)
    {
        listeCoffre = new ArrayList<Coffre>();
        listeClient = new ArrayList<Client>();
        this.nom = nom;
        this.secteur = secteur;
        this.adresse = adresse;
        this.banque = banque;
    }

    public void SetNom(String nom)
    {
        this.nom = nom;
    }

    public String GetNom()
    {
        return nom;
    }

    public Secteur GetSecteur()
    {
        return secteur;
    }

    public String GetAdresse()
    {
        return adresse;
    }

    public void SetAdresse(String adresse)
    {
        this.adresse = adresse;
    }

    public Banque GetBanque()
    {
        return banque;
    }

    public void SetBanque(Banque banque)
    {
        this.banque = banque;
    }

    public void AddCoffre(Coffre c)
    {
        listeCoffre.add(c);
    }

    public ArrayList<Coffre> GetListeCoffre()
    {
        return listeCoffre;
    }

    public ArrayList<Client> GetListeClient()
    {
        return listeClient;
    }

    public void AddClient(Client c)
    {
        listeClient.add(c);
    }

}
