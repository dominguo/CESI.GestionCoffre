package javacesi;

import java.util.ArrayList;

public class Secteur
{
    private String ville;
    private int codePostal;
    private String pays;
    private ArrayList<Agence> listeAgence;

    public Secteur()
    {

    }

    public void SetVille(String ville)
    {
        this.ville = ville;
    }

    public String GetVille()
    {
        return ville;
    }

    public int GetCodePostal()
    {
        return codePostal;
    }

    public void SetCodePostale(int code)
    {
        codePostal = code;
    }

    public void SetPays(String pays)
    {
        this.pays = pays;
    }

    public String GetPays()
    {
        return pays;
    }

    public ArrayList<Agence> GetListeAgence()
    {
        return listeAgence;
    }

    public void AddAgence(Agence agence)
    {
        listeAgence.add(agence);
    }

    public Agence GetAgence(int i)
    {
        return listeAgence.get(i);
    }

}
