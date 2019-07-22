package Number4;
//4.2 if else if 型
public class GetTerm {
    public static void main(String[] args){
        int x = 20;
        if(x>30){
            System.out.println("x的值大于30");
        }else if(x>10){
            System.out.println("x的值大于10少于30");
        }else if(x>0){
            System.out.println("x的值大于0但是少于10");
        }
        else {
            System.out.println("x的值少于0");
        }
    }
}
