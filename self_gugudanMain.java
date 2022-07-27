import java.util.Scanner;

public class self_gugudanMain {
    public static void main(String[] args){
        System.out.println("***** 스스로 만든 구구단 *****");
        System.out.println("단을 입력해 주세요(,구분): ");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] steps = line.split(",");

        int first = Integer.parseInt(steps[0]);
        int second = Integer.parseInt(steps[1]);

        for(int i = 2; i <= first; i++){
            int[] sum = self_gugudanclass.calcluation(i,second);
            self_gugudanclass.print(sum);
            System.out.println("");
        }
        scan.close();
    }
}
