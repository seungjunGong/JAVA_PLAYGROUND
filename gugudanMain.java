public class gugudanMain {
    public static void main(String[] args){
        for (int j = 2; j < 10; j++) {
            int[] sum = gugudanclass.calculate(j);
            gugudanclass.print(sum);
            System.out.println("");
        }
    }
}
