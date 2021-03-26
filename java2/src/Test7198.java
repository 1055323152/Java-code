import java.util.Scanner;
class Dog{
    private String name;
    private String color;
    private int age;
    Dog(String name,String color,int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    Dog(){
        this.name = "dog1";
        this.color = "white";
        this.age = 1;
    }
    public String getName(){
        return name;
    }
    public String getcolor(){
        return color;
    }
    public int getAge(){
        return age;
    }
}

public class Test7198 {
    public static void main(String[] args) {
        //write code here
        Scanner cin = new Scanner(System.in);
        Dog d1 = new Dog();
        Dog d2 = new Dog(cin.next(),cin.next(),cin.nextInt());
        System.out.println("name=" + d1.getName() + ",color=" +d1.getcolor()+",age="+d1.getAge());
        System.out.println("name=" + d2.getName() + ",color=" +d2.getcolor()+",age="+d2.getAge());

    }

}