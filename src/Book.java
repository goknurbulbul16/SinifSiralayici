public class Book implements Comparable{

    private String bookName;
    private int numberPage;
    private String writerName;
    private String date;

    public Book(String bookName, int numberPage, String writerName, String date) {
        this.bookName = bookName;
        this.numberPage = numberPage;
        this.writerName = writerName;
        this.date = date;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString(){
        return "Book Name: " + bookName + ", Page Number: " + numberPage  + ", Book Writer: " + writerName + ", Date: " + date;
    }

    @Override
    public int compareTo(Object o) {
        Book temp = (Book) o;
        return this.bookName.compareTo(temp.getBookName());
    }
}
