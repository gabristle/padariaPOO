//Ronaldo Adriano de Azevedo Júnior
//2101483

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
    public void setRecheio(String recheio) throws PoucosCaractereException, MuitosCaracteresException{
        if(recheio.length() >= 3){
            if(recheio.length() <= 30){
                this.recheio = recheio;
            }else{
                throw new MuitosCaracteresException();
            }
        }else{
            throw new PoucosCaractereException();
        }
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void switchSalgado(int opcao){
        switch(opcao){
            case 1:
            setTipo("Frito");
            break;

            case 2:
            setTipo("Assado");
            break;

            default:
            System.out.println("Opcao Invalida");
            break;
        }
    }

    public final float precoSalgado(){
        if(getTipo() == "Frito"){
            setPreco(5);
        } else if(getTipo() == "Assado"){
            setPreco(6);
        }
        return getPreco();
    }

    public float descontoAVista() {
        setPrecoAVista(getPreco()-(getPreco()*0.15f));
        return getPrecoAVista();
    }

    //sobrescrita
    public void impNota() {
        System.out.println("-------------------------");
        System.out.println("=========================");
        System.out.println("       NOTA COMPRA       ");
        System.out.println("=========================");
        System.out.println(" PRODUTO: \n" +getNome());
        System.out.println("=========================");
        System.out.println("Recheio: " +getRecheio());
        System.out.println("Tipo: " +getTipo() + "ml");
        System.out.println("=========================");
        System.out.println("Valor: " +getPreco());
        System.out.println("Valor a Vista: " +getPrecoAVista());
        System.out.println("=========================");
        System.out.println("NOME: " +getPedido().getNomeCliente());
        System.out.println("COMANDA: " +getPedido().getComanda());
        System.out.println("-------------------------");
    }
}
