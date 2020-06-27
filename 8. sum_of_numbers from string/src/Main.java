import java.util.Scanner;

public class Main {

    public static void main(String[] args) {        //print sum of numbers present in string
        Scanner scan=new Scanner(System.in);
        String a;
        int c;
        a=scan.next();
        int b=a.length();
        int sum=0,digit=0;
        for(int z=0;z<b;z++)
        {
            if(a.charAt(z)>=48 && a.charAt(z)<=57)
            {
                int q=a.charAt(z);
                digit=digit*10+(q-48);   //sum of number in seq.
                if(z+1==b)
                    sum=sum+digit;
            }
            else{
                sum=sum+digit;           //sum of number to another number in seq.
                digit=0;

            }
        }
        System.out.println(sum);
    }
}
