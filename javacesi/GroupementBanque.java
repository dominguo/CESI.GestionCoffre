package javacesi;

import java.util.ArrayList;

/**
 * Created by Aurelien on 14/09/2016.
 */
public class GroupementBanque
{
    private ArrayList<Banque> listeBanque;
    private String designation;

    public GroupementBanque()
    {

    }

    public GroupementBanque(String designation)
    {
        this.designation = designation;
    }

    public void SetDesignation(String designation)
    {
        this.designation = designation;
    }

    public String GetDesignation()
    {
        return designation;
    }

    public void AddBanque(Banque b)
    {
        listeBanque.add(b);
    }

    public Banque GetBanque(int i)
    {
        return listeBanque.get(i);
    }

    public ArrayList<Banque> GetListeBanque()
    {
        return listeBanque;
    }
}
