import java.util.*;
public class moveZeroestoEnd{
    public static void main(String[] args){
        int [] a= {0, 1, 0, 3, 12};
         mz(a);
        System.out.println(Arrays.toString(a));
    }

    public static void mz(int [] a){
        int position =0;
        for(int i=0;i<a.length;i++){
           if(a[i]!=0){
            int temp=a[i];
            a[i]=a[position];
            a[position]=temp;
            position++;
           }
        }
    }
}