package Number;
//3.4.1赋值运算符
public class Eval {
    public static void main(String[] args){
        int a,b,c; //声明变量a,b,c
        a = 15;  //赋值
        c = b = a+4; //运算 先赋值给b，再赋值给c
        System.out.println("变量C的值为："+c);
        System.out.println("变量b的值为："+b);
    }
}
