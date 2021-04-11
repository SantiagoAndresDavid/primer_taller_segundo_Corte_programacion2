package punto6;

public class Asalariado extends Empleado {
    public Asalariado(int cantiadadSemanas, int salario) {
        super(cantiadadSemanas, salario);
    }
    double comicion;
    int salarioPagar;
    public void calcularSalario(){

         salarioPagar = cantiadadSemanas * salario;
         comicion = (0.1 * salario);
    }

    @Override
    public String toString() {
        return "\n  Empleado asalariado \n" +
                "------------------------------------------------------------" +
                "\n cantidad de semanas: " + cantiadadSemanas +
                "\n salario fijo:  " + salario +
                "\n comicion: " + comicion +
                "\n salario a pagar: "+ salarioPagar+
                "\n salario a pagar + comicion: " +(salarioPagar + comicion)+
                "\n ------------------------------------------------------------";
    }

}
