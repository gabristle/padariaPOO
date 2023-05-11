//Ronaldo Adriano de Azevedo Júnior
//2101483

public class Cafe extends Produto implements VariacaoPreco{
    private String leite;
    private int tamanho;
    
    public Cafe(){
        leite = "";
        tamanho = 0;
    }

    public float descontoAVista() {
        setPrecoAVista(getPreco()-(getPreco()*0.05f));
        return getPrecoAVista();
    }

    public String getLeite() {
        return leite;
    }
    public void setLeite(String leite) {
        this.leite = leite;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    //sobrecarga
    public void switchCafe(char opcao){
        switch(opcao){
            case 'S':
            setLeite("Sim");
            break;

            case 'N':
            setLeite("Nao");
            break;

            case 's':
            setLeite("Sim");
            break;

            case 'n':
            setLeite("Nao");
            break;

            default:
            System.out.println("Opcao Invalida!");
            break;
        }
    }

    //sobrecarga
    public void switchCafe(int opcao){
        switch(opcao){
            case 1:
            setTamanho(100);
            break;

            case 2:
            setTamanho(250);
            break;

            case 3:
            setTamanho(400);
            break;

            default:
            System.out.println("Opcao Invalida!");
            break;
        }
    }

    public final float precosCafe(){
        if(getTamanho() == 100){
            setPreco(2);
        } else if(getTamanho() == 250){
            setPreco(4.5f);
        } else if(getTamanho() == 400){
            setPreco(7);
        }
        return getPreco();
    }

    //sobrescrita
    public void impNota() {
        System.out.println("-------------------------");
        System.out.println("=========================");
        System.out.println("       NOTA COMPRA       ");
        System.out.println("=========================");
        System.out.println(" PRODUTO: \n" +getNome());
        System.out.println("=========================");
        System.out.println("Leite? " +getLeite());
        System.out.println("Tamanho: " +getTamanho() + "ml");
        System.out.println("=========================");
        System.out.println("Valor: " +getPreco());
        System.out.println("Valor a Vista: " +getPrecoAVista());
        System.out.println("=========================");
        System.out.println("NOME: " +getPedido().getNomeCliente());
        System.out.println("COMANDA: " +getPedido().getComanda());
        System.out.println("-------------------------");
    }

}
