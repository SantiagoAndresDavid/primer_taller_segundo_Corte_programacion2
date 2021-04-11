package punto7;

public class Autos {
    protected String idMontor;
    protected String marca;
    protected int año;
    protected int precio;

    public Autos(){
        this("","",0000,000);
    }



    public Autos(String idMontor, String marca, int año, int precio) {
        this.idMontor = idMontor;
        this.marca = marca;
        this.año = año;
        this.precio = precio;
    }

    public String getIdMontor() {
        return idMontor;
    }

    public void setIdMontor(String idMontor) {
        this.idMontor = idMontor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
