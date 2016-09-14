package javacesi;

import java.util.ArrayList;

/**
 * Created by Aurelien on 14/09/2016.
 */
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
        
    }
}
