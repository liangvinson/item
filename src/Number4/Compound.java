package Number4;
//4.1复合语句
public class Compound {
    public static void main(String[] args){
        int x = 20;
        {
            int y = 4;
            System.out.println(y);
            int z = 245;
            boolean b;
            {
                b = y > z;
                System.out.println(b);
            }
        }
        String word = "hello world"; //char数组，String不是基本数据类型，只是被封装好的对象类型
        System.out.println(word);
    }

}
