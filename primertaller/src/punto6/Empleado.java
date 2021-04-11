package punto6;

public class Empleado {
    protected int cantiadadSemanas;
    protected int salario;


    public Empleado() {
        this(00000, 0000);
    }


    public Empleado(int cantiadadSemanas, int salario) {
        this.cantiadadSemanas = cantiadadSemanas;
        this.salario = salario;
    }

    public int getCantiadadSemanas() {
        return cantiadadSemanas;
    }

    public void setCantiadadSemanas(int cantiadadSemanas) {
        this.cantiadadSemanas = cantiadadSemanas;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }


}
