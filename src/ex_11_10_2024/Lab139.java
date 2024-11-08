package ex_11_10_2024;

import java.sql.SQLOutput;

public class Lab139 {
    public static void main(String[] args) {
        Car c=new Car(300);
    }
}

class Car extends vechile{
    private int maxspeed=200;
    public Car(int maxspeed) {
        super();
        this.maxspeed = maxspeed;
        System.out.println(super.maxspeed);
        System.out.println(this.maxspeed);
        super.message();
        this.message();
    }
    public void message(){
        System.out.println("This is car class");
    }
}
class vechile{
    public int maxspeed=100;
    public vechile(int maxspeed) {
        this.maxspeed = maxspeed;
    }
    public vechile(){
        System.out.println("Default Constructor");
    }
    public void message(){
        System.out.println("This is vechile class");
    }
}
