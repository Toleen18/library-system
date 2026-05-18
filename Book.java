public class Book {
    private String title ;
    private String author;
    private double price ;
    private int pages;

    public Book(String title, String author, double price, int pages) {
        this.title=title;
        this.author=author;
        this.price=price;
        this.pages=pages;
    }

    public Book(Book other){
        this.pages=300;
    }


    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void printDetail(){
        System.out.println("Title ="  + title);
        System.out.println("Author ="  + author);
        System.out.println("price ="  + price);
        System.out.println("pages ="  + pages);

    }

        public String toString() {
        return "Book {Title = " + title + ", Author = " + author +"Price = "+price+"pages = "+pages+ "}";
    }


}
