import Book.Libary.Book;
import Book.Libary.PaperBook;

import java.util.Scanner;
import Book.Libary.List.BooksList;


public class Main {

    private int counterId = 1;
    private BooksList paperBookList = new BooksList();
    private boolean isActive = true;
    public static void main(String[] args) {
        Main main = new Main();

        PaperBook book1 = new PaperBook(1,
                "Так, але...",
                "Тарас Прохасько",
                "Meridian Czernowitz",
                2021,
                152,
                300);


        main.paperBookList.add(book1);

        while (main.isActive) {

            System.out.println("...Бібліотека паперових книг...");
            System.out.printf("\nМеню:\n" +
                    "1.Додати книгу.\n" +
                    "2.Вивести всі книги.\n" +
                    "3.Знайти книгу.\n" +
                    "4.Вийти з програми.\n" +
                    "Виберіть критерій за якими буде робитись пошук:"
            );
            Scanner scanner = new Scanner(System.in);
            int select = scanner.nextInt();
            switch (select) {

                case (1):

                    System.out.println("Додати книгу:");

                    scanner.nextLine();
                    main.counterId += 1;

                    System.out.print("Ведіть назву:");
                    String name = scanner.nextLine();

                    System.out.print("Ведіть автора:");
                    String author = scanner.nextLine();

                    System.out.print("Ведіть видавництво:");
                    String publication = scanner.nextLine();
                    System.out.print("Ведіть кількість сторінок:");
                    int numberPages = scanner.nextInt();
                    scanner.nextInt();
                    System.out.print("Ведіть дату видання:");
                    int yearsPublication = scanner.nextInt();
                    scanner.nextInt();
                    System.out.print("Ведіть ціну:");
                    int price = scanner.nextInt();
                    main.paperBookList.add(new PaperBook(main.counterId,name, author, publication, yearsPublication, numberPages, price ));
                    break;
                case (2):
                    System.out.print("Вивести всі книги: ");
                    for(int i = 0 ; i < main.paperBookList.getLength(); i++)
                    {
                        System.out.println(main.paperBookList.get(i).toString());
                    }

                    break;
                case (3):
                   main.Search();
                    break;
                case (4):
                    main.isActive = false;
                    break;

            }
        }
    }
    public void Search(){
        System.out.printf("\nКритерії за пошуком:\n" +
                "1.По списку книг, заданого автора.\n" +
                "2.По списку книг, що видані заданим видавництвом.\n" +
                "3.По списку книг, що випущені після заданого року.\n" +
                "4.Назад.\n" +
                "Виберіть критерій за якими буде робитись пошук:"
        );

        Scanner scanner = new Scanner(System.in);
        int select = scanner.nextInt();
        scanner.nextLine();
        switch (select) {

            case (1):
                System.out.print("Ведіть автора: ");
                System.out.println(paperBookList.searchAuthor(scanner.nextLine()));
                break;
            case (2):
                System.out.print("Ведіть видавництво: ");
                System.out.println(paperBookList.searchPublisher(scanner.nextLine()));
                break;
            case (3):
                System.out.print("Ведіть рік: ");
                System.out.println(paperBookList.searchYearPublication(scanner.nextInt()));
                break;
            case (4):
                break;

        }
    }
}