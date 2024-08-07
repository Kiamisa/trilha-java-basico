public class EstruturasRepeticao {
    public static void main(String[] args) {

        // Estrutura de repetição for
        System.out.println("Estrutura for:");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        // Estrutura de repetição while
        System.out.println("\nEstrutura while:");
        int j = 0;
        while (j < 5) {
            System.out.println("j = " + j);
            j++;
        }

        // Estrutura de repetição do-while
        System.out.println("\nEstrutura do-while:");
        int k = 0;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k < 5);

        // Exemplo de uso de break e continue
        System.out.println("\nUso de break e continue:");
        for (int m = 0; m < 10; m++) {
            if (m == 3) {
                continue; // pula a iteração atual quando m é 3
            }
            if (m == 7) {
                break; // sai do loop quando m é 7
            }
            System.out.println("m = " + m);
        }

        // Estrutura de repetição aninhada
        System.out.println("\nEstrutura de repetição aninhada:");
        for (int x = 1; x <= 3; x++) {
            for (int y = 1; y <= 3; y++) {
                System.out.println("x = " + x + ", y = " + y);
            }
        }
    }
}
