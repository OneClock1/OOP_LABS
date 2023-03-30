package Book.Libary.List;

import Book.Libary.Book;
import Book.Libary.PaperBook;
import java.util.Arrays;
public class BooksList{
    //protected Book[] bookArray = new PaperBook();

    private int size = 0;

    protected Book[] booksArray = new Book[10];
    //protected Book[] bookArray = new PaperBook();

    public void add(Book book) {
        if (size == booksArray.length) {
            booksArray = Arrays.copyOf(booksArray, booksArray.length * 2);
        }
        booksArray[size] = book;
        size++;
    }


    public void remove(int index) {
        System.arraycopy(booksArray, index + 1, booksArray, index, booksArray.length - 1 - index);
    }

    public Book get(int index) {
        return booksArray[index];
    }

    public int getLength() {
        return booksArray.length;
    }



    public String searchAuthor(String author){
        String result = "";
        for (int i = 0; i < getLength(); i++ ){
            if(author.equals(get(i).getAuthor()))
                result += "\n\n"+ get(i).toString();
        }
        return result;
    }
    public String searchPublisher(String publication){
        String result = "";
        for (int i = 0; i < getLength(); i++ ){
            if(publication.equals(get(i).getPublication()))
                result += "\n\n"+ get(i).toString();
        }
        return result;
    }
    public String searchYearPublication(int year){
        String result = "";
        for (int i = 0; i < getLength(); i++ ){
            if(get(i).getYearPublication() >= year)
                result += "\n\n"+ get(i).toString();
        }
        return result;
    }
}

