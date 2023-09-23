package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public void calcularSoma(){
        int soma = 0;
        for (int numero : numeros){
            soma+= numero;
        }
        System.out.println(soma);
    }

    public int encontrarMaiorNumero(){
        int maior = numeros.get(0);
        for (int numero : numeros){
            if (numero > maior){
                maior = numero;
            }
        }
        System.out.println("O maior número na lista é: " + maior);
        return maior;
    }

    public int encontrarMenorNumero(){
        int menor = numeros.get(0);
        for (int numero : numeros){
            if (numero < menor){
                menor = numero;
            }
        }
        System.out.println("O menor número na lista é: " + menor);
        return menor;
    }

    public void exibirNumeros(){
        System.out.println("Números na lista: ");
        for (int i : numeros){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // Instanciando a lista de numeros
        SomaNumeros numeros1 = new SomaNumeros();

        //Metodo que adiciona um numero na lista
        numeros1.adicionarNumero(1);
        numeros1.adicionarNumero(4);
        numeros1.adicionarNumero(26);

        //Metodo responsavel por calcular a soma
        numeros1.calcularSoma();

        //Metodos responsaveis por encontrar o maior e menor numero na lista
        numeros1.encontrarMaiorNumero();
        numeros1.encontrarMenorNumero();

        //Exibindo todos numeros da lista
        numeros1.exibirNumeros();

    }

}
