public class MethodOverloadingPractie {

    public static void add(int k,int l) {
        System.out.println(k + l);
    }
    public static int multiply(int k, int l) {
        return k * l;
    }

    public static void main(String[] args) {
        int a=3,b=5;
        add(a,b);
        System.out.println(multiply(a,b));
    }

}
