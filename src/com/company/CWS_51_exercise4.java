package com.company;

class Library{
    public String [] bookShelf;
    public int no_of_books;

    Library(){
        this.bookShelf = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String bookName){
        this.bookShelf[no_of_books] = bookName;
        no_of_books++;
        System.out.println(bookName+ " has been added!");
    }

    void issueBook(String isBook){
        for (int i=0;i<this.bookShelf.length;i++){
            if (this.bookShelf[i].equals(isBook)){
                System.out.println(isBook+ " has been issued");
                this.bookShelf[i] = null;
            }
        }
        System.out.println("THis book does not exist");
    }

    void showAvailableBooks(){
        System.out.println("Available books are: ");
           for (String availableBooks: this.bookShelf){
               if (availableBooks == null){
                   continue;
               }
               System.out.println("--> "+availableBooks);
           }
    }

    void returnBook(String reBook){
        addBook(reBook);
    }

}
public class CWS_51_exercise4 {
    public static void main(String[] args) {
        Library l = new Library();
        l.addBook("Android");
        l.addBook("Python");
        l.addBook("DSA");
        l.addBook("C++");
        l.showAvailableBooks();

        l.issueBook("Java");
        l.showAvailableBooks();
    }
}
