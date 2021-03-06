package Test;

import NotesElevesProfesseurs.Eleve;
import NotesElevesProfesseurs.Evaluation;
import NotesElevesProfesseurs.Professeur;
import NotesElevesProfesseurs.Promotion;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class ModeleDynamiqueObjet extends AbstractTableModel
{
    private final List<Eleve> eleves = new ArrayList<>();
    private final String[] nom = {"Prénom", "Nom", "Identifiant", "Promotion", "Communication", "Informatique", "Mathématiques", "Physique", "Moyenne", "Médiane"};

    //Déclaration des professeurs
    Professeur Durand = new Professeur("Emile", "Durand");
    Professeur Soma = new Professeur("Frédéric", "Soma");
    Professeur Nevro = new Professeur("Jean", "Nevro");
    Professeur Collin = new Professeur("Arthur", "Collin");

    //Déclaration des élèves
    Eleve Alice = new Eleve("Alice", "Dupont", 1, 1, 1998);
    Eleve Bob = new Eleve("Bob", "Bertrand", 3, 5, 1998);
    Eleve Casper = new Eleve("Casper", "Dupuit", 13, 12, 1998);
    Eleve Donald = new Eleve ("Donald", "Mac", 26, 7, 1998);
    Eleve Elodie = new Eleve("Elodie", "Hugo", 17, 4, 1998);
    Eleve Florian = new Eleve("Florian", "Lee", 9, 4, 1998);
    Eleve Gaston = new Eleve("Gaston", "Lagaffe", 19, 2, 1997);
    Eleve Hugo = new Eleve("Hugo", "Dior", 14, 9, 1997);
    Eleve Julien = new Eleve("Julien", "Gautier", 22, 3, 1999);
    Eleve Killian = new Eleve("Killian", "Souchet", 5, 11, 1997);
    Eleve Lucie = new Eleve("Lucie", "Fight", 10, 10, 1997);
    Eleve Morgane = new Eleve("Morgane", "Pixie", 9, 8, 1997);

    //Déclaration des promotions
    Promotion M1 = new Promotion("2020");
    Promotion L3 = new Promotion("2021");

    public void affectation()
    {
        //Affectation des élèves dans les différentes promotions
        M1.add(Gaston);
        M1.add(Hugo);
        M1.add(Killian);
        M1.add(Lucie);
        M1.add(Morgane);
        L3.add(Alice);
        L3.add(Bob);
        L3.add(Casper);
        L3.add(Donald);
        L3.add(Elodie);
        L3.add(Florian);
        L3.add(Julien);

        //Affectation des notes des professeurs aux élèves
        Gaston.evaluations.add(new Evaluation(Gaston, Durand,"Mathématiques", 14.00));
        Hugo.evaluations.add(new Evaluation(Hugo, Durand,"Mathématiques", 7.50));
        Killian.evaluations.add(new Evaluation(Killian, Durand,"Mathématiques", 9.00));
        Lucie.evaluations.add(new Evaluation(Lucie, Durand,"Mathématiques", 17.80));
        Morgane.evaluations.add(new Evaluation(Morgane, Durand,"Mathématiques", 6.00));
        Alice.evaluations.add(new Evaluation(Alice, Durand,"Mathématiques", 16.00));
        Bob.evaluations.add(new Evaluation(Bob, Durand,"Mathématiques", 4.65));
        Casper.evaluations.add(new Evaluation(Casper, Durand,"Mathématiques", 15.70));
        Donald.evaluations.add(new Evaluation(Donald, Durand,"Mathématiques", 10.00));
        Elodie.evaluations.add(new Evaluation(Elodie, Durand,"Mathématiques", 13.50));
        Florian.evaluations.add(new Evaluation(Florian, Durand,"Mathématiques", 11.75));
        Julien.evaluations.add(new Evaluation(Julien, Durand,"Mathématiques", 10.40));

        Gaston.evaluations.add(new Evaluation(Gaston, Soma,"Communication", 7.00));
        Hugo.evaluations.add(new Evaluation(Hugo, Soma,"Communication", 11.00));
        Killian.evaluations.add(new Evaluation(Killian, Soma,"Communication", 8.30));
        Lucie.evaluations.add(new Evaluation(Lucie, Soma,"Communication", 15.00));
        Morgane.evaluations.add(new Evaluation(Morgane, Soma,"Communication", 5.70));
        Alice.evaluations.add(new Evaluation(Alice, Soma,"Communication", 12.00));
        Bob.evaluations.add(new Evaluation(Bob, Soma,"Communication", 9.50));
        Casper.evaluations.add(new Evaluation(Casper, Soma,"Communication", 5.70));
        Donald.evaluations.add(new Evaluation(Donald, Soma,"Communication", 8.00));
        Elodie.evaluations.add(new Evaluation(Elodie, Soma,"Communication", 11.50));
        Florian.evaluations.add(new Evaluation(Florian, Soma,"Communication", 9.75));
        Julien.evaluations.add(new Evaluation(Julien, Soma,"Communication", 16.40));

        Gaston.evaluations.add(new Evaluation(Gaston, Nevro,"Informatique", 17.00));
        Hugo.evaluations.add(new Evaluation(Hugo, Nevro,"Informatique", 14.50));
        Killian.evaluations.add(new Evaluation(Killian, Nevro,"Informatique", 13.30));
        Lucie.evaluations.add(new Evaluation(Lucie, Nevro,"Informatique", 16.00));
        Morgane.evaluations.add(new Evaluation(Morgane, Nevro,"Informatique", 11.70));
        Alice.evaluations.add(new Evaluation(Alice, Nevro,"Informatique", 15.00));
        Bob.evaluations.add(new Evaluation(Bob, Nevro,"Informatique", 17.65));
        Casper.evaluations.add(new Evaluation(Casper, Nevro,"Informatique", 19.00));
        Donald.evaluations.add(new Evaluation(Donald, Nevro,"Informatique", 0.00));
        Elodie.evaluations.add(new Evaluation(Elodie, Nevro,"Informatique", 10.00));
        Florian.evaluations.add(new Evaluation(Florian, Nevro,"Informatique", 13.75));
        Julien.evaluations.add(new Evaluation(Julien, Nevro,"Informatique", 12.40));

        Gaston.evaluations.add(new Evaluation(Gaston, Collin,"Physique", 3.15));
        Hugo.evaluations.add(new Evaluation(Hugo, Collin,"Physique", 8.50));
        Killian.evaluations.add(new Evaluation(Killian, Collin,"Physique", 14.90));
        Lucie.evaluations.add(new Evaluation(Lucie, Collin,"Physique", 10.00));
        Morgane.evaluations.add(new Evaluation(Morgane, Collin,"Physique", 12.00));
        Alice.evaluations.add(new Evaluation(Alice, Collin,"Physique", 6.35));
        Bob.evaluations.add(new Evaluation(Bob, Collin,"Physique", 15.50));
        Casper.evaluations.add(new Evaluation(Casper, Collin,"Physique", 7.80));
        Donald.evaluations.add(new Evaluation(Donald, Collin,"Physique", 13.00));
        Elodie.evaluations.add(new Evaluation(Elodie, Collin,"Physique", 19.00));
        Florian.evaluations.add(new Evaluation(Florian, Collin,"Physique", 3.00));
        Julien.evaluations.add(new Evaluation(Julien, Collin,"Physique", 15.75));
    }

    public ModeleDynamiqueObjet()
    {
        super();
        eleves.add(Alice);
        eleves.add(Bob);
        eleves.add(Casper);
        eleves.add(Donald);
        eleves.add(Elodie);
        eleves.add(Florian);
        eleves.add(Gaston);
        eleves.add(Hugo);
        eleves.add(Julien);
        eleves.add(Killian);
        eleves.add(Lucie);
        eleves.add(Morgane);

    }

    public int getRowCount() {
        return eleves.size();
    }

    public int getColumnCount()
    {
        return nom.length;
    }

    public String getColumnName(int index)
    {
        return nom[index];
    }

    public Object getValueAt(int ligne, int colonne) {
        affectation();
        switch(colonne){
            case 0:
                return eleves.get(ligne).getPrenom();
            case 1:
                return eleves.get(ligne).getNom();
            case 2:
                return eleves.get(ligne).getId();
            case 3:
                return eleves.get(ligne).getPromotion();
            case 4:
                return eleves.get(ligne).getNote("Communication");
            case 5:
                return eleves.get(ligne).getNote("Informatique");
            case 6:
                return eleves.get(ligne).getNote("Mathématiques");
            case 7:
                return eleves.get(ligne).getNote("Physique");
            case 8:
                return eleves.get(ligne).getMoyenne();
            case 9:
                return eleves.get(ligne).getMediane();

            default:
                return null;
        }
    }

        public void addEleve(Eleve eleve)
        {
        eleves.add(eleve);
        fireTableRowsInserted(eleves.size() - 1, eleves.size() - 1);
    }

    public void removeEleve(int rowIndex) {
        eleves.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
}
