class Human{
    String name;
    int age;
    double height;
    String color;
    public Human(String name, int age, double height, String color){
        this.name = name;
        this.age = age;
        this.height = height;
        this.color = color;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height+"m");
        System.out.println("Color: "+color);
    }
     public void set_age(int age){
        this.age = age;
    }
    public String get_color(){
        return color;
    }
}
public class Learn_Class{
    public static void main(String [] args){
        Human object = new Human("Rahul Kumar Ghosh", 23, 1.651, "Black");
        object.display();
        object.set_age(22);
        System.out.println("\n::After updating the age::\n");
        object.display();
        System.out.println(object.name + " age is now " + object.age + "\n");
    }
}