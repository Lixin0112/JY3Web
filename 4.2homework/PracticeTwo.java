import java.util.*;
public class PracticeTwo{
 /*
 ��������
ʵ�ֺ������㣺y = f��x�� = x^2 - 2x + 4 ע��x^2 ��ʾ��x ��ƽ����
 */
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("�������Ա���x(����)��");
      int x=sc.nextInt();
      int y=f(x);
      System.out.println("����y=f(x)��ֵΪ��"+y);

    }
    public static int f(int a){
    
   return (a*a-2*a+4);
    
    
    }

}