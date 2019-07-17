package Number;

public class Part {
    //声明常量PI，此时如不对PI进行赋值，将会报错
    static final double PI = 3.14D;
    static int age = 23;
    public static void main(String[] args){ //主方法
        final int NUMBER;
        NUMBER = 1235;
        age = 22;
        //NUMBER = 5555; //错误的代码，常量不能二次赋值
        System.out.println("常量PI的值为： "+PI);
        System.out.println("常量NUMBER的值为："+NUMBER);
        System.out.println("int型变量的值为："+age);
    }
}
