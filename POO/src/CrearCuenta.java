public class CrearCuenta {

    public static void main(String[] args) {

        Cuenta primercuenta = new Cuenta();
        primercuenta.saldo=1000;
        primercuenta.agencia=01;
        primercuenta.numero=20;
        primercuenta.titular="Jazziel";


        System.out.println(primercuenta.saldo);
        System.out.println(primercuenta.agencia);
        System.out.println(primercuenta.numero);
        System.out.println(primercuenta.titular);

        Cuenta segundacuenta = new Cuenta();

        System.out.println(primercuenta );


    }
}
