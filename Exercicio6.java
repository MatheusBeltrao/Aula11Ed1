import java.util.*;

public class Exercicio6 {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();

        Random random = new Random();
        
        for (int i = 0; i < 1000; i++) {
            int numero = random.nextInt(Integer.MAX_VALUE);
            fila.offer(numero);
        }
        for (int i = 0; i < 1000; i++) {
            int numero = random.nextInt(Integer.MAX_VALUE) * -1;
            fila.offer(numero);
        }

        while (!fila.isEmpty()) {
            int numero = fila.poll();

            if (numero > 0) {
                pilha.push(numero);
            } else {
                if (!pilha.isEmpty()) {
                    int topoPilha = pilha.pop();
                    System.out.println("Número negativo encontrado: " + numero);
                    System.out.println("Topo da pilha: " + topoPilha);
                }
            }
        }
    }
}
