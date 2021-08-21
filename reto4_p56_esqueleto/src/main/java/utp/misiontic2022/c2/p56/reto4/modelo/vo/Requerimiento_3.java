package utp.misiontic2022.c2.p56.reto4.modelo.vo;

public class Requerimiento_3 {

    private String constructora;
    private int costoLideres;

    public Requerimiento_3(String constructora, int costoLideres) {
        this.constructora = constructora;
        this.costoLideres = costoLideres;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public int getCostoLideres() {
        return costoLideres;
    }

    public void setCostoLideres(int costoLideres) {
        this.costoLideres = costoLideres;
    }

}