package Book.Libary;

import java.util.ArrayList;
import java.util.Scanner;

public class BooksList{
    protected ArrayList<Book> bookArrayList = new ArrayList<Book>();

    public String searchAuthor(String author){
        String result = "";
        for (int i = 0; i < bookArrayList.size(); i++ ){
            if(author.equals(bookArrayList.get(i).getAuthor()))
                result += "\n\n"+ bookArrayList.get(i).toString();
        }
        return result;
    }
    public String searchPublisher(String publication){
        String result = "";
        for (int i = 0; i < bookArrayList.size(); i++ ){
            if(publication.equals(bookArrayList.get(i).getPublication()))
                result += "\n\n"+ bookArrayList.get(i).toString();
        }
        return result;
    }
    public String searchYearPublication(int year){
        String result = "";
        for (int i = 0; i < bookArrayList.size(); i++ ){
            if(bookArrayList.get(i).getYearPublication() >= year)
                result += "\n\n"+ bookArrayList.get(i).toString();
        }
        return result;
    }
}

