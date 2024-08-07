public class EstruturasExcepcionais {
    public static void main(String[] args) {
        // Exemplo de try-catch-finally
        System.out.println("Exemplo de try-catch-finally:");
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[3]); // Isso lançará uma exceção ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exceção capturada: " + e);
        } finally {
            System.out.println("Bloco finally executado.");
        }

        // Exemplo de try-catch aninhado
        System.out.println("\nExemplo de try-catch aninhado:");
        try {
            int resultado = dividir(10, 0); // Isso lançará uma exceção ArithmeticException
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Exceção capturada no método main: " + e);
        }

        // Exemplo de lançamento de exceções
        System.out.println("\nExemplo de lançamento de exceções:");
        try {
            verificarIdade(15); // Isso lançará uma exceção personalizada
        } catch (IdadeInvalidaException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }

    public static int dividir(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Exceção capturada no método dividir: " + e);
            throw e; // Relança a exceção para ser capturada pelo chamador
        }
    }

    public static void verificarIdade(int idade) throws IdadeInvalidaException {
        if (idade < 18) {
            throw new IdadeInvalidaException("Idade deve ser maior ou igual a 18.");
        }
    }
}

// Classe de exceção personalizada
class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}
