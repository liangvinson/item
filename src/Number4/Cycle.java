package Number4;
//4.3.2 do...while循环体
public class Cycle {
    public static void main(String[] args){
        int a = 100;
        while (a == 60){                 //while循环体语句
            System.out.println("ok1");
            a--;
        }
        int b = 100;
        do{                              //do...while循环体语句
            System.out.println("ok2");
            b--;
        }while(b == 60);
    }
}
