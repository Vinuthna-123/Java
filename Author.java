class Library{
    int no_books;
    void msg(int no_books){
        System.out.println("Total no of books in library is:"+no_books);
    }
}
class Book extends Library{
    String book_name;
    void msg1(String book_name){
        this.book_name=book_name;
        System.out.println("Book name is:"+book_name);

    }

}
class Author extends Library{
    String author_name;
    String biography;
    void msg2(String author_name,String biography){
        this.author_name=author_name;
        this.biography=biography;
        System.out.println("The author name is:"+author_name + "\nBiography"+biography);
    }
    public static void main(String args[]){
        Book b = new Book();
        Author a = new Author();
        b.msg(20);
        b.msg1("Secerts");
        a.msg2("Sudha Murthy","it was soo good.");
    }
    
}
