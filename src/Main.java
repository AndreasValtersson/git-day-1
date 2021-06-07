public class Main {

     static int num =5;
    public static void main(String[] args) {

    addOne();
        System.out.println(num);
        decreaseOne();
        System.out.println(num);


        numX2();
        System.out.println(num);



    }
    public static int addOne (){
        num++;
        num++;
                return num;
    }

    public static int numX2(){
        return (num * 2);

    public static int decreaseOne(){
        num--;
        num--;
            return num;
    }
}
