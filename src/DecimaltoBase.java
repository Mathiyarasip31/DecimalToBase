import java.util.Scanner;

public class DecimaltoBase {
    static void conversion(int number,int base)
    {
        String value="";
        while(number!=0)
        {
            int res=number/base;
            int rem=number%base;
            value=String.valueOf(rem)+value;
            number=res;
        }
        System.out.println(value);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int base=scanner.nextInt();
        conversion(number,base);
    }
}