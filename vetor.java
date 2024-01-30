import java.util.Scanner;


public class vetor {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = leia.nextInt();
        Object vetor[] = new Object[tamanho];

        for(int i = 0;i<tamanho;i++){
            System.out.println("Unidade "+(i+1)+": ");
            if (leia.hasNextInt()){
                vetor[i] = leia.nextInt();
            }else{
                vetor[i] = leia.next();
            }
        }
        System.out.println("Vetor escolhido: " );
        for (int i = 0; i<tamanho;i++) {
            System.out.print("Vetor " + i + ": " + vetor[i]+" - ");
        }
    }
}
