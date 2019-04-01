
import java.util.Scanner;

public class PracticeFive{

public static void main(String[] args){

  Scanner sc=new Scanner(System.in);
  System.out.println("请输入一个整数:");
  int a=sc.nextInt();
  System.out.println("该数的平方为:"+a*a);

  
  double s=4.2*3*100000000*60*60*24*365;
  double l=0.45;
  double num=s/l;
  int numInt=(int)Math.ceil(num);
  System.out.println("需要喜鹊"+numInt+"只");

  double v=Math.sqrt(2*9.8*384);
  System.out.print("到地面的速度是:"+v);

}



}