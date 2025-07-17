public class Recursion3 {

    static void towerOfHanoi(int n, char fromRod, char toRod, char auxRod) {

        if (n==0) {
            return;
        }
        towerOfHanoi(n-1, fromRod,auxRod,toRod);
        System.out.println("disk move " + n + " from rod " + fromRod + " to rod " + toRod);
        towerOfHanoi(n-1,auxRod,toRod,fromRod);
    }

    public static void main(String[] args) {

        int n=3;
        towerOfHanoi(n,'a','c','b');

    }
}
