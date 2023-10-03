public class flujo {
    public static void main(String[] args) {
        System.out.println("Inicio  main");
        try {
            metodo1();
        } catch (MiException e) {
            e.printStackTrace();
        }
        System.out.println("Fin de main");
    }
    public static void metodo1() throws MiException{
        System.out.println("Inicio de metodo1");
        metodo2();
        System.out.println("Fin de metodo1");
    }
    public static void metodo2() throws MiException{
        System.out.printf("Inicio metodo 2");
        throw new MiException("Mi exception fue lanzada");
    }
}
