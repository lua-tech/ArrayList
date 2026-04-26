import java.util.ArrayList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {

            // 1) Crie um ArrayList chamado "nomes" e adicione os nomes "Ana", "João" e
            //"Maria". Logo depois remova o nome "João" do ArrayList.

            // instanciando a lista
            List<String> nomes = new ArrayList<String>();

            // adicionando os nomes
            nomes.add("Ana");
            nomes.add("João");
            nomes.add("Maria");

            // removendo o nome joão
            nomes.remove("João");

            // exibindo os nomes restantes
            System.out.println(nomes);

            }
    }