public class Book extends Item {
  private String author;
  private int numberOfPages;
  private String genre;

  public Book(String name, String description, String ID, float price, String author, int numberOfPages, String genre){
    super(name,description,ID,price);
    this.author = author;
    this.numberOfPages = numberOfPages;
    this.genre = genre;
  }
     public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
