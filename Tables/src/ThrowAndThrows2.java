public class ThrowAndThrows2 {

    static void checkMarks(int m) throws ArithmeticException {
        if (m<60) {
            throw new ArithmeticException("Access is denied you must get atleast 60 marks");
        }
        else {
            System.out.println("Access granted you got enough marks");
        }
    }


    public static void main(String[] args) {
        checkMarks(50);

    }
}
