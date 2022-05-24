package Z_New_era.C_KitapSiralayici;

public class Book implements Comparable<Book>{
    private String name;
    private int pageCount;
    private String bookOwner;
    private int publishDate;

    public Book(String name, int pageCount, String bookOwner,  int publishDate) {
        this.name = name;
        this.bookOwner = bookOwner;
        this.publishDate = publishDate;
        this.pageCount = pageCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookOwner() {
        return bookOwner;
    }

    public void setBookOwner(String bookOwner) {
        this.bookOwner = bookOwner;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public int compareTo(Book o) {
        return this.getName().compareTo(o.getName());

    }
}
