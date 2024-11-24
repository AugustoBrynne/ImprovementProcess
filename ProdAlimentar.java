import java.util.Scanner;

abstract class ProdAlimentar extends Produto{
    private boolean biologico;
    private String tipoDeTaxa;
    private  int nrDeCertificacoes;
    private String categoria;

    public ProdAlimentar(){}

    public void criarProdAlimentar(){
        Scanner dado =new Scanner(System.in);
        boolean verificador=true;

        String []taxa={"normal","intermedia","reduzida"};

        while(verificador) {
            System.out.println("\nTipo de taxa do Produto Alimentar(normal,intermedia ou reduzida):");
            String tipoDeTaxa =dado.nextLine();

            for(String tax:taxa)
                if ((tipoDeTaxa.trim().toLowerCase()).equals(tax.toLowerCase().trim())){
                    this.tipoDeTaxa=tipoDeTaxa;
                    verificador=false;
                }
            if(verificador)
                System.out.println("\nTipo de taxa do Produto Alimentar== Invalida=== tente outra vez");
        }
        verificador=true;

        if ((this.tipoDeTaxa.trim().toLowerCase()).equals("intermedia")){
            String [] categoria ={"congelados","enlatados", "vinhos"};
            while(verificador) {
                System.out.println("\nTipo de taxa do Produto Alimentar(normal,intermedia ou reduzida):");
                String categ =dado.nextLine();

                for(String cat :categoria)
                    if ((categ.trim().toLowerCase()).equals(cat.toLowerCase().trim())){
                        this.categoria= categ;
                        verificador=false;
                    }
                if (verificador)
                    System.out.println("\nTipo de taxa do Produto Alimentar== Invalida=== tente outra vez");
            }
            verificador=true;


        }

        if ((this.tipoDeTaxa.trim().toLowerCase()).equals("reduzida")){
            System.out.println("O produto alimentar de taxa "+this.tipoDeTaxa+ "tem as certificacoes:");
            int contadorDeCertificacoes=0;
            int i=0;
            while (verificador){
                String []certificacoes={"ISO22000","FSSC22000","HACCP","GMP"};
                System.out.println("O Produto possui Certificaçoes"+certificacoes[i]+"?");
                String v=dado.nextLine();
                contadorDeCertificacoes+=verificar(v,certificacoes[i]);
                i++;
                if(i>=3)
                    verificador=false;

            }
            this.nrDeCertificacoes =contadorDeCertificacoes;
        }

    }


    private int verificar(String simOuNao,String cetificacao){
        Scanner dado=new Scanner(System.in);
        while (true)
            switch (simOuNao.toLowerCase().trim()){
                case "s":
                   return 1;
                case "n":
                    return 0;
                default:
                    System.out.println("\n Opçao Invalida.  É um produto com certificaçao "+ cetificacao +"?** S(sim) ou N(nao)***\n");
                    simOuNao=dado.nextLine();

            }
    }

    public double imposto(){
        int []taxa;
        switch (this.tipoDeTaxa.trim().toLowerCase()){
            case "intermedia":
                taxa=new int []{13,12,9};
                if ((this.categoria.trim().toLowerCase()).equals("vinho"))
                    super.setImpostos(calcularTaxa(taxa)+1);
                else
                    super.setImpostos(calcularTaxa(taxa)+1);


            case "normal":
                taxa=new int []{23,22,16};
                super.setImpostos(calcularTaxa(taxa));

            case "redusida":
                taxa=new int []{6,5,4};
                if (this.nrDeCertificacoes==4)
                    super.setImpostos(calcularTaxa(taxa)-1);
                else
                    super.setImpostos(calcularTaxa(taxa));

        }

        return getImpostos();
    }

    private double calcularTaxa(int [] taxas){
        switch (super.localizacao.trim().toLowerCase()){
            case "continente":
                return taxas[0];

            case "madeira":
                return taxas[1];

            case "açores":
                return taxas[2];

        }
        return 0;
    }

    public double totalComImposto(){
        this.setValComImposto(super.getValorUnitario()+super.getValorUnitario()*(super.getImpostos()*0.01));
        return getValComImposto();
    }


}
