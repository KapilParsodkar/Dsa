import java.util.*;

public class MaxSubarraryreturnarray{
  public static void main(String[] args) {
    int [] num={-2, 1, -3, 4, -1, 2, 1, -5, 4};
     maxarr(num);
  }

  public static void maxarr(int [] num){
   int currentSum = num[0];
    int maxSum = num[0];
    int cs=0;
    int bs=0;
    int be=0;

    for (int i = 1; i < num.length; i++) {
       if(num[i]>currentSum+num[i]){
         currentSum=Math.max(num[i],currentSum+num[i]);
         cs=i;
       }else{
         currentSum=Math.max(num[i],currentSum+num[i]);
       }

       if(maxSum<currentSum){
         maxSum=currentSum;
         bs=cs;
         be=i;
       }

    }
     List<Integer> sa=new ArrayList<>();
    for(int i=bs;i<=be;i++){
        sa.add(num[i]);
    }

    System.out.println("Maximum sum is "+ maxSum);
    System.out.println("the array which produces maximum sum "+sa);



  }
}
