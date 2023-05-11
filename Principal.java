//Ronaldo Adriano de Azevedo Júnior
//2101483

public class Principal{
    public static void main(String arg[]){
        Leitura l = new Leitura();
        Bolo bolo = new Bolo();
        Cafe cafe = new Cafe();
        Salgado salgado = new Salgado();
        String cliente = "";
        int nComanda = 0;
        int opcao = 0;
        boolean vai = true;

        System.out.println("=====================================");
        System.out.println("         Registro de Pedidos");
        System.out.println("=====================================");
        cliente = l.entDados("Nome do Cliente: ");
        nComanda = Integer.parseInt(l.entDados("Comanda: "));
        while(vai){
            System.out.println("=====================================");
            System.out.println("Produtos:");
            System.out.println("1 - Bolo");
            System.out.println("2 - Cafe");
            System.out.println("3 - Salgado");
            System.out.println("4 - Sair");
            try{
                opcao = Integer.parseInt(l.entDados("Digite sua opcao:  "));
                break;
            }
            catch(NumberFormatException nfe){
                System.out.println("Deve digitar um numero!");
            }
            switch(opcao){
                case 1:
                bolo.getPedido().setNomeCliente(cliente);
                bolo.getPedido().setComanda(nComanda);
                bolo.setNome("Bolo ");
                do{
                    System.out.println("Sabores de massa disponiveis:");
                    System.out.println("1 - Chocolate");
                    System.out.println("2 - Baunilha");
                    System.out.println("3 - Red Velvet");
                    System.out.println("4 - Cenoura");
                    System.out.println("5 - Mesclado");
                    try{
                        bolo.switchBolo(Integer.parseInt(l.entDados("Selecione o sabor desejado: ")));
                        break;
                    }
                    catch(NumberFormatException nfe){
                        System.out.println("Deve digitar um numero!");
                    }
                }while(bolo.getMassa() != "Chocolate" && bolo.getMassa() != "Baunilha" && bolo.getMassa() != "Red Velvet" && bolo.getMassa() != "Cenoura" && bolo.getMassa() != "Mesclado");
                while(vai){
                    try{
                        bolo.setRecheio(l.entDados("Sabor do recheio: "));
                        break;
                    }
                    catch(PoucosCaractereException pce){
                        pce.impPoucosCaracException();
                    }
                    catch(MuitosCaracteresException mce){
                        mce.impMuitosCaracException();
                    }
                }
                while(vai){
                    try{
                        bolo.setCobertura(l.entDados("Sabor da cobertura: "));
                        break;
                    }
                    catch(PoucosCaractereException pce){
                        pce.impPoucosCaracException();
                    }
                    catch(MuitosCaracteresException mce){
                        mce.impMuitosCaracException();
                    }
                }
                do{
                    System.out.println("Tamanho dos bolos:");
                    System.out.println("P - Pequeno (1kg)");
                    System.out.println("M - Medio (2kg)");
                    System.out.println("G - Grande (3kg)");
                    bolo.switchBolo(l.entDados("Selecione o tamanho do bolo:").charAt(0));
                }while(bolo.getTamanho() != 1 && bolo.getTamanho() != 2 && bolo.getTamanho() != 3);
                break;

                case 2:
                cafe.getPedido().setNomeCliente(cliente);
                cafe.getPedido().setComanda(nComanda);
                cafe.setNome("Cafe ");
                do{
                    System.out.println("Deseja adicionar leite ao cafe?");
                    System.out.println("S - Sim");
                    System.out.println("N - Nao");
                    cafe.switchCafe(l.entDados("Digite sua opcao: ").charAt(0));
                }while(cafe.getLeite() != "Sim" && cafe.getLeite() != "Nao");
                do{
                    System.out.println("Tamanhos:");
                    System.out.println("1 - Pequeno(100ml)");
                    System.out.println("2 - Medio(250ml)");
                    System.out.println("3 - Grande(400ml)");
                    try{
                        cafe.switchCafe(Integer.parseInt(l.entDados("Selecione o tamanho desejado: ")));
                        break;
                    }
                    catch(NumberFormatException nfe){
                        System.out.println("Deve digitar um numero!");
                    }
                }while(cafe.getTamanho() != 1 && cafe.getTamanho() != 2 && cafe.getTamanho() != 3);
                break;

                case 3:
                salgado.getPedido().setNomeCliente(cliente);
                salgado.getPedido().setComanda(nComanda);
                salgado.setNome("Salgado ");
                do{
                    System.out.println("Escolha o tipo de salgado: ");
                    System.out.println("1 - Frito");
                    System.out.println("2 - Assado");
                    try{
                        salgado.switchSalgado(Integer.parseInt(l.entDados("Digite a opcao: ")));
                        break;
                    }
                    catch(NumberFormatException nfe){
                        System.out.println("Deve digitar um numero!");
                    }
                }while(salgado.getTipo() != "Frito" && salgado.getTipo() != "Assado");
                while(vai){
                    try{
                        salgado.setRecheio(l.entDados("Escolha o recheio: "));
                        break;
                    }
                    catch(PoucosCaractereException pce){
                        pce.impPoucosCaracException();
                    }
                    catch(MuitosCaracteresException mce){
                        mce.impMuitosCaracException();
                    }
                }
                break;

                case 4:
                vai = false;
                break;

                default:
                System.out.println("Opcao Invalida");
                break;
            }
        }
    }
}