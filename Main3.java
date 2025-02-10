import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Факториалды есептеу үшін сан енгізіңіз: ");
        int num = scanner.nextInt();
        
        long factorial = 1;
        
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        
        System.out.println(num + "! = " + factorial);
        
        scanner.close();
    }
}
