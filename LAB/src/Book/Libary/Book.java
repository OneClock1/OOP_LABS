import java.util.Date;

public class Book {

    private int id;
    private String name;
    private String author;
    private String publication;
    private Date yearPublication;
    private int numberPages;
    private float price;

    public Book()
    {
    }
    public Book(int id, String name, String author, String publication, Date yearPublication, int numberPages, float price)
    {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publication = publication;
        this.yearPublication = yearPublication;
        this.numberPages = numberPages;
        this.price = price;
    }


    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getAuthor() {return author;}
    public void setAuthor(String author) {this.author = author;}

    public String getPublication() {return publication;}
    public void setPublication(String publication) {this.publication = publication;}

    public Date getYearPublication() {return yearPublication;}
    public void setYearPublication(Date yearPublication) {this.yearPublication = yearPublication;}

    public int getNumberPages() {return numberPages;}
    public void setNumberPages(int numberPages) {this.numberPages = numberPages;}

    public float getPrice() {return price;}
    public void setPrice(float price) {this.price = price;}

}
