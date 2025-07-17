public class Main {

    public static void main(String[] args) {
        String s="Hello";
        char []reverse=new char[s.length()];
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = (s.length()-1)-i; j <= (s.length()-1)-i ; j++)
            {
                reverse[i]=s.charAt(j);
            }
        }
        for (int j = 0; j < s.length(); j++)
        {
            System.out.print(reverse[j]);
        }
    }

    public static char revString(String s)
    {
        char []reverse=new char[s.length()];
        int i;
        for ( i = 0; i < s.length(); i++)
        {
            for (int j = (s.length()-1)-i; j <= (s.length()-1)-i ; j++)
            {
                reverse[i]=s.charAt(j);
            }
        }
        return reverse[i];
    }
}