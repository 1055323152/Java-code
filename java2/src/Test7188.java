import java.util.Scanner;
class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    Student(){
        this.name = null;
        this.age = 0;
    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return this.age;
    }
}
public class Test7188 {
    public static void main(String []args){
        Scanner cin = new Scanner(System.in);
        Student a = new Student();
        String name = cin.next();
        int age = cin.nextInt();
        a.setName(name);
        a.setAge(age);
        System.out.println("该生姓名："+a.getName()+",年龄："+a.getAge());

    }
}
