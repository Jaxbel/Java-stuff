public class Cuenta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;


    public Cuenta(int agencia){



        if(agencia <= 0){
            System.out.println("No se permite 0");
            this.agencia = 1;

        }else{
           this.agencia = agencia;

        }
        total++;
        System.out.println("Se van creando: " + total + " cuentas");



    }


    //no retorna valor

    void depositar(double saldo) {

        this.saldo = this.saldo + saldo;

    }

    //retorna valor
    public boolean retirar(double valor) {

        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }

    }

    public boolean transferir(double valor, Cuenta cuenta) {

        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            cuenta.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {

        if(agencia>0){
            this.agencia = agencia;
        }
        else{
            System.out.println("No estan permitidos valores negativos");
        }

    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
}