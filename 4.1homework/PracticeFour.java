import java.util.Random;
public class PracticeFour{
/*ÿ����һ�γ����������A~Z ֮���ĳ����ĸ
���ͣ�int���� 97������ַ���ʲô��
�ַ���0�������������Ƕ��٣�*/
public static void main(String[] args){

   Random r=new Random();
   int rInt=r.nextInt(26);
   char a=(char)('A'+rInt);
   char b=97;
   char c='0';
   System.out.println(a);
   System.out.println(b);
   System.out.println((int)c);
}

}