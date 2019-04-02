import java.util.*;
public class PracticeFour{
 /*
案例描述
使用三元运算符实现分页功能。
 */
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("请输入数据总条数：");
      int total=sc.nextInt();
      System.out.println("请输入单个页面容纳最多条数：");
      int size=sc.nextInt();
      int page=total/size==0?total/size:total/size+1;
      System.out.println("一共需要："+page+"页");
    
    
    
    
    
    }



}