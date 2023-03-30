package Book.Libary;

public class Book {
    protected int id;
    protected String name;
    protected String author;
    protected String publication;
    protected int yearPublication;
    protected float price;

    public Book(int id, String name, String author, String publication, int yearPublication, float price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publication = publication;
        this.yearPublication = yearPublication;
        this.price = price;
    }
    public int getId(){
        return id;}
    public void setId(int id){
        this.id = id;}

    public String getName(){
        return name;}
    public void setName(String name){
        this.name = name;}

    public String getAuthor(){
        return author;}
    public void setAuthor(String author){
        this.author = author;}

    public String getPublication(){
        return publication;}
    public void setPublication(String publication){
        this.publication = publication;}

    public int getYearPublication(){
        return yearPublication;}
    public void setYearPublication(int yearPublication){
        this.yearPublication = yearPublication;}

    public float getPrice(){
        return price;}
    public void setPrice(float price){
        this.price = price;}

}
