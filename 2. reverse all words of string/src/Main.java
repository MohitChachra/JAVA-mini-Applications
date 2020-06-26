public class Main {

    public static void main(String[] args) {
        int j;
       String str="Hello my name is John.";
       int a=str.length();
       int flag=0;
       for (int i=a-2;i>=0;i--){
             flag=0;
           if(str.charAt(i)==' ' || i==0){
               if(i==0){
                   j=i;
                   flag=1;
               }
               else {
                   j = i + 1;
               }

               while(j<a-1 && str.charAt(j)!=' '){
                   System.out.print(str.charAt(j));

                   j++;
               }
               if(flag==0)
               System.out.print(" ");

           }

       }
        System.out.print(str.charAt(str.length()-1));
    }
}
