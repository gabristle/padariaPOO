public class Salgado extends Produto implements VariacaoPreco{
    private String recheio;
    private String tipo;

    public Salgado() {
        recheio = "";
        tipo = "";
    }

    public String getRecheio() {
        return recheio;
    }
    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public float descontoAVista() {
        setPrecoAVista(getPreco()-(getPreco()*0.15f));
        return getPrecoAVista();
    }
}
