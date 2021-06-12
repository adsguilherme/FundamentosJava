// 1 - pacote é um conjunto de classes
package fundamentos;

// 2 - Bibliotecas
import java.util.Scanner; // Letra maiúscula é sempre Classe (exemplo da palavra Scanner)

// 3 - Classe
public class Medidas {

    // 3.1 Atributos (cacterísticas)

    static Scanner entrada = new Scanner(System.in);

    // 3.2 Métodos e Funções (sem retorno) e Funções (com retorno)

    public static void main(String[] args) {
        // void é o método
        // o primeiro método sempre será o main
        // A chave {} delimita a abertura e fechamento do método

        String opcao;
        int area = 0; // Receber o resultado dos cálculos de área

        // entrada = new Scanner(System.in); // Instanciar o objeto de leitura do console

        System.out.println("Escolha o Cálculo Desejado");
        System.out.println("(1) - Área do Quadrado");
        System.out.println("(2) - Área do Retangulo");
        System.out.println("(3) - Área do Triângulo");
        System.out.println("(4) - Área do Circulo");

        opcao = entrada.nextLine(); // Leitura da opção
        switch(opcao){
            case "1":
                area = calcularAreaDoQuadrado();
                break;
            default:
                System.out.println("Opção inválida: " + opcao);
        }
    if (area > 0) {
        System.out.println("A área é de " + area + "m²");
    }
        // out e in são muito usados
    }

    public static int calcularAreaDoQuadrado() {

        // calcularAreaDoQuadrado é um método

        int lado; // Tamanho do lado do quadrado

        //Scanner é uma Classe
        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); // Leitura do tamanho do lado
        return lado * lado; // Retorna a área do quadrado

        // Método deve chamar a função

    }


}
