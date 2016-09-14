package javacesi;

import java.util.ArrayList;

public class Banque
{
    private GroupementBanque groupementBanque;
    private String designation;
    private ArrayList<Agence> listeAgence;

    public Banque()
    {

    }

    public Banque(String designation, GroupementBanque groupementBanque)
    {
        this.designation = designation;
        this.groupementBanque = groupementBanque;
    }

    public void SetDesignation(String designation)
    {
        this.designation = designation;
    }

    public String GetDesignation()
    {
        return designation;
    }

    public GroupementBanque GetGroupementBanque()
    {
        return groupementBanque;
    }

    public void SetGroupementBanque(GroupementBanque groupe)
    {
        groupementBanque = groupe;
    }

    public ArrayList<Agence> GetListeAgence()
    {
        return listeAgence;
    }

    public void AddAgence(Agence agence)
    {
        listeAgence.add(agence);
    }

}
