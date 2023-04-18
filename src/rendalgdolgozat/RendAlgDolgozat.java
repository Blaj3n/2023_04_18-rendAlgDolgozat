package rendalgdolgozat;

public class RendAlgDolgozat {

    public static int szamok[] = {5, 10, 15, 20, 25, 46, 13, 89, 45, 87};

    public static void main(String[] args) {
        tombRendezes(szamok);
        kiir();
    }

    public static int[] tombRendezes(int[] szamok) {
        int n = szamok.length;
        int[] rendezett = {};
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = szamok[i];
                int j = i;
                while (j >= gap && szamok[j - gap] > key) {
                    szamok[j] = szamok[j - gap];
                    j -= gap;
                }
                szamok[j] = key;
                rendezett.push(key);
            }
        }
        return rendezett;
        kiir();
    }

    private static void kiir() {
        System.out.println(rendezett);
    }
}
