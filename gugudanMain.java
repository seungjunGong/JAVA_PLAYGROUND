import java.util.Scanner;
public class gugudanMain {
    public static void main(String[] args){

        System.out.println("단을 입력하세요: ");
        Scanner scan = new Scanner(System.in);
        String step = scan.nextLine();
        System.out.println("***** " + step + "단 *****");
        String[] steps = step.split(",");

        int first = Integer.parseInt(steps[0]);
        int second = Integer.parseInt(steps[1]);

        for(int i = 2; i < first + 1; i++)
        {
            int[] dif_gugudan = gugudanclass.calculate(i,second);
            gugudanclass.print(dif_gugudan);
            System.out.println("");
        }
        scan.close();
    }
    
}
