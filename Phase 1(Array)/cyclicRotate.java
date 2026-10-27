import java.util.*;

public class cyclicRotate {
  public static void main(String[] args) {
    int [] numbers={1, 2, 3, 4, 5};
    rotateByOne(numbers);
    System.out.println(Arrays.toString(numbers));
     
  }
  public static void rotateByOne(int[] numbers){
      int last = numbers[numbers.length-1];
      int temp =0;
      for(int i=numbers.length-1;i>0;i--){
        //    temp=numbers[i];
        //    numbers[i]=numbers[i-1];
        //    numbers[i-1]=numbers[i];
        numbers[i]=numbers[i-1];
      }
       numbers[0]=last;
  }

}


// Reverse array       → swapping / two pointers
// Move negatives      → partition / two pointers
// Rotate right by one → save + right shift
// Kadane              → running best decision