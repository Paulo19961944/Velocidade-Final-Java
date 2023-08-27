package VelocidadeFinal.com.github.www;
import java.util.Scanner;

public class VelocidadeFinal {
    public static void main(String[] args) {
        /** Chama a Classe Scanner */
        Scanner scanner = new Scanner(System.in);

        /** Pega os Dados de Entrada */
        System.out.println();
        System.out.println("************ VELOCIDADE FINAL ************");
        System.out.println();

        /** Pega os Dados do Pneu */
        System.out.print("Digite a Largura do Pneu: ");
        int larguraPneu = scanner.nextInt();
        System.out.print("Digite a Altura do Pneu: ");
        int alturaPneu = scanner.nextInt();
        System.out.print("Digite o Aro da Roda: ");
        int aroRoda = scanner.nextInt();

        /** Pega os Dados da Marcha */
        System.out.print("Digite a Relação da Primeira Marcha: ");
        float relacaoPrimeira = scanner.nextFloat();
        System.out.print("Digite a Relação da Segunda Marcha: ");
        float relacaoSegunda = scanner.nextFloat();
        System.out.print("Digite a Relação da Terceira Marcha: ");
        float relacaoTerceira = scanner.nextFloat();
        System.out.print("Digite a Relação da Quarta Marcha: ");
        float relacaoQuarta = scanner.nextFloat();
        System.out.print("Digite a Relação da Quinta Marcha: ");
        float relacaoQuinta = scanner.nextFloat();
        System.out.print("Digite a Relação do Diferencial: ");
        float relacaoDiferencial = scanner.nextFloat();
        System.out.print("Digite a RPM Maxima: ");
        int RPM = scanner.nextInt();

        /** Faz os Calculos do Pneu */
        float larguraPneuCorrigida = (float) larguraPneu / 10;
        float alturaPneuCorrigida = (float) alturaPneu / 100;
        float circuferenciaPneu = (float) (((larguraPneuCorrigida * alturaPneuCorrigida * 2) + (aroRoda * 2.54)) * 3.141592 / 100);

        /** Calcula a Velocidade */
        float velocidadePrimeiraMarcha = (float) ((circuferenciaPneu * RPM * 0.06 )/(relacaoPrimeira * relacaoDiferencial));
        float velocidadeSegundaMarcha = (float) ((circuferenciaPneu * RPM * 0.06 )/(relacaoSegunda * relacaoDiferencial));
        float velocidadeTerceiraMarcha = (float) ((circuferenciaPneu * RPM * 0.06 )/(relacaoTerceira * relacaoDiferencial));
        float velocidadeQuartaMarcha = (float) ((circuferenciaPneu * RPM * 0.06 )/(relacaoQuarta * relacaoDiferencial));
        float velocidadeQuintaMarcha = (float) ((circuferenciaPneu * RPM * 0.06 )/(relacaoQuinta * relacaoDiferencial));

        /** Printa na Tela */
        System.out.println();
        System.out.println("*********** RESULTADO ***********");
        System.out.println();
        System.out.println("A Velocidade Maxima na Primeira Marcha é: " + velocidadePrimeiraMarcha);
        System.out.println("A Velocidade Maxima na Segunda Marcha é: " + velocidadeSegundaMarcha);
        System.out.println("A Velocidade Maxima na Terceira Marcha é: " + velocidadeTerceiraMarcha);
        System.out.println("A Velocidade Maxima na Quarta Marcha é: " + velocidadeQuartaMarcha);
        System.out.println("A Velocidade Maxima na Quinta Marcha é: " + velocidadeQuintaMarcha);
        System.out.println();
        System.out.println("***************** PAULO HENRIQUE AZEVEDO DO NASCIMENTO *****************");
    }
}
