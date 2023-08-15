import java.util.*;

public class exercicio05 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    Vector<Integer> v = new Vector<Integer>(n);
    Vector<Integer> v2 = new Vector<Integer>(n * 2);
    Vector<Integer> vChecked = new Vector<Integer>(n);

    for (int i = 0; i < n; i++)
      v.add(scan.nextInt());

    int c = 0;
    for (int i = 0; i < n; i++) {
      int elem = v.get(c);
      int qtd = 0;

      if (!vChecked.contains(elem)) {
        vChecked.add(elem);
        v2.add(elem);

        for (int j = 0; j < n; j++)
          if (v.get(j) == elem)
            qtd += 1;

        v2.add(qtd);
      }

      c++;
    }

    for (int i = 0; i < v2.size(); i++)
      System.out.print(v2.get(i) + " ");

  }
}
