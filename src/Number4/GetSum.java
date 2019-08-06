package Number4;
/*4.3.1 while 循环语句
在主方法中通过while循环将整数1-10相加，并将结果输出*/
public class GetSum {   //创建类
    public static void main(String[] args){ //主方法
        int x = 1; //定义int型变量x，并赋值
        int sum = 0;
        while(x <= 10){
            sum = sum + x;   //while循环语句，当变量满足条件执行循环体
            x++;   // x = x+1;
        }
        System.out.println("1到10相加的结果等于"+sum);
    }
}
