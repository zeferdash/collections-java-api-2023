package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, int quantidade, double preco){
        carrinhoDeCompras.add(new Item(nome,quantidade,preco));
    }

    public void removerItem(String nome){
        List<Item> removerItemCarrinho = new ArrayList<>();
        for (Item i : carrinhoDeCompras){
            if (i.getNome().equalsIgnoreCase(nome)){
                removerItemCarrinho.add(i);
            }
        }
        carrinhoDeCompras.removeAll(removerItemCarrinho);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        if (!carrinhoDeCompras.isEmpty()){
            for (Item item : carrinhoDeCompras){
                double valorItem = item.getPreco();
                int quantidadeItem = item.getQuantidade();
                valorTotal += valorItem * quantidadeItem;
            }
        }
        return valorTotal;
    }

    public void exibirItens(){
        for (Item item : carrinhoDeCompras){
            if (!carrinhoDeCompras.isEmpty()){
                System.out.println(item.getNome());
                System.out.println(item.getQuantidade());
                System.out.println(item.getPreco());
                System.out.println();
            }else {
                System.out.println("Carrinho de compras vazio");
            }
        }
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras1 = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras1.adicionarItem("Lápis", 3, 2);
        carrinhoDeCompras1.adicionarItem("Lápis",3, 2);
        carrinhoDeCompras1.adicionarItem("Caderno", 1, 35);
        carrinhoDeCompras1.adicionarItem("Borracha", 2, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras1.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras1.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras1.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras1.calcularValorTotal());
    }

}
