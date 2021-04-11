package punto4;


public class TestVenta {
    public static void main(String[] args) {
        Portatil portatil1 = new Portatil(12312310, 5000000, "Ideal para sus viajes", 76.8);
        SobreMesa sobreMesa1 = new SobreMesa(123123, 300000, "Es el que más pesa, pero el que menos cuesta"
                , "alta y con luces led y 3 ventiladores");

        System.out.println(portatil1);
        System.out.println(sobreMesa1);
    }
}
