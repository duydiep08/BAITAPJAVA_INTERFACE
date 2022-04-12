import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Book> BookList = new ArrayList<Book>();
    static Scanner input = new Scanner(System.in);
    static void menu() {
        System.out.println("1. Insert new book");
        System.out.println("2. View list of books");
        System.out.println("3. Average Price");
        System.out.println("4. Exit");
    }
    static void insertNewBook() {
        Book book = new Book();
        book.id = BookList.size()+1;
        System.out.print("Input name: ");
        input.nextLine();
        book.name = input.nextLine();
        System.out.print("Input pubLish date :");
        book.publishDate = input.nextLine();
        System.out.println("Input author: ");
        book.author = input.nextLine();
        System.out.print("Input Language: ");
        book.language = input.nextLine();
        System.out.println("Input 5 prices: ");
        for (int i = 0; i <book.priceList.length ; i++) {
            System.out.printf("Price %d : ",i+1);
            book.priceList[i] = input.nextInt();
        }
        BookList.add(book);
    }
    static void viewListofBook() {
        if(BookList.isEmpty()) {
            System.out.println("No book");
        }else {
            for(Book book :BookList) {
                book.display();
            }
        }
    }
    static void averatePrice1() {
        if(BookList.isEmpty()) {
            System.out.println("No book");
        }else {
            for(Book book :BookList) {
                book.calculate();
                book.display();
            }
        }
    }
    public static void main(String[] args) {
        menu();

        while (true){
            System.out.println("please enter an option: ");
            switch (input.nextInt()) {
                case 1:
                    insertNewBook();
                    break;

                case 2:
                    break;
                case 3:
                    averatePrice1();
                case 4: return;
            }
        }
    }

}