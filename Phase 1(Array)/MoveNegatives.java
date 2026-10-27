public class MoveNegatives {

    public static void main(String[] args) {

        int[] numbers = {1, -2, 3, -4, -5, 6};

        moveNegatives(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
    
    public static void moveNegatives(int[] numbers) {
         int start=0;
         int end=numbers.length-1;
         int temp=0;

         while(start<end){
            while(start<end && numbers[start]>=0){
                 start++;
            }

            while(start<end && numbers[end]<0){
                end--;
            }

            if(start<end){
                 temp=numbers[start];
                 numbers[start]=numbers[end];
                 numbers[end] =temp;
            }
         }
    }

   
}