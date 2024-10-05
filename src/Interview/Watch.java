package Interview;

public class Watch {
   String watch_color;
   int watch_price;
   String watch_name;
   Watch(String a, int b, String c){
       watch_color=a;
       watch_price=b;
       watch_name=c;
   }

    public static void main(String[] args) {
        Watch w1=new Watch("Black",999,"CASIO");
        System.out.println(w1.watch_color);
        System.out.println(w1.watch_price);
        System.out.println(w1.watch_name);


    }

}
