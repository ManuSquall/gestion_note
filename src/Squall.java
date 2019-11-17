

public class Squall {



    public static void main(String[] args) {

        ControlSaisie cs = new ControlSaisie();
        AjouterMatiere am = new AjouterMatiere();

        Matiere tabMatiere[] = new Matiere[25];
        int nbrMati=0, svg;
        do{
            System.out.println("Combien de matière voulez vous saisir?");
            svg = cs.SaisieEntier();
        }while (svg<1);
        //System.out.println("Vous avez saisi "+svg);
        for (int i = 0; i < svg; i++) {
            tabMatiere[i]= am.AjouterMatiere(tabMatiere, nbrMati);
            System.out.println("\n\n");
            nbrMati++;
        }
        System.out.println("\n\n\n");
        System.out.println("les matières saisies sont:");
        for (int i = 0; i < svg; i++) {
            System.out.println(tabMatiere[i].getLibelle());
        }




    }
}
