public class TestGerente {
    public static void main(String[] args) {
        //Gerente gerente = new Gerente();
        //gerente.setNombre("Karina");

        Gerente gerente = new Gerente();
        gerente.setSalario(6000);
        gerente.setTipo(1);
        gerente.setClave("Beisbol1");


        System.out.println(gerente.getSalario());
        System.out.println(gerente.getBonificacion());
        System.out.println(gerente.IniciarSesion("Beisbol1"));
    }
}
