package Interview;

public class MultiLevel {
    int a=10;
}
class Demo2 extends MultiLevel{
    void sound(){
        System.out.println("Java is Programming Langauage");
    }

}

class Demo3 extends Demo2{
    void music(){
        System.out.println("Sarigama");
    }
}
class Mainclass5{
    public static void main(String[] args) {
        Demo3 d3=new Demo3();
        System.out.println(d3.a);
        d3.sound();
        d3.music();
    }


}
