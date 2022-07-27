import java.util.Scanner;
public class gugudanMain {
    public static void main(String[] args){

        System.out.println("단을 입력하세요: ");
        Scanner scan = new Scanner(System.in);
        int step = scan.nextInt();
        System.out.println("***** " + step + "단 *****");

        for (int j = 2; j < (step + 1); j++) {
            int[] sum = gugudanclass.calculate(j, step);
            gugudanclass.print(sum);
            System.out.println("");
        }
    }
}
