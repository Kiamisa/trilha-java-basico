public class TiposVariaveis {
    public static void main(String[] args) {
        // Tipos inteiros
        byte numeroByte = 100;
        short numeroShort = 30000;
        int numeroInt = 2000000000;
        long numeroLong = 9000000000000000000L;
        
        System.out.println("Tipos inteiros:");
        System.out.println("byte: " + numeroByte);
        System.out.println("short: " + numeroShort);
        System.out.println("int: " + numeroInt);
        System.out.println("long: " + numeroLong);

        // Tipos de ponto flutuante
        float numeroFloat = 5.75f;
        double numeroDouble = 19.99d;
        
        System.out.println("\nTipos de ponto flutuante:");
        System.out.println("float: " + numeroFloat);
        System.out.println("double: " + numeroDouble);

        // Tipo caractere
        char caractere = 'A';
        System.out.println("\nTipo caractere:");
        System.out.println("char: " + caractere);

        // Tipo booleano
        boolean booleano = true;
        System.out.println("\nTipo booleano:");
        System.out.println("boolean: " + booleano);

        // Tipos de referência
        String texto = "Olá, Mundo!";
        System.out.println("\nTipo String:");
        System.out.println("String: " + texto);

        // Conversão de tipos
        System.out.println("\nConversão de tipos:");
        int numeroInt2 = (int) numeroDouble; // conversão de double para int
        System.out.println("double para int: " + numeroInt2);

        double numeroDouble2 = numeroInt; // conversão automática de int para double
        System.out.println("int para double: " + numeroDouble2);

        // Conversão entre tipos inteiros
        numeroByte = (byte) numeroInt; // conversão de int para byte
        System.out.println("int para byte: " + numeroByte);

        numeroShort = numeroByte; // conversão automática de byte para short
        System.out.println("byte para short: " + numeroShort);

        // Conversão explícita de tipos
        numeroByte = 100;
        numeroShort = numeroByte;
        numeroByte = (byte) numeroShort;
        System.out.println("\nConversão explícita de tipos:");
        System.out.println("numeroByte após conversão: " + numeroByte);
    }
}
