import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Жылды енгізіңіз: ");
        int year = scanner.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " жылы кібісе жыл.");
        } else {
            System.out.println(year + " жылы жай жыл.");
        }
        
        scanner.close();
    }
}
