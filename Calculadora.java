import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculos calculos = new Calculos();

        while (true) {
            System.out.println("Escolha uma operação");
            System.out.println("\n1 para soma\n2 para subtração\n3 para multiplicação\n4 para divisão\n5 para potência \n6 para raíz quadrada");
            System.out.println("----------------------");
            char escolha = scanner.next().charAt(0);
            if(escolha <'1' || escolha>'7'){
                System.out.println("Opção inválida, digite novamente.");
                escolha = scanner.next().charAt(0);
            }
            scanner.nextLine();
            if (escolha >='1' && escolha <='5') {
                System.out.println("Digite o primeiro número: ");
                    double n1 = scanner.nextDouble();
                System.out.println("Digite o segundo número: ");
                    double n2 = scanner.nextDouble();
                switch (escolha) {
                    case '1':
                        System.out.println("A soma dos números é: "+calculos.adicao(n1, n2));
                        break;
                    case '2':
                        System.out.println("A diferença dos números é: "+calculos.subtracao(n1, n2));
                        break;
                    case '3':
                        System.out.println("O produto é: "+calculos.multiplicacao(n1, n2));
                        break;
                    case '4':
                        calculos.divisao(n1, n2);
                        break;
                    case '5':
                        System.out.println("O resultado é: "+calculos.potencia(n1, n2));
                        break;                    
                }
                
            }else if(escolha == '6'){
                System.out.println("Digite o número: ");
                double n1 = scanner.nextDouble();
                System.out.println("O resultado da raíz quadrada é: "+calculos.raiz(n1));
            }
            
            System.out.println("\nPara sair digite 'Q', para continuar digite 'C'. ");
            String sair = scanner.next();
            if (sair.equalsIgnoreCase("Q")) {
                System.out.println("Encerrando...");
                break;
            }else if(sair.equalsIgnoreCase("C")){
                continue;
            }
        }
        scanner.close();
    }   
    
}