package punto4;

public class Ordenador {
    protected int id;
    protected int precio;
    protected String eslogan;


    public Ordenador() {
        this(0000, 0000, "");
    }

    public Ordenador(int id, int precio, String eslogan) {
        this.id = id;
        this.precio = precio;
        this.eslogan = eslogan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getEslogan() {
        return eslogan;
    }

    public void setEslogan(String eslogan) {
        this.eslogan = eslogan;
    }


}
