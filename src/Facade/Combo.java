package Facade;

public class Combo {
    private Bebida bebida;
    private Burger burger;
    private Sobremesa sobremesa;
    private Produto produto;

    public void CriarCombo(int tipo) {
        if (tipo == 1) {
            produto = new Produto("Combo Master", 32.00);
            bebida = new Bebida("Coca-Cola", 3.90, 500);
            burger = new Burger("Hamburger", 15.00, 220);
            sobremesa = new Sobremesa("Sorvete de Baunilha", 10.00, "Médio");
        } else if (tipo == 2) {
            produto = new Produto("Super Combo", 32.00);
            bebida = new Bebida("Pepsi", 6.00, 1000);
            burger = new Burger("Hamburger", 22.00, 350);
            sobremesa = new Sobremesa("Sorvete de Baunilha", 16.00, "Grande");
        } else {
            System.out.println("Opção inválida");
        }
    }

    @Override
    public String toString() {
        return "Combo:\n" +
                "Produto: " + produto.getDescricao() + " - Preço: " + produto.getPreco() + " R$\n" +
                "Bebida: " + bebida.getDescricao() + ", Preço: " + bebida.getPreco() + " R$, mL: " + bebida.getMl() + " mL\n" +
                "Burger: " + burger.getDescricao() + ", Preço: " + burger.getPreco() + " R$, Gramas: " + burger.getGramas() + " g\n" +
                "Sobremesa: " + sobremesa.getDescricao() + ", Preço: " + sobremesa.getPreco() + " R$, Tamanho: " + sobremesa.getTamanho();
    }
}
