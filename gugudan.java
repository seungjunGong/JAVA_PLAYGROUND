// import java.util.Scanner;

// public class gugudan {
//     public static void main(String[] args) {
//         System.out.println("***** 구구단 출력기 *****");
//         // 숫자 입력
//         System.out.println("구구단 중 출력할 단은? : ");
//         Scanner scanner = new Scanner(System.in); // Create Scanner
//         int number = scanner.nextInt(); // Read uesr input
//         System.out.println("number : " + number);

//         // 2에서 9까지 출력

//         int[] sum = new int[9];
//         for (int k = 2; k <= 9; k++) {
//             for (int i = 0; i < sum.length; i++){
//                 sum[i] = k * (i+1);
//                 System.out.print(sum[i] + " ");
//             }
//             System.out.println("");
//         }

//         // 2와 9사이의 숫자 입력 아닐 시 오류
//         if (number < 2) {
//             System.out.println("Error입니다. 2와 9사이의 숫자를 입력해주세요.");
//         } else if (number > 9) {
//             System.out.println("Error입니다. 2와 9사이의 숫자를 입력해주세요.");
//         } else {
//             System.out.println("배열 값을 받아 반복문 출력");
//             for (int i = 1; i < 10; i++) {
//                 int result = number * i;
//                 System.out.println(result);
//             }
//         }
//         scanner.close();
//     }
// }
//메소드(함수)를 이용한 방식
public class gugudan {
    public static int[] calculate(int times) {
        int[] result = new int[9];

        for (int i = 0; i < result.length; i++) {
            // 계산 결과 배열에 저장
            result[i] = times * (i+1);
        }
        return result;
    }

    public static void print(int[] result) {
        for (int i = 0; i < result.length; i++){
            // 계산 결과를 화면에 출력
            System.out.print(result[i] + " ");
        }
    }

    public static void main(String[] args) {
        for (int j = 2; j < 10; j++) {
            // calculate와 print 메소드 활용해 구구단 구현하기
            int[] sum = calculate(j);
            print(sum);
            System.out.println("");
        }
    }
}