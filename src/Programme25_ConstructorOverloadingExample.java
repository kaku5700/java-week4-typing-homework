//Java program to overload constructors
public class Programme25_ConstructorOverloadingExample {
    int id;
    String name;
    int age;

    //creating two arg constructor
    Programme25_ConstructorOverloadingExample(int i, String n) {
        id = i;
        name = n;
    }

    //creating three arg constructor
    Programme25_ConstructorOverloadingExample(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        Programme25_ConstructorOverloadingExample s1 = new Programme25_ConstructorOverloadingExample(111, "Karan");
        Programme25_ConstructorOverloadingExample s2 = new Programme25_ConstructorOverloadingExample(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}
