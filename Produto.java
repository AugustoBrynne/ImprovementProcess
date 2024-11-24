abstract class Produto {
    private String codigo;
    private  String nome;
    private String descricao;
    private int quantidade;
    private double valorUnitario;
    protected String localizacao;
    private  double impostos;
    private double valComImposto;
    ////GETTERS//////
    public double getValorUnitario() {
        return valorUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNome() {
        return nome;
    }

    protected double getImpostos() {
        return impostos;
    }

    protected double getValComImposto() {
        return valComImposto;
    }
    ////SETTERS////


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    protected void setImpostos(double impostos) {
        this.impostos = impostos;
    }

    protected void setValComImposto(double valComImposto) {
        this.valComImposto = valComImposto;
    }

    public Produto(){}

    public Produto(String codigo,String nome ,String descricao, int quantidade, double valorUnitario,String localizacao){
        this.codigo=codigo;
        this.nome=nome;
        this.descricao=descricao;
        this.quantidade=quantidade;
        this.codigo=codigo;
        this.valorUnitario=valorUnitario;
        this.localizacao=localizacao;

    }
    //abstracts
    abstract double imposto();
    abstract double totalComImposto();

    @Override
    public String toString() {
        return "Produto{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", valorUnitario=" + valorUnitario +
                '}';
    }
}
