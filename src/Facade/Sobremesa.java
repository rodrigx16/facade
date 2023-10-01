package Facade;

public class Sobremesa extends Produto {
    private String tamanho;

    public Sobremesa(String descricao, double preco, String tamanho) {
        super(descricao, preco);
        this.tamanho = tamanho;
    }

    public String getTamanho() { // Correção no nome do método
        return tamanho;
    }

    public void setTamanho(String tamanho) { // Método set correspondente
        this.tamanho = tamanho;
    }
}
