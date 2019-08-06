package Number4;
//for 循环语句
public class Circulate {
    public static void main(String[] args){
        int sum = 0;
        for(int i = 2;i <= 100;i +=2){
            sum = sum + i;
        }
        //将2-100之间的偶数之和计算出结果并输出
        System.out.println("2-100偶数相加结果："+sum);
    }
}
