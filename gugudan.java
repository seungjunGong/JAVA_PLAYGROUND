import java.util.Scanner;

public class gugudan {
    public static void main(String[] args) {
        System.out.println("***** 구구단 출력기 *****");
        // 숫자 입력
        System.out.println("구구단 중 출력할 단은? : ");
        Scanner scanner = new Scanner(System.in); // Create Scanner
        int number = scanner.nextInt(); // Read uesr input
        System.out.println("number : " + number);

        // 2와 9사이의 숫자 입력 아닐 시 오류
        if (number < 2) {
            System.out.println("Error입니다. 2와 9사이의 숫자를 입력해주세요.");
        } else if (number > 9) {
            System.out.println("Error입니다. 2와 9사이의 숫자를 입력해주세요.");
        } else {
            System.out.println("for문으로 출력");
            for (int i = 1; i < 10; i++) {
                int result = number * i;
                System.out.println(result);
            }
        }
        scanner.close();
    }
}
