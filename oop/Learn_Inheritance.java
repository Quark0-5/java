class Book{
    String name;
    String author;
    String publisher;
    int pages;
    int price;
    String color;
    Book(String name, String author, String publisher, int pages, int price, String color){
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.pages = pages;
        this.price = price;
        this.color = color;
    }
    void display(){
        System.out.println("Name:" + name + "\nAuthor:" + author + "\nPublisher:" + publisher + "\nPages:" + pages + "\nPrice:" + price + "\nColor:" + color);
    }
}
class ScienceFiction extends Book{
    ScienceFiction(String name, String author, String publisher, int pages, int price, String color){
        super(name, author, publisher, pages, price, color);
    }
}
class Thriller extends Book{
    Thriller(String name, String author, String publisher, int pages, int price, String color){
        super(name, author, publisher, pages, price, color);
    }
}
public class Learn_Inheritance{
    public static void main(String[] args) {
        ScienceFiction book1 = new ScienceFiction("Pree", "MD. Zafar Iqbal", "Unknown", 77, 120, "Blue and White\n");
        Thriller book2 = new Thriller("Byomkesh Bakshi Satyanveshi", "Sharabindu Bandypadhay", "Unknown", 200, 150, "Ukonwn");
        book1.display();
        book2.display();
    }
}