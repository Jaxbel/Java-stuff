public class TestConexion {
    public static void main(String[] args) throws Exception {

        try(Conexion con =  new Conexion()){
            con.leerDatos();
        } catch (IllegalStateException e) {
            System.out.println("ejecutado catch");
            e.printStackTrace();
        }

        /*
        Conexion con = null;
        try{
            con = new Conexion();
            con.leerDatos();

        }catch ( IllegalStateException ex) {
            ex.printStackTrace();
        }finally {
            System.out.printf("Ejecuntado finally");
            if(con != null){
                con.cerrar();
            }
        }*/




    }

}
