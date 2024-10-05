package Interview;

public class Whatsapp {
    static  void send(int no){
        System.out.println("Sending message is : "+no);
    }
    static  void send(String  text){
        System.out.println("Sending message is : "+text);
    }
    static  void send(int no,String text){
        System.out.println("Sending message is : "+no+" "+text);
    }
}
class MainClass1{
    public static void main(String[] args) {
        Whatsapp.send(123);
        Whatsapp.send("ABC");
        Whatsapp.send(123,"ABC");
    }

}