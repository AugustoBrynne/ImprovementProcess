import java.util.Scanner;

abstract class ProdutoFarmaceuntico extends Produto {
    protected boolean prescricao;
    protected String medicoPrescritor;
    protected String categoria;
   

    public ProdutoFarmaceuntico(){}

    public void CriarProdutoFarmaceuntico(){
        Scanner dado= new Scanner(System.in);

        boolean verificador=true;
        System.out.println("\n É um produto com Prescriçao?(s ou n)");

        while (verificador) {
            String v=dado.nextLine();

            switch (v.toLowerCase().trim()){
                case "s":
                    this.prescricao=true;
                    verificador=false;
                    break;
                case "n":
                    this.prescricao=false;
                    verificador=false;
                default:
                    System.out.println("\n Opçao Invalida.  É um produto com Prescriçao?** S(sim) ou N(nao)***\n");
            }
        }
        verificador=true;

        String[] categ = new String[]{"beleza","animais","bem-estar","bebés","outro"};

        //Farmaceuticos com prescriçao
        if(prescricao){
            this.medicoPrescritor =dado.nextLine();
            this.categoria=null;

        }else {
            this.medicoPrescritor =null;

           while (verificador) {
               System.out.println("\nCategoria do produto(animal,beleza,bem-estar,bebés,outro) ");

               String categoria=dado.nextLine();

                for (String categor : categ) {
                    if ((categoria.toLowerCase().trim()).equals(categor.trim().toLowerCase())) {
                        this.categoria = categoria;
                        System.out.println("\nCategoria valida: "+this.categoria);
                        verificador=false;
                    }
                    if (this.categoria == null)
                        System.out.println("\nCategoria invalida, tente outra vez");
                }
           }
        }
    }

    public double imposto (){


        if (this.prescricao){
            switch ((super.localizacao).trim().toLowerCase()){
                case "continente":
                    super.setImpostos(6);
                    break;
                case "madeira":
                    super.setImpostos(5);
                    break;
                case "açores":
                    super.setImpostos(4);
                    break;
                default:
                    System.out.println("\nLocalizaçao Desconhecida '''"+super.localizacao+"'''");
                    super.setImpostos(0);
            }


        }else{
            switch ((super.localizacao).trim().toLowerCase()){
                case "continente":
                case "madeira":
                case "açores":
                    super.setImpostos(23);

                    //reduzir 1% se for da categoria "animal"
                    if ((this.categoria.toLowerCase().trim()).equals("animal"))
                        super.setImpostos(getImpostos()-1);

                    break;

                default:
                    System.out.println("\nLocalizaçao Desconhecida '''"+super.localizacao+"'''");
                    super.setImpostos(0);
            }
        }
        return super.getImpostos();//tambem colocar como protected
    }

    public double totalComImposto(){
        this.setValComImposto(super.getValorUnitario()+super.getValorUnitario()*(super.getImpostos()*0.01));
        return getValComImposto();//colocar isto como protected
    }

    @Override
    public String toString() {

        if(this.prescricao)
             return super.toString() + "ProdutoFarmaceuntico{" +
                    "prescricao=" + prescricao +
                    ", medicoPrescritor='" + medicoPrescritor + '\'' +
                    ", categoria='" + categoria + '\'' +
                    ", impostos=" + getImpostos() +
                    ", valComImposto=" + getValComImposto() +
                    "} " ;

        else
            return super.toString() + "ProdutoFarmaceuntico{" +
                    ", categoria='" + categoria + '\'' +
                    ", impostos=" + getImpostos() +
                    ", valComImposto=" + getValComImposto() +
                    "} " ;
    }
}
