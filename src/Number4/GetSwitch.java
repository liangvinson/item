package Number4;

public class GetSwitch {
    public static void main(String[] args){
        int week = 2;
        switch (week){  //指定switch的表达式为week
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wendesday");
                break;
            default:
                System.out.println("不是");
        }
    }

}
