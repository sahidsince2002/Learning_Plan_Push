

class Books {
    String title;
    String author;
    int isbn;
    boolean isBorrowed;
    static int totalBooks;

    {
        totalBooks++;
    }

    static { 
        totalBooks=0;
    }

    

    Books(int isbn, String author, String title){
         this.isbn=isbn;
         this.author=author;
         this.title=title;
    }

    void borrowBook(){
        if(isBorrowed){
            System.out.println("The book is already borrowed");
            
        }else {
            System.out.println("There's your book: "+this.title);
            isBorrowed=true;
        }
    }

    void returnBook(){
        if(isBorrowed){
            System.out.println("Thanks for returning: "+ this.title);
            isBorrowed=false;
        }
        else {
            System.out.println("Book is already in the library");
        }
    }

     int totalNoOfBooks(){
       return totalBooks;
    }

 
}


public class BookOOps {
    public static void main(String[] args) {
       Books bk = new Books(1, "nelson", "coolie");
       Books bk2 = new Books(2, "anil", "art");
       System.out.println("Total Number of books in library: "+bk.totalNoOfBooks());
       bk.borrowBook();
       bk.borrowBook();
       bk.returnBook();
      
       bk2.borrowBook();
       bk2.borrowBook();
       bk2.returnBook();
    }
}
