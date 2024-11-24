import java.util.Random;
import java.util.Scanner;

class Cliente {
    private String cliente;
    private String nif;
    private String localizacao;

    //////////getters////////
    public String getCliente() {
        return cliente;
    }

    public String getNif() {
        return nif;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    //////setters//////
    public void setcliente(String cliente) {
        this.cliente = cliente;
    }

    public void setlocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setnif(String nif) {
        this.nif = nif;
    }


    ////Criar cliente
    public Cliente() {
    }

    public Cliente(String cliente, String nif, String localizacao) {
        this.cliente = cliente;
        this.nif = nif;
        this.localizacao = localizacao;
    }

    public void criarCliente() {
        Scanner dado = new Scanner(System.in);//Scanner

        System.out.println("\n Nome Do Cliente que deseja Adicionar");
        setcliente(dado.nextLine());

        System.out.println("\n NIF Do Sr/Sra" + this.cliente);
        setnif(dado.nextLine());

        System.out.println("\n Localizaçao Do Sr/Sra" + this.cliente);
        setlocalizacao(dado.nextLine());

    }

    public void editarNome(){
        Scanner dado = new Scanner(System.in);//Scanner

        System.out.println("\n Novo nome (nome anterior: "+this.cliente+")");
         String cliente=dado.nextLine();
        //verificar se o nome e igual ao anterior
        if ((cliente.toLowerCase().trim()).equals((this.cliente).toLowerCase().trim())) {
            System.out.println("\n O nome e Identico ao anterior(nome anterior=>''"+this.cliente+"''' \n Nome Atual=>''"+cliente+"''" );
            return;
        }

        this.cliente=cliente;


    }

    public void editarNif(){
        Scanner dado = new Scanner(System.in);//Scanner

        System.out.println("\n Novo Nif (Nif anterior: "+this.nif+")");
        String nif=dado.nextLine();
        //verificar se o nif e igual ao anterior
        if ((nif.toLowerCase().trim()).equals((this.nif).toLowerCase().trim())) {
            System.out.println("\n O NIF é Identico ao anterior(Nif anterior=>''"+this.nif+"''' \n Nif Atual=>''"+nif+"''" );
            return;
        }

        this.nif=nif;
    }

    public void editarLocalizacao(){
        Scanner dado = new Scanner(System.in);//Scanner

        System.out.println("\n Novo nome (nome anterior: "+this.localizacao+")");
        String localizacao =dado.nextLine();
        //verificar se a localizaçao e igual ao anterior
        if ((localizacao.toLowerCase().trim()).equals((this.localizacao).toLowerCase().trim())) {
            System.out.println( "\n O nome e Identico ao anterior(nome anterior=>''"+this.localizacao+"''' \n Nome Atual=>''"+ localizacao +"''" );
            return;
        }

        this.localizacao= localizacao;
    }

    @Override
    public String toString() {
        return "Nome do Cliente: " + cliente + " || Nif do Cliente: " + nif + " || Localizaçao do Cliente: " + localizacao;
    }
}
