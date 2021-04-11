package punto2;

public class Empleado {
    private String nombre;

    public Empleado() {
        this("no ingresado");
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String toString() {
        return nombre;
    }
}