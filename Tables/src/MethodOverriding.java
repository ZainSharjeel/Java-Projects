
class Zain {

    void run (){
        System.out.println("dog is barking");
    }
}

public class MethodOverriding extends Zain {

     void run(){
        System.out.println("dog is crawling");
    }


    public static void main(String[] args) {

         Zain zi=new Zain();
         zi.run();
         MethodOverriding zi2=new MethodOverriding();
         zi2.run();

    }
}
