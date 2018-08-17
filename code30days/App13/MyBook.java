package code30days.App13;


class MyBook extends Book {

    String title;
    String author;
    int price;

    public MyBook(String title, String author, int price) {
        super(title, author);
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
