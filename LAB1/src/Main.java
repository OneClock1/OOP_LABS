import Book.Libary.Book;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    private ArrayList<Book> bookArrayList = new ArrayList<Book>();
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

        main.bookArrayList.add(book1);
        main.bookArrayList.add(book2);
        main.bookArrayList.add(book3);

        boolean isActive = true;
        while (isActive){
            System.out.printf("\nКритерії за пошуком:\n"+
                    "1.По списку книг, заданого автора.\n"+
                    "2.По списку книг, що видані заданим видавництвом.\n"+
                    "3.По списку книг, що випущені після заданого року.\n" +
                    "4.Вийти з програми.\n"+
                    "Виберіть критерій за якими буде робитись пошук:"
            );
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt())
            {
                case(1):
                    System.out.print("Ведіть автора: ");
                    scanner = new Scanner(System.in);
                    System.out.println(main.searchAuthor(scanner.nextLine()));
                    break;
                case(2):
                    System.out.print("Ведіть видавництво: ");
                    scanner = new Scanner(System.in);
                    System.out.println(main.searchPublisher(scanner.nextLine()));
                    break;
                case(3):
                    System.out.print("Ведіть рік: ");
                    System.out.println(main.searchYearPublication(scanner.nextInt()));
                    break;
                case(4):
                    isActive = false;
                    break;

            }
        }
    }

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