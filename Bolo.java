public class Bolo extends Produto implements VariacaoPreco{
    private String massa;
    private String recheio;
    private String cobertura;
    
    public Bolo(){
        massa = "";
        recheio = "";
        cobertura = "";
    }

    public String getMassa() {
        return massa;
    }
    public void setMassa(String massa) {
        this.massa = massa;
    }
    public String getRecheio() {
        return recheio;
    }
    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }
    public String getCobertura() {
        return cobertura;
    }
    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public void switchBolo(char opcao){
        switch(opcao){
            case 1:
            setMassa("Chocolate");
            break;

            case 2:
            setMassa("Baunilha");
            break;

            case 3:
            setMassa("Red Velvet");
            break;

            case 4:
            setMassa("Cenoura");
            break;

            case 5:
            setMassa("Mesclado");
            break;

            default:
            System.out.println("Opcao Invalida");
            break;
        }
    }

    public float descontoAVista() {
        setPrecoAVista(getPreco()-(getPreco()*0.15f));
        return getPrecoAVista();
    }
}
