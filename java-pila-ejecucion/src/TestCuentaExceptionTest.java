public class TestCuentaExceptionTest {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        try {
            cuenta.deposita();
        } catch (MiException e) {
            throw new RuntimeException(e);
        }
    }
}
