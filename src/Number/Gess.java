package Number;

public class Gess {
    public static void  main(String[] args){
        char word = 'd' , word2 = '@';
        int p = 23045,p2 = 45213;
        System.out.println("d在Unicode表中的顺序位置是：" + (int)word + (char)p);
        System.out.println("@在Unicode表中的顺序位置是："+(int)word2);
        System.out.println("unicode表中的第23045位是："+(char)p);
        System.out.println("unicode表中的第45213位是：" + (char)p2);
    }
}
