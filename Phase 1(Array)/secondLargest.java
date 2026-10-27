public class secondLargest{
    public static void main(String[] args) {
        int[] numbers = {12, 5, 8, 20, 15};
        int a=findSecondLargest(numbers);
        System.out.println(a);
    }

    public static int findSecondLargest(int[] numbers){
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                secondlargest=largest;
                largest=numbers[i];
            }else if(numbers[i]>secondlargest && numbers[i]!=largest){
                secondlargest=numbers[i];
            }
        }
        return secondlargest;
    }
}