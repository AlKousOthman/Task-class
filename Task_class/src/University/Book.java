package University;

public class Book {


    String title;
    String author;

    //constructer
    Book(String bookTitle, String bookAuthor){
        title = bookTitle;
        author = bookAuthor;
    }

    //getter for title
    public String getTitle(){
        return title;
    }

    public void setTitle(String newTitle){
        title = newTitle;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String newAuthor){
        author = newAuthor;
    }

    public static void main(String[]args) throws Exception {

        Book myFavoriteBook = new Book ("Clean code", "Othman ALKous");

        System.out.println("Book title " + myFavoriteBook.getTitle());
        System.out.println("Booke Author " + myFavoriteBook.getAuthor());



    }
    
}
