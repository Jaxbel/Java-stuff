public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario jazziel = new Funcionario();
        jazziel.setNombre("Jazziel");
        jazziel.setDocumento("190211601");
        jazziel.setSalario(4000);
        jazziel.setTipo(0);


        System.out.println(jazziel.getSalario());
        System.out.println(jazziel.getBonificacion());

    }
}
