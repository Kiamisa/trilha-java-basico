public class EstruturasCondicionais {
    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 17.0;

        // Estrutura condicional if
        if (valorSolicitado <= saldo) {
            saldo -= valorSolicitado;
            System.out.println("Saque realizado. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }

        // Outra condição if com else
        double saldo2 = 10.0;
        double valorSolicitado2 = 20.0;

        if (valorSolicitado2 <= saldo2) {
            saldo2 -= valorSolicitado2;
            System.out.println("Saque realizado. Novo saldo: " + saldo2);
        } else {
            System.out.println("Saldo insuficiente.");
        }

        // Estrutura condicional com if-else if-else
        int nota = 85;

        if (nota >= 90) {
            System.out.println("Conceito: A");
        } else if (nota >= 80) {
            System.out.println("Conceito: B");
        } else if (nota >= 70) {
            System.out.println("Conceito: C");
        } else if (nota >= 60) {
            System.out.println("Conceito: D");
        } else {
            System.out.println("Conceito: F");
        }

        // Operador ternário
        double saldo3 = 50.0;
        double valorSolicitado3 = 30.0;
        String resultado = (valorSolicitado3 <= saldo3) ? "Saque realizado" : "Saldo insuficiente";
        System.out.println(resultado);
    }
}
