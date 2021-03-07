import java.util.*;
public class ecuacion {
    public static void main(String[] args) {
        int a,b,c;
        double result,resultmenos;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        result=((-a+Math.sqrt(b*b-4*a*c))/(2*a));
        resultmenos=((-a-Math.sqrt(b*b-4*a*c))/(2*a));
    }
}