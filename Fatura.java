import java.util.ArrayList;
import java.util.Scanner;

class Fatura {
    private String numeroDaFatura;
    //private String nif;
    private String cliente;
    private String data;
    //add array list

    //////getters///////
    public String getCliente() {
        return cliente;
    }

    public String getNumeroDaFatura() {
        return numeroDaFatura;
    }

    public String getData() {
        return data;
    }

    ////////setters///////
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setNumeroDaFatura(String numeroDaFatura){
        this.numeroDaFatura=numeroDaFatura;
    }

    public void  setData(String data){
        this.data=data;
    }

    //fatura

    public Fatura(){}

    public  Fatura(String numeroDaFatura, String Cliente, String data ){
        this.data=data;
        this.numeroDaFatura=numeroDaFatura;
        this.cliente=Cliente;
    }

    public  void criarFatura(){
       Scanner dado= new Scanner(System.in);

        System.out.println("\n Qual e o numero da fatura");
        this.numeroDaFatura=dado.nextLine();

        System.out.println("\n Qual e o Nome do cliente da fatura nr: "+this.numeroDaFatura);
        this.cliente=dado.nextLine();

        System.out.println("\n Qual e a Data da fatura nr:"+this.numeroDaFatura);
        this.data=dado.nextLine();

    }

    //gerar faturas para o cliente
    public void addFatura(){
        Fatura fatura= new Fatura();
        fatura.setCliente(this.cliente);
        fatura.setNumeroDaFatura(this.numeroDaFatura);
        fatura.setData(this.data);
        System.out.println("\n Fatura adicionada com sucesso");
    }

    //colocar podutos na fatura
    public void colocarProdutosNaFatura(){
        produtos = new ArrayList<>();
        boolean verificar=true;
        boolean erro=false;
        Scanner dados= new Scanner(System.in);

        while (verificar){
            if (!erro){
                gerarProdutos();
                System.out.println("Deseja dicionar outra fatura?(digite: s/n)");
            }else System.out.println("ERRO, tente novamente.(s/n) ");


        }
    }
    @Override
    public String toString() {
        return "\nFATURA\nFatura nr:"+ this.numeroDaFatura+"\nNome Do Cliente: "+this.cliente+"\nData: "+this.data;
    }
}
