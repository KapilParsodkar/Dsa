public class pairSum {

    public static void main(String[] args) {

        int[] numbers = {2, 9, 11, 15};

        int target=9;
        pair(numbers,target);

    }

    public static boolean pair(int [] nums,int t){
       for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(t==nums[i]+nums[j]){
                System.out.println("target matched");
                return true;
            }
        }
       }
       return false;
    }
    
   
}