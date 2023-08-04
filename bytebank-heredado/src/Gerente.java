public class Gerente extends Funcionario{

    private  String clave;

    public void setClave(String clave){
        this.clave=clave;
    }

    public boolean IniciarSesion(String clave){
        return clave == "Beisbol1";
    }
    public double getBonificacion(){
        return super.getSalario();
    }

}
