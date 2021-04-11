package punto4;

public class Portatil extends Ordenador {
    public Portatil(int id, int precio, String eslogan, double peso) {
        super(id, precio, eslogan);
        this.peso = peso;
    }

    private double peso;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "\n Portatil\n" +
                "-----------------------------------------------------------------------------" +
                "\n id=" + id +
                "\n precio: " + precio +
                "\n eslogan: " + eslogan +
                "\n descripcion: " + peso +
                "\n-----------------------------------------------------------------------------\n";
    }
}
