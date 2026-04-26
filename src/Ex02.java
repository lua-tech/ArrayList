import java.util.ArrayList;
import java.util.List;

public class Ex02 {

    public static void main(String [] args) {

        /* 2) Crie um ArrayList chamado "numeros" e adicione os números 1, 2, 3, 4 e
        5. Logo depois verifique se o número 3 está presente no ArrayList e exiba
        uma mensagem indicando o resultado. */

        // instanciar a classe new ArrayList com números inteiros (integer)
        List<Integer> numeros = new ArrayList<Integer>();

        // adicionar os números de 1 a 5
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        // verificar se o número está presente no ArrayList com estrutura de controle
        if (numeros.contains(3)) {
            System.out.println("Existe o número 3 no ArrayList.");
        } else {
            System.out.println("Não existe o número 3.");
        }

    }
}
