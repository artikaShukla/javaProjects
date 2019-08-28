package designpatterns.Creational;

public class BuilderPatterBooks {


    private final String fiction;
    private final String nonFiction;
    private final String drama;
    private final String comedy;


    private BuilderPatterBooks(BooksDetail booksDetail) {
        this.fiction = booksDetail.fiction;
        this.nonFiction = booksDetail.nonFiction;
        this.drama = booksDetail.drama;
        this.comedy = booksDetail.comedy;
    }

    public String getFiction() {
        return fiction;
    }

    public String getNonFiction() {
        return nonFiction;
    }

    public String getDrama() {
        return drama;
    }

    public String getComedy() {
        return comedy;
    }

    @Override
    public String toString() {

        return "books" + this.fiction + " " + this.nonFiction + " " + this.drama + " " + this.comedy;
    }

    public static class BooksDetail {
        private String fiction;
        private String nonFiction;
        private String drama;
        private String comedy;

        public BooksDetail fiction(String fiction) {
            this.fiction = fiction;
            return this;
        }

        public BooksDetail nonFiction(String nonFiction) {
            this.nonFiction = nonFiction;
            return this;
        }

        public BooksDetail drama(String drama) {
            this.drama = drama;
            return this;
        }

        public BooksDetail comedy(String comedy) {
            this.comedy = comedy;
            return this;
        }

        public BuilderPatterBooks build() {
            BuilderPatterBooks builderPatterBooks = new BuilderPatterBooks(this);

            return  builderPatterBooks;
        }



    }


    public static void main(String[] args) {
        BuilderPatterBooks books1 = new BooksDetail().drama("This is Drama Book")
                                    .build();
        BuilderPatterBooks books2 = new BooksDetail().fiction("This is fiction book")
                                    .nonFiction("As well as non Fiction Book")
                                    .build();

        System.out.println(books1);
        System.out.println(books2);
    }


}
