
public class Person {
    int age;
    int height;
    int weight;
    String name;
    String lastname;
    String city;
    Person (int a, int h, int w, String n, String l, String c){
        age=a;
        height=h;
        weight=w;
        name=n;
        lastname=l;
        city=c;
    }
    void display () {
        System.out.println(name+" "+lastname+" "+city +" "+age+"years old");
    }

    public static void main (String[] args) {

        Person p1 = new Person(24, 175, 85, "Vadym", "Venher", "Kyiv");
        Person p2 = new Person(21, 160, 55, "Luda", "Venher", "Kyiv");
        p1.display();
        p2.display();


    }



}
