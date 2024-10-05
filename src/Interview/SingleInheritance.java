package Interview;

public class SingleInheritance {
    int a=10;
}

class Demo extends SingleInheritance{
    void add(){
        System.out.println("Hello");
    }
}

class Main{
    public static void main(String[] args) {
        Demo d1=new Demo();
        System.out.println(d1.a);
        d1.add();
    }
}
