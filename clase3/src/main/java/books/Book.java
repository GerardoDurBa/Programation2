package books;

public class Book {
    String title;
    int ammount;
    String genre;
    int id;
    String loanDate;
    String returnDate;
    boolean available;

    public Book(String title, int ammount, String genre, int id) {
        this.title = title;
        this.ammount = ammount;
        this.genre = genre;
        this.id = id;
        this.available = true;
    }
    
    
    
    public void lendBook(){
        this.available=false;
    }
    void returnBook(){
        this.available=true;
    }

    public boolean isAvailable() {
        return available;
    }
    
    
}
