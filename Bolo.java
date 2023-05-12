//Ronaldo Adriano de Azevedo Júnior
//2101483

public class Bolo extends Produto implements VariacaoPreco{
    private String massa;
    private String recheio;
    private String cobertura;
    private int tamanho;
    
    
    public Bolo(){
        massa = "";
        recheio = "";
        cobertura = "";
        tamanho = 0;
    }
    
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
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
    public void setRecheio(String recheio) throws MuitosCaracteresException, PoucosCaractereException{
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
    public String getCobertura() {
        return cobertura;
    }
    public void setCobertura(String cobertura) throws MuitosCaracteresException, PoucosCaractereException{
        if(recheio.length() >= 3){
            if(recheio.length() <= 30){
                this.cobertura = cobertura;
            }else{
                throw new MuitosCaracteresException();
            }
        }else{
            throw new PoucosCaractereException();
        }
    }

    public void switchBolo(int opcao){
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

    public void switchBolo(char opcao){
        switch(opcao){
            case 'P':
            setTamanho(1);
            break;

            case 'M':
            setTamanho(2);
            break;

            case 'G':
            setTamanho(3);
            break;

            case 'p':
            setTamanho(1);
            break;

            case 'm':
            setTamanho(2);
            break;

            case 'g':
            setTamanho(3);
            break;

            default:
            System.out.println("Opcao Invalida");
            break;
        }
    }

    public final float precoBolo(){
        if(getTamanho() == 1){
            setPreco(40);
        } else if(getTamanho() == 2){
            setPreco(60);
        } else if(getTamanho() == 3){
            setPreco(80);
        }
        return getPreco();
    }

    public float descontoAVista() {
        setPrecoAVista(precoBolo()-(precoBolo()*0.15f));
        return getPrecoAVista();
    }

    //sobrescrita
    public void impNota() {
        System.out.println("-------------------------");
        System.out.println("=========================");
        System.out.println("       NOTA PEDIDO       ");
        System.out.println("=========================");
        System.out.println(" PRODUTO: \n" +getNome());
        System.out.println("=========================");
        System.out.println("Massa: " +getMassa());
        System.out.println("Recheio: " +getRecheio());
        System.out.println("Cobertura: " +getCobertura());
        System.out.println("Tamanho: " +getTamanho());
        System.out.println("=========================");
        System.out.println("Valor: " +precoBolo());
        System.out.println("Valor a Vista: " +descontoAVista());
        System.out.println("=========================");
        System.out.println("NOME: " +getPedido().getNomeCliente());
        System.out.println("COMANDA: " +getPedido().getComanda());
        System.out.println("-------------------------");
    }
}
