import java.util.*;
public class PracticeThree{
 /*
 案例描述 实现 2 个函数计算：
y = f（x） = x%3
y = f（x） = x++
 */
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("请输入自变量x(整数)：");
      int x=sc.nextInt();
      int y1=f1(x);
      int y2=f2(x);
      System.out.println("函数y=f(x)=x%3的值为："+y1);
      System.out.println("函数y=f(x)=x++的值为："+y2); 
    }
    public static int f1(int a){
    
   return (a%3);
   
    }

    public static int f2(int a){
    
    return(a+1);
    }




}