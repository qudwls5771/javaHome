package slimeLand;

public class Book {
    public String title;
    public String author;


    void show(){
        System.out.println(title + author);
    }

    public Book(){
        this(" ");
        System.out.println("생성자 호출됨");
    }

    public Book(String title) {
        this(title, "작자미상");
    }

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args){
        Book emptyBook = new Book();
        emptyBook.show();

        Book loveStory = new Book("신데렐라");
        loveStory.show();
    }
    
}
