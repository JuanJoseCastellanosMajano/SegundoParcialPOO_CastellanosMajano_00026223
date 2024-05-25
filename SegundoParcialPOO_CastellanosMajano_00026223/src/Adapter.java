public class Adapter implements ClientInterface{

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = (realizarPago("usuario1", "contrasenia1")+":");;
    }

    @Override
    public String realizarPago(String user,String password) {

        return ("");
    }

}
