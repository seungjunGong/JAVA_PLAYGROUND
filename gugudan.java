import java.util.Scanner;

public class gugudan {
    public static void main(String[] args) {
        System.out.println("구구단 중 출력할 단은? : ");
        Scanner scanner = new Scanner(System.in); // Create Scanner
        int number = scanner.nextInt(); // Read uesr input
        System.out.println("number : " + number);

        System.out.println("for문으로 출력");
        for(int i = 1; i < 10; i++){
            int result = number * i;
            System.out.println(result);
        }

        System.out.println("while문으로 출력");
        int i = 1;
        while (i < 10){
            int result = number * i;
            System.out.println(result);
            i++;
        }
        scanner.close();
    }

}
