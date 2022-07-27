public class gugudanclass {
    public static int[] calculate(int times, int various){

        int[] result = new int[various];
        for(int i=0; i < result.length; i++){
            result[i] = times * (i+1);
        }
        return result;
    }
    public static void print(int[] result){
        for(int i=0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
