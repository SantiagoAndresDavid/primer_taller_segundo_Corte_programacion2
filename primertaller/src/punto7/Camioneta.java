package punto7;

public class Camioneta extends Autos{
    private double capacidadCarga;
    private int cantidadEjes;
    private int rodadas;

    public Camioneta(String idMontor, String marca, int año, int precio,int cantidadPasajeros){
        super(idMontor, marca, año, precio);
        this.capacidadCarga = capacidadCarga;
        this.cantidadEjes= cantidadEjes;
        this.rodadas = rodadas;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getCantidadEjes() {
        return cantidadEjes;
    }

    public void setCantidadEjes(int cantidadEjes) {
        this.cantidadEjes = cantidadEjes;
    }

    public int getRodadas() {
        return rodadas;
    }

    public void setRodadas(int rodadas) {
        this.rodadas = rodadas;
    }

    @Override
    public String toString() {
        return "Camioneta{" +
                "idMontor='" + idMontor + '\'' +
                ", marca='" + marca + '\'' +
                ", año=" + año +
                ", precio=" + precio +
                ", capacidadCarga=" + capacidadCarga +
                ", cantidadEjes=" + cantidadEjes +
                ", rodadas=" + rodadas +
                '}';
    }
}
