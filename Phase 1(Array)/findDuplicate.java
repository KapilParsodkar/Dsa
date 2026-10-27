import java.util.*;

public class findDuplicate {
  public static void main(String[] args) {
    int [] num={4, 2, 7, 2, 5};
    System.out.println(findDup(num));
  }

  public static int findDup(int[] nums){
      int d=-1;
      for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
          if(nums[j]==nums[i]){
              d=nums[i];
          }
        }
      }
      return d;
  }
}
