package punto7;

public class AutoLujo extends Autos {
    private int cantidadPasajeros;
    public AutoLujo(String idMontor, String marca, int año, int precio,int cantidadPasajeros){
        super(idMontor, marca, año, precio);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public String toString() {
        return "AutoLujo{" +
                ", idMontor='" + idMontor + '\'' +
                ", marca='" + marca + '\'' +
                ", año=" + año +
                ", precio=" + precio +
                "cantidadPasajeros=" + cantidadPasajeros +
                '}';
    }
}
