import java.util.*;
public class PracticeSix{
 /*
案例描述 循环接收控制台输入的一个数，并且输出控制台”您输入的数是“，如果输入”-1“退出循环。
 */
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int x=0;
      while(x!=-1){
      x=sc.nextInt();
	  System.out.println("您输入的数是："+x);
     }
     System.out.println("退出循环");
    }
}