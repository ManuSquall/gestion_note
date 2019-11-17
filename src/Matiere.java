public class Matiere {
    private int id;
    private String libelle;
    private int coefficient;

    public Matiere(int id, String libelle, int coefficient){
        this.id=id;
        this.libelle=libelle;
        this.coefficient=coefficient;
    }


    //                  Getters
    public int getId() {
        return this.id;
    }

    public int getCoefficient() {
        return this.coefficient;
    }

    public String getLibelle() {
        return this.libelle;
    }


}
