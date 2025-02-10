import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Бірінші санды енгізіңіз: ");
        int a = scanner.nextInt();
        
        System.out.print("Екінші санды енгізіңіз: ");
        int b = scanner.nextInt();
        
        if (a > b) {
            System.out.println("Үлкен сан: " + a);
        } else if (a < b) {
            System.out.println("Үлкен сан: " + b);
        } else {
            System.out.println("Сандар тең.");
         }
        }
    }
    
