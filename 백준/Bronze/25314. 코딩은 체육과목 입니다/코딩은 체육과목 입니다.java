import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String str = "long ";
        String result = "";
        
        for (int i = 1; i <= N/4; i++) {
            result += str;
        }
        
        result += "int";
        System.out.println(result);
    }
}