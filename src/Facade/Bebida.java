package Facade;

public class Bebida extends Produto {
    private int mL;

    public Bebida(String descricao, double preco, int mL) {
        super(descricao, preco);
        this.mL = mL;
    }

    public int getMl() { // Correção no nome do método
        return mL;
    }

    public void setMl(int mL) { // Método set correspondente
        this.mL = mL;
    }
}