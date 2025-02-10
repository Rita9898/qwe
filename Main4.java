import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Санды енгізіңіз: ");
        int num = scanner.nextInt();
        
        int originalNum = num;
        int reversedNum = 0;
        
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " палиндром сан.");
        } else {
            System.out.println(originalNum + " палиндром емес.");
        }
        
        scanner.close();
    }
}

