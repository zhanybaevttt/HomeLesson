package con.company;

public class Class {
    private int nom;
    private String soz;
    private int[] massiv;

    public Class(int nom,String soz ,int[] massiv) {
        this.nom=nom;
        this.soz=soz;
        this.massiv=massiv;
    }


    public int getNom() {
        return nom;
    }




    public String getSoz() {
        return soz;
    }




    public int[] getMassiv() {
        return massiv;
    }
    public void array(int[] massiv){
        for (int i = 0; i <massiv.length; i++) {
            System.out.println(massiv[i]);
        }

    }


    }



