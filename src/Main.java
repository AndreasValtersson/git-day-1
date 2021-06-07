public class Main {

     static int num =5;
    public static void main(String[] args) {

    addOne();

        System.out.println(num);

    }
    public static int addOne (){
        num++;
        num++;
                return num;
    }
    public static int decreaseOne(){
        num--;
        num--;
            return num;
    }
}
