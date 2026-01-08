import java.util.*;
public class sample {
    public static void main(String[] arg ) {
        /*Random random = new Random();
    double number;
    number = random.nextDouble();
        System.out.println(" "+number+" ");
        System.out.println(Math.PI);
        System.out.println(Math.E);
    double result;
    result = Math.pow(2,10);
    result = Math.abs(-5);
    result = Math.sqrt(81);
    result = Math.round(3.14);
    result = Math.ceil(3.14);
    result = Math.floor(3.14);
    result = Math.max(10,20);
    result = Math.min(10,20);
        System.out.println(result);*/


    Scanner sc = new Scanner(System.in);
    double a ;
    double b ;
    double c ;
    double circumferne;
    double radius;
    double area;
    double volume;
    double amount;
    double principal;
    double rate;
    double timesCompound;
    double years;
        System.out.print(" a: ");
        a = sc.nextDouble();
        System.out.print(" b: ");
        b = sc.nextDouble();
        System.out.print(" r: ");
        radius = sc.nextDouble();

        principal=sc.nextDouble();
        rate = sc.nextDouble();
        timesCompound = sc.nextDouble();
        years = sc.nextDouble();


        // HYPOTENUSE
        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        circumferne = 2 * Math.PI * radius ;
        area = Math.PI * Math.pow(radius,2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);
        amount = principal * Math.pow(1+rate/timesCompound,timesCompound*years);

        System.out.printf("%.1fcm\n",c);
        System.out.printf("%.1fcm\n",circumferne);
        System.out.printf("%.1fcm^2\n",area);
        System.out.printf("%.1fcm^3\n",volume);





    sc.close();
    }
}

























