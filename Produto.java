public abstract class Produto{
    private String nome;
    private float preco;
    private float precoAVista;
    private Pedido pedido;    
    
    public Produto(){
        nome = "";
        preco = 0;
        precoAVista = 0;
        pedido = new Pedido();
    }
    
    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPrecoAVista() {
        return precoAVista;
    }

    public void setPrecoAVista(float precoAVista) {
        this.precoAVista = precoAVista;
    }

    public abstract void impNota();
}
