import java.util.ArrayList;
import java.util.List;

public class Ex04 {

    public static void main(String [] args) {

        /* 4) Crie um ArrayList chamado "palavras" e adicione algumas palavras.
        Exiba o tamanho do ArrayList. */

        List<String> palavras = new ArrayList<String>();

        palavras.add("Saosin");
        palavras.add("Silverstein");
        palavras.add("Alexisonfire");

        System.out.println(palavras.size());

    }

}
