public class RecursionSb {
        public static void main(String args[])
        {
            String str1 = new String("Umer");
            String str2 = new String("zain");
            String str3 = new String("hasan");
            String str4 = new String("Umer");
            String str5 = new String("zain");
//comparing the strings
            System.out.println("Comparing " + str1 + " and " + str2
                    + " : " + str1.equals(str2));
            System.out.println("Comparing " + str3 + " and " + str4
                    + " : " + str3.equals(str4));
            System.out.println("Comparing " + str4 + " and " + str5
                    + " : " + str4.equals(str5));
            System.out.println("Comparing " + str1 + " and " + str4
                    + " : " + str1.equals(str4));
        }
    }

