package NotesElevesProfesseurs;
import java.text.DecimalFormat;

public class Date
{
    private int jour;
    private int mois;
    private int annee;

    public int getJour()
    {
        return jour;
    }
    public int getMois()
    {
        return mois;
    }
    public int getAnnee()
    {
        return annee;
    }

    public Date(int jour, int mois, int annee)
    {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    //Méthode qui permet d'afficher la date de naissance d'un élève sous la forme 'DD/MM/YYYY'
    @Override
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("#00");
        DecimalFormat dfa = new DecimalFormat("#0000");
        return df.format(jour) + "/" + df.format(mois) + "/" + dfa.format(annee);
    }
}
