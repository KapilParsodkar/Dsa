import java.util.*;

public class MaxSubarray {
  public static void main(String[] args) {
    int [] num={-2, 1, -3, 4, -1, 2, 1, -5, 4};
     System.out.println(maxarr(num));
  }

  public static int maxarr(int [] num){
   int currentSum = num[0];
    int maxSum = num[0];

    for (int i = 1; i < num.length; i++) {
         currentSum=Math.max(num[i],currentSum+num[i]);
         if(maxSum<currentSum){
            maxSum=currentSum;
         }

        //  also can use maxSum=Math.max(m axSum,currentSum);

    }

    return maxSum;

  }
}
