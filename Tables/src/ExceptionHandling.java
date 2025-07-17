public class ExceptionHandling {

    public static void main(String[] args) {

        try {
            int num=100 / 0;

        }
        catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("Rest of lines");
    }

}
