
import java.util.Scanner;

public class PracticeFive{

public static void main(String[] args){

  Scanner sc=new Scanner(System.in);
  System.out.println("������һ������:");
  int a=sc.nextInt();
  System.out.println("������ƽ��Ϊ:"+a*a);

  
  double s=4.2*3*100000000*60*60*24*365;
  double l=0.45;
  double num=s/l;
  int numInt=(int)Math.ceil(num);
  System.out.println("��Ҫϲȵ"+numInt+"ֻ");

  double v=Math.sqrt(2*9.8*384);
  System.out.print("��������ٶ���:"+v);

}



}