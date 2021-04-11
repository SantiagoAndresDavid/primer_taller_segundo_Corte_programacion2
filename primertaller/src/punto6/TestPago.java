package punto6;

public class TestPago {
    public static void main(String[] args) {
        Asalariado asalariado1 = new Asalariado(4, 3000);
        PorHora porhora1 = new PorHora(5,3000,8);
        PorComicion porComicion1 = new PorComicion(5,3000,30,5000);
        asalariado1.calcularSalario();
        System.out.println(asalariado1);
        porhora1.calcularSalario();
        System.out.println(porhora1);
        porComicion1.calcularSalario();
        System.out.println(porComicion1);
    }
}
