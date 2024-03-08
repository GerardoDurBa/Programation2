package books;

public class Book {
    String title;
    String genre;
    String author;
    int ammount;
    int id;
    String loanDate;
    String user; 
    String returnDate;
    boolean available;
    boolean lend;

    public Book(String title, String genre, String author, int ammount, int id, String loanDate, String user, String returnDate) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.ammount = ammount;
        this.id = id;
        this.loanDate = loanDate;
        this.user = user;
        this.returnDate = returnDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
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
