import java.util.*;

public class mergetwoArrays{
    public static void main (String[] args){
        int[] first = {1, 3, 5};
        int[] second = {2, 4, 6};
        
        System.out.println(Arrays.toString(Merged(first,second)));
    }

    public static int[] Merged(int[] f,int [] s){
        int[] merged = new int[f.length + s.length];
        for(int i=0;i<f.length;i++){
            merged[i]=f[i];
        }

        for(int i=0;i<s.length;i++){
            merged[f.length+i]=s[i];
        }

        return merged;

    }
}