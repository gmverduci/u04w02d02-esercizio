import java.util.*;

public class Esercizio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti numeri casuali vuoi?");
        int N = scanner.nextInt();

        List<Integer> listaRandom = creaListaRandom(N);
        System.out.println("Lista casuale: " + listaRandom);

        List<Integer> listaDuplicata = nuovaLista(listaRandom);
        System.out.println("Lista duplicata in ordine inverso: " + listaDuplicata);

        System.out.println("Numeri in posizioni pari:");
        stampa(listaRandom, true);

        System.out.println("Numeri in posizioni dispari:");
        stampa(listaRandom, false);
    }

    public static List<Integer> creaListaRandom(int N) {
        List<Integer> listaRandom = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            listaRandom.add(random.nextInt(101));
        }
        Collections.sort(listaRandom);
        return listaRandom;
    }

    public static List<Integer> nuovaLista(List<Integer> lista) {
        List<Integer> listaDuplicata = new ArrayList<>(lista);
        Collections.reverse(listaDuplicata);
        List<Integer> listaCompleta = new ArrayList<>(lista);
        listaCompleta.addAll(listaDuplicata);
        return listaCompleta;
    }

    public static void stampa (List<Integer> lista, boolean pari) {
        for (int i = 0; i < lista.size(); i++) {
            if (pari && i % 2 == 0) {
                System.out.println(lista.get(i) + " - Posizione: " + i);
            } else if (!pari && i % 2 != 0) {
                System.out.println(lista.get(i) + " - Posizione: " + i);
            }
        }
    }
}
