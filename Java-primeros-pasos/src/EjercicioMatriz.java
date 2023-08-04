public class EjercicioMatriz {
    public static void main(String[] args) {

        for (int fila = 0; fila <= 10; fila++) {
            for (int col = 0; col <= 10; col++){
                System.out.println("*");
                if(col>fila){
                    break;
                }

            }
            System.out.println();
        }
    }
}
