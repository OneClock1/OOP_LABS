package Book.Libary;

public class AudioBook extends Book{
    private int listeningTime;
    public AudioBook(int id, String name, String author, String publication, int yearPublication, int listeningTime, float price){
        super(id, name, author, publication, yearPublication, price);
        this.listeningTime = listeningTime;
    }
    public int getListeningTime() {
        return listeningTime;
    }
    public void setListeningTime(int listeningTime){
        this.listeningTime = listeningTime;
    }
    @Override
    public String toString(){
        return "Книжка:"+
                "\nId = "+ id +
                ",\nName = " + name +
                ",\nAuthor = " + author +
                ",\nPublication = " + publication +
                ",\nYear publication = " + yearPublication +
                ",\nListening time = " + listeningTime +
                ",\nPrice = " + price + "грн";
    }
}
