public enum Book {
    SE("software Engineering","2015" ),
    JP("java programming","2016"),
    PP("python programming","2017"),
    WA("web application","2018");

    private final String bookName;
    private final String copyrightYear;

    Book(String bookName, String copyrightYear) {
        this.bookName = bookName;
        this.copyrightYear = copyrightYear;
    }
    public String getBookName(){
        return bookName;
    }
    public String getCopyrightYear(){
        return copyrightYear;
    }
}
