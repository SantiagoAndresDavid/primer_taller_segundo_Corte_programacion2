package punto2;

public class testpunto2 {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Rafa");
        Directivo directivo1 = new Directivo("Mario");
        Operario operario1 = new Operario("Alfonso");
        Oficial oficial1 = new Oficial("Luis");
        Tecnico tecnico1 = new Tecnico("Pablo");


        System.out.println(empleado1);
        System.out.println(directivo1);
        System.out.println(operario1);
        System.out.println(oficial1);
        System.out.println(tecnico1);
    }
}
