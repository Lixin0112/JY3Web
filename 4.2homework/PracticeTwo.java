import java.util.*;
public class PracticeTwo{
 /*
 案例描述
实现函数计算：y = f（x） = x^2 - 2x + 4 注：x^2 表示“x 的平方”
 */
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("请输入自变量x(整数)：");
      int x=sc.nextInt();
      int y=f(x);
      System.out.println("函数y=f(x)的值为："+y);

    }
    public static int f(int a){
    
   return (a*a-2*a+4);
    
    
    }

}