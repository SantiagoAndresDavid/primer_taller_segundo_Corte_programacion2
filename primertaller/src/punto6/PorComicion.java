package punto6;

public class PorComicion extends Empleado{
    private int porcentaje;
    private int totalVentas;

    public PorComicion (int cantiadadSemanas, int salario,int porcentaje,int totalVentas){
        super(cantiadadSemanas, salario);
        this.porcentaje = porcentaje;
        this.totalVentas = totalVentas;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(int totalVentas) {
        this.totalVentas = totalVentas;
    }
    double salarioTotal;
    double porcentajeVentas;
    public void calcularSalario(){
        porcentajeVentas =  (porcentaje / 100) * totalVentas ;
        salarioTotal = (salario * cantiadadSemanas) + porcentajeVentas;
    }
    @Override
    public String toString() {
        return "\n Empleado Por Comicion \n" +
                "----------------------------------------------------------------------------------------"+
                "\n cantiadadSemanas: " + cantiadadSemanas+
                "\n salario fijo: " + salario+
                "\n total del procentaje de ventas " +  porcentajeVentas +
                "\n salario a pagar: "+ salarioTotal +
                "\n----------------------------------------------------------------------------------------";
    }
}
