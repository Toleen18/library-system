
public class Main {
    public static void main(String [] args){
        Book myBook  = new Book("Diary of a kis","Tom",89.9,500);
        myBook.printDetail();
        Book Book2 = new Book(myBook);
        System.out.println( "Change one of the characteristics :" + Book2.getPages());
    }
}