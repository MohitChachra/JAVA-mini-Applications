import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String email="";
        String pwd="";
        email=scan.nextLine();
        pwd=scan.nextLine();
        int flag1 = 0,flag2=0,flag3=0;
        int a=email.indexOf(".");
        if(email.charAt(a+1)>=65&&email.charAt(a+1)<=92 || email.charAt(a+1)>=97 && email.charAt(a+1)<=112)
            flag3=1;
        if(email.contains("@") && email.contains(".") && flag3==1){

            if(pwd.length()>=8 && pwd.charAt(0)>=65 && pwd.charAt(0)<=92 &&
                    pwd!=email.substring(0,email.indexOf("@")-1) && email!=pwd) {

                for (int i = 0; i < pwd.length(); i++) {
                    int d = pwd.charAt(i);
                    if (d >= 48 && d <= 57) {
                        flag1= 1;
                        break;
                    }
                }

                for(int i=0;i<pwd.length();i++){
                    int d=pwd.charAt(i);
                    if(d<48 || d>57 && d<65 || d>91 && d<122){
                        flag2=1;
                        break;
                    }
                }

                if(flag1==1 && flag2==1){
                    System.out.println("Congratss you calculator is ready to use");
                    System.out.println("enter first number");
                    int num1=scan.nextInt();
                    System.out.println("enter operator");
                    String op=scan.next();
                    System.out.println("enter second number");
                    int num2=scan.nextInt();
                    int result=0;
                    if(num2==0 && op=="/"){
                        System.out.println("number can not be divided by 0");
                    }
                    else {
                        switch (op.charAt(0)) {
                            case '+':
                                result = num1 + num2;
                                break;
                            case '-':
                                result = num1 - num2;
                                break;
                            case '*':
                                result = num1 * num2;
                            case '/':
                                result = num1 / num2;
                        }

                        System.out.println("Result is: " + result);
                    }
                }
                else{
                    System.out.println("password must have atleast one special character and atleast one number");
                }
            }
            else{
                System.out.println("password must be of 8 character " +
                        "and having first letter capital password must not be and not be email id");
            }

        }
        else{
            System.out.println("please enter valid email id");
        }


    }
}
