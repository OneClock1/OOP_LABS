package Book.Libary;

public class PaperBook extends Book{

    protected int numberPages;

    public PaperBook(int id, String name, String author, String publication, int yearPublication, int numberPages, float price) {
        super(id,name,author,publication,yearPublication,price);
        this.numberPages = numberPages;
    }

    public int getNumberPages(){
        return numberPages;}
    public void setNumberPages(int numberPages){
        this.numberPages = numberPages;}

    @Override
    public String toString(){
        return "Книжка:"+
                "\nId = "+ id +
                ",\nName = " + name +
                ",\nAuthor = " + author +
                ",\nPublication = " + publication +
                ",\nYear publication = " + yearPublication +
                ",\nNumber pages = " + numberPages +
                ",\nPrice = " + price + "грн";
    }
}
