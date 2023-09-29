class Rahul{
    //instance variables or non static fields
    double height;
    int age;
    //class variables or staatic fields
    static final String name = "Rahul Kumar Ghosh";
    //local variables
    Rahul(int age, double height){//here age and height are used as a local variable.
        this.age = age;
        this.height = height;
    }
    //age and height are also used as a parameter to the constructor
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
    }
    int localVariable(){
        int local = 2;
        return local+1;
    }
}
public class Variable{
    public static void main(String[] args) {
        Rahul rahul = new Rahul(23, 1.620);
        rahul.display();
        System.out.println(rahul.localVariable());
        /* 
        for(String arg: args){
            System.out.println(arg);
        }
        */
    }
}