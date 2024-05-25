public class PagosExtra extends Adapter{

    private String empresa;

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = "Stripe";
    }

    public String realizarnuevopago(){
        System.out.println(super.getToken()+empresa);
        return ("pago en nueva área exitoso");
    }

}

