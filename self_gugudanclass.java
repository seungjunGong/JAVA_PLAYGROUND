public class self_gugudanclass {
    public static int[] calcluation(int front, int behind){
        int[] result = new int[behind];
        for(int i = 0; i < behind; i++){
            result[i] = front * (i + 1); 
        }
        return result;
    }

    public static void print(int[] result){
        for(int i = 0; i < result.length; i++)
        System.out.print(result[i] + " ");
    }
    
}
