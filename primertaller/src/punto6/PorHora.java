package punto6;

public class PorHora extends Empleado {
    private int horas;

    public PorHora (int cantiadadSemanas, int salario,int horas){
        super(cantiadadSemanas, salario);
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    int salarioTotal;
    int totalHoras;
    public void calcularSalario(){
        //validar las horas extras
             totalHoras = ( cantiadadSemanas * 7) * horas ;
             salarioTotal = (salario * totalHoras) ;

    }

    @Override
    public String toString() {
        return "\n Empleado Por Hora \n" +
                "----------------------------------------------------------------------------------------"+
                "\n cantiadadSemanas: " + cantiadadSemanas+
                "\n salario fijo: " + salario+
                "\n horas: " +  totalHoras +
                "\n salario a pagar: "+ salarioTotal +
                "\n----------------------------------------------------------------------------------------";
    }
}
