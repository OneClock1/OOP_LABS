import Book.Libary.Book;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Main {
    private ArrayList<Book> bookList = new ArrayList<Book>();
    public static void main(String[] args) {
        Main main = new Main();

        Book book1 = new Book(1,
                "Так, але...",
                "Тарас Прохасько",
                "Meridian Czernowitz",
                2021,
                152,
                300);

        Book book2 = new Book(34,
                "Перфекціоністи. Як інженери створили сучасний світ",
                "Саймон Вінчестер",
                "Meridian Czernowitz",
                2019,
                448,
                350);
        Book book3 = new Book(34,
                "Майбутнє розуму. Наукові спроби осягнути, вдосконалити і підсилити інтелект",
                "Мічіо Кайку",
                "Літопис",
                2017,
                408,
                400);

        main.bookList.add(book1);
        main.bookList.add(book2);
        main.bookList.add(book3);

        boolean isActive = true;
        while (isActive){
            System.out.printf("\nКритерії за пошуком:\n"+
                    "1.По списку книг, заданого автора.\n"+
                    "2.По списку книг, що видані заданим видавництвом.\n"+
                    "3.По списку книг, що випущені після заданого року.\n" +
                    "4.Вийти з програми.\n"+
                    "Виберіть критерій за якими буде робитись пошук:"
            );
            Scanner s = new Scanner(System.in);
            int select = s.nextInt();

            switch (select)
            {
                case(1):
                    System.out.print("Ведіть автора: ");
                    s = new Scanner(System.in);
                    System.out.println(main.searchAuthor(s.nextLine()));
                    break;
                case(2):
                    System.out.print("Ведіть видавництво: ");
                    s = new Scanner(System.in);
                    System.out.println(main.searchPublisher(s.nextLine()));
                    break;
                case(3):
                    System.out.print("Ведіть рік: ");
                    s = new Scanner(System.in);
                    System.out.println(main.searchYearPublication(s.nextInt()));
                    break;
                case(4):
                    isActive = false;
                    break;

            }
        }
    }

    public String searchAuthor(String author){
        String result = "";
        for (int i = 0; i < bookList.size(); i++ ){
            if(author.equals(bookList.get(i).getAuthor()))
                result += "\n\n"+ bookList.get(i).toString();
        }
        return result;
    }
    public String searchPublisher(String publication){
        String result = "";
        for (int i = 0; i < bookList.size(); i++ ){
            if(publication.equals(bookList.get(i).getPublication()))
                result += "\n\n"+ bookList.get(i).toString();
        }
        return result;
    }
    public String searchYearPublication(int year){
        String result = "";
        for (int i = 0; i < bookList.size(); i++ ){
            if(bookList.get(i).getYearPublication() >= year)
                result += "\n\n"+ bookList.get(i).toString();
        }
        return result;
    }
}