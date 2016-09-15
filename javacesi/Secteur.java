package javacesi;

import java.util.ArrayList;

public class Secteur
{
    /**
     * Attribut ville : ville correspondant au secteur.
     */
    private String ville;

    /**
     * Attribut codePostal : code postal correspondant à la localisation du secteur.
     */
    private int codePostal;

    /**
     * Attribut pays : pays correspondant à la localisation du secteur.
     */
    private String pays;

    /**
     * Attribut listeAgence : liste des agences du secteur.
     */
    private ArrayList<Agence> listeAgence;

    /**
     * Constructeur vide de la classe Secteur.
     */
    public Secteur()
    {
        listeAgence = new ArrayList<Agence>();
    }

    /**
     * Constructeur de la classe Secteur.
     * @param ville
     * @param codePostal
     * @param pays
     */
    public Secteur(String ville, int codePostal, String pays)
    {
        this.ville = ville;
        this.codePostal = codePostal;
        this.pays = pays;
        listeAgence = new ArrayList<Agence>();
    }

    /**
     * Méthode SetVille permettant de modifier la ville du secteur.
     * @param ville
     */
    public void SetVille(String ville)
    {
        this.ville = ville;
    }

    /**
     * Méthode GetVille permettant de récupérer la ville du secteur.
     * @return ville
     */
    public String GetVille()
    {
        return ville;
    }

    /**
     * Méthode GetCodePostal permettant de récupérer le code postal du secteur.
     * @return codePostal
     */
    public int GetCodePostal()
    {
        return codePostal;
    }

    /**
     * Méthode SetCodePostal permettant de modifier le code postal du secteur.
     * @param code
     */
    public void SetCodePostale(int code)
    {
        codePostal = code;
    }

    /**
     * Méthode SetPays permettant de modifier le pays du secteur.
     * @param pays
     */
    public void SetPays(String pays)
    {
        this.pays = pays;
    }

    /**
     * Méthode GetPays permettant de récupérer le pays du secteur.
     * @return pays
     */
    public String GetPays()
    {
        return pays;
    }

    /**
     * Méthode GetListeAgence permettant de récupérer la liste d'agences du secteur.
     * @return listeAgence
     */
    public ArrayList<Agence> GetListeAgence()
    {
        return listeAgence;
    }

    /**
     * Méthode addAgence permettant d'ajouter une agence à la liste d'agences du secteur.
     * @param agence
     */
    public void AddAgence(Agence agence)
    {
        listeAgence.add(agence);
        agence.SetSecteur(this);
    }

    /**
     * Méthode GetAgence permettant de récupérer l'agence à l'indice i dans la liste d'agnces.
     * @param i
     * @return agence
     */
    public Agence GetAgence(int i)
    {
        if(i >= listeAgence.size() || i < 0)
            return null;
        else
            return listeAgence.get(i);
    }

    public void AfficherListeAgence()
    {
        System.out.println("Liste agence secteur : " + GetPays() + " " + GetVille());
        for(int i = 0; i < listeAgence.size(); i++)
        {
            System.out.println("Agence : " + listeAgence.get(i).GetNom());
        }
    }
}
