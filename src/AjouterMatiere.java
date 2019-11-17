public class AjouterMatiere {


    public Matiere AjouterMatiere(Matiere tabMatiere[], int nbrMati){
        int coefficient, id=(nbrMati+1);
        String libelle;

        ControlSaisie cs = new ControlSaisie();
        System.out.println("Quel est le libelle de la matière "+ id +" ?");
        libelle = cs.SaisieChaine();
        do{
            System.out.println("Quel est le coefficient de la matière "+ id +" ?");
            coefficient = cs.SaisieEntier();
        }while (coefficient<1);




        return new Matiere(id, libelle, coefficient);

    }



}
