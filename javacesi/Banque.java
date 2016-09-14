package javacesi;

import java.security.acl.Group;
import java.util.ArrayList;

/**
 * Created by Aurelien on 14/09/2016.
 */
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


}
