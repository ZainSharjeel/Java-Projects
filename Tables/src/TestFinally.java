public class TestFinally {

    public static void main(String[] args){
        try {
            System.out.println("Try block");
            int num=50 / 50;
            System.out.println(num);
        }
        catch (ArithmeticException e){
            System.out.println("Exception handle:" + e);
        }
        finally {
            System.out.println("Always executed");
        }
        System.out.println("Other code");
    }
}
