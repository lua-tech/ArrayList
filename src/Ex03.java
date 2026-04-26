import java.util.ArrayList;
import java.util.List;

public class Ex03 {

    public static void main(String[] args) {

        /* 3) Crie um ArrayList chamado "idades" e adicione algumas idades. Use um
            loop for para exibir todas as idades presentes no ArrayList. */

        List<Integer> idades = new ArrayList<Integer>();

        idades.add(67);
        idades.add(30);
        idades.add(15);

        for (int i = 0; i < idades.size(); i++) {
            System.out.println("A idade é: " + idades.get(i));
        }

    }

}
