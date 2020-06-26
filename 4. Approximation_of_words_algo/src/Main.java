import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String rc;
        int count=0;
        rc=scan.nextLine();
        String strarr[]={"hello","hi","bye","fake","cakes","naked","baked"};
    int k = -1;
        int z=strarr.length;
        int arr[]=new int[z];
               
               for(int i=0;i<z;i++){
                   count=0;
                   if(rc.length()==strarr[i].length()){
                       int a=rc.length();
                       if(rc.charAt(a-1)==strarr[i].charAt(a-1)&& rc.charAt(a-2)==strarr[i].charAt(a-2)){
                           for(int j=0;j<rc.length();j++){
                               if(rc.charAt(j)==strarr[i].charAt(j)){
                                   count++;
                               }
                           }
                           arr[i]=count;
                       }
                   }
                   else
                       arr[i]=-1;
               }



               int max=arr[0];
               for(int i=0;i<z;i++){
                   if(max<arr[i]){
                       max=arr[i];
                       k=i;
                   }
               }
               if(k>0)
               System.out.println(strarr[k]);
               else System.out.println("Not Found");
    }
}
