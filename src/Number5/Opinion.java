package Number5;
//5.4.5
//使用equals()方法比较两个字符串是否相等
//使用equlalsIgnoreCase()方法比较在忽略大小写情况下字符串是否相等
public class Opinion {
    public static void main(String[] args){
        String s1 = new String("abc");
        String s2 = new String("ABC");
        String s3 = new String("abc");
        boolean b = s1.equals(s2);
        boolean b2 = s1.equalsIgnoreCase(s2);
        System.out.println(s1+""+s2+""+b);
        System.out.println(s1+""+s2+""+b2);
    }
}
