public class FindMissingNumber{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5};
        int a =findMissing(numbers);
        System.out.println(a);
    }

    public static int findMissing(int[] numbers){
        int n=numbers.length+1;
        int expected=n*(n+1)/2;
        int actual=0;
        for(int i=0;i<numbers.length;i++){
            actual+=numbers[i];
        }

        int missing =expected-actual;
        return missing;
    }
}