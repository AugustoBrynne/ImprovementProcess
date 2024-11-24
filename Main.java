//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static String Yel;

    public static void main(String[] args) {
        Cliente cliente= new Cliente();
        Cliente yel= new Cliente("Yel Afonso", "1451145","Açores");

        System.out.println(yel);

        cliente.criarCliente();
        System.out.println(cliente);


        cliente.editarNome();
        cliente.editarNif();
        System.out.println(cliente);

        Fatura fatu= new Fatura();
        Fatura fatuPrech= new Fatura("21254552","Yel Saiete","22/07/2005");

        fatu.criarFatura();

        System.out.println(fatuPrech);

        System.out.println(fatu);

    }


}