public class Operadores {
    public static void main(String[] args) {
        // Operadores aritméticos
        int a = 10;
        int b = 5;
        System.out.println("Operadores aritméticos:");
        System.out.println("a + b = " + (a + b)); // Adição
        System.out.println("a - b = " + (a - b)); // Subtração
        System.out.println("a * b = " + (a * b)); // Multiplicação
        System.out.println("a / b = " + (a / b)); // Divisão
        System.out.println("a % b = " + (a % b)); // Módulo
        
        // Operadores de incremento e decremento
        System.out.println("\nOperadores de incremento e decremento:");
        int c = 10;
        System.out.println("c++ = " + (c++)); // Pós-incremento
        System.out.println("++c = " + (++c)); // Pré-incremento
        System.out.println("c-- = " + (c--)); // Pós-decremento
        System.out.println("--c = " + (--c)); // Pré-decremento
        
        // Operadores de comparação
        System.out.println("\nOperadores de comparação:");
        System.out.println("a == b = " + (a == b)); // Igualdade
        System.out.println("a != b = " + (a != b)); // Desigualdade
        System.out.println("a > b = " + (a > b)); // Maior que
        System.out.println("a < b = " + (a < b)); // Menor que
        System.out.println("a >= b = " + (a >= b)); // Maior ou igual a
        System.out.println("a <= b = " + (a <= b)); // Menor ou igual a
        
        // Operadores lógicos
        System.out.println("\nOperadores lógicos:");
        boolean x = true;
        boolean y = false;
        System.out.println("x && y = " + (x && y)); // AND lógico
        System.out.println("x || y = " + (x || y)); // OR lógico
        System.out.println("!x = " + (!x)); // NOT lógico
        
        // Operadores bit a bit
        System.out.println("\nOperadores bit a bit:");
        int d = 6;  // 0110 em binário
        int e = 3;  // 0011 em binário
        System.out.println("d & e = " + (d & e)); // AND bit a bit
        System.out.println("d | e = " + (d | e)); // OR bit a bit
        System.out.println("d ^ e = " + (d ^ e)); // XOR bit a bit
        System.out.println("~d = " + (~d)); // Complemento bit a bit
        System.out.println("d << 1 = " + (d << 1)); // Deslocamento à esquerda
        System.out.println("d >> 1 = " + (d >> 1)); // Deslocamento à direita
        System.out.println("d >>> 1 = " + (d >>> 1)); // Deslocamento à direita com preenchimento zero
        
        // Operadores de atribuição
        System.out.println("\nOperadores de atribuição:");
        int f = 10;
        f += 5;
        System.out.println("f += 5: " + f);
        f -= 3;
        System.out.println("f -= 3: " + f);
        f *= 2;
        System.out.println("f *= 2: " + f);
        f /= 4;
        System.out.println("f /= 4: " + f);
        f %= 3;
        System.out.println("f %= 3: " + f);
        f &= 2;
        System.out.println("f &= 2: " + f);
        f |= 1;
        System.out.println("f |= 1: " + f);
        f ^= 3;
        System.out.println("f ^= 3: " + f);
        f <<= 1;
        System.out.println("f <<= 1: " + f);
        f >>= 1;
        System.out.println("f >>= 1: " + f);
        f >>>= 1;
        System.out.println("f >>>= 1: " + f);
        
        // Operador ternário
        System.out.println("\nOperador ternário:");
        int g = (a > b) ? a : b;
        System.out.println("g = (a > b) ? a : b: " + g);
    }
}

