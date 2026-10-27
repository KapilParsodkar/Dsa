import java.util.*;
public class rotateByk{
    public static void main(String[] args) {
    int [] numbers={1, 2, 3, 4, 5};
    int k=2;
    rotByk(numbers,k);
    System.out.println(Arrays.toString(numbers));
     
  }

  public static void rotByk(int[] numbers, int k){
    k=k%numbers.length;
    reverse(numbers,0,numbers.length-1);
     reverse(numbers,0,k-1);
    reverse(numbers,k,numbers.length-1);  
  }

  public static void reverse(int[] numbers, int start, int end) {

        while (start < end) {

            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }
    }
}
