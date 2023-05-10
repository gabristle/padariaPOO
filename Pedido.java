public class Pedido {
    private String nomeCliente;
    private int comanda;
    
    public Pedido(){
        nomeCliente = "";
        comanda = 0;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getComanda() {
        return comanda;
    }

    public void setComanda(int comanda) {
        this.comanda = comanda;
    }
}
