package javacesi;

import java.util.ArrayList;
import java.util.List;

public class Coffre
{
    private int id;
    private String localisation;
    private String typeCoffre;
    private String typeSecurite;
    private int idClient;
    private double montant;
    private List<Operation> operations;


    //constructeurs

    public Coffre(int id, String loc, String typec, String types, int client, double montant, List<Operation> lesOperations)
    {
        this.id = id;
        this.localisation = loc;
        this.typeCoffre = typec;
        this.typeSecurite = types;
        this.idClient = client;
        this.montant = montant;
        this.operations = lesOperations;
    }

    public Coffre()
    {

    }

    //getter
    public int getId()
    {
        return this.id;
    }

    public String getLocalisation()
    {
        return this.localisation;
    }

    public String getTypeCoffre()
    {
        return this.typeCoffre;
    }

    public String getTypeSecurite()
    {
        return this.typeSecurite;
    }

    public int getIdClient()
    {
        return this.idClient;
    }

    public double getMontant()
    {
        return this.montant;
    }

    public List<Operation> getOperations()
    {
        return this.operations;
    }

    //setter

    public void setId(int identifiant)
    {
        this.id = identifiant;
    }

    public void setLocalisation(String loc)
    {
        this.localisation = loc;
    }

    public void setTypeCoffre(String tCoffre)
    {
        this.typeCoffre = tCoffre;
    }

    public void setTypeSecurite(String tSecurite)
    {
        this.typeSecurite = tSecurite;
    }

    public void setClient(int iClient)
    {
        this.idClient = iClient;
    }

    public void setMontant(double montant)
    {
        this.montant = montant;
    }

    public void setOperation(Operation ope)
    {
        this.operations.add(ope);
    }

}