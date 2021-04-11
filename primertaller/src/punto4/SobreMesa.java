package punto4;

public class SobreMesa extends Ordenador {
    public SobreMesa(int id, int precio, String eslogan, String descripcion) {
        super(id, precio, eslogan);
        this.descripcion = descripcion;
    }

    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "\n SobreMesa\n" +
                "-----------------------------------------------------------------------------" +
                "\n id=" + id +
                "\n precio: " + precio +
                "\n eslogan: " + eslogan +
                "\n descripcion: " + descripcion +
                "\n-----------------------------------------------------------------------------\n";
    }
}
