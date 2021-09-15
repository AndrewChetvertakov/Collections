package unit4;

public class Something {

static String author = "Rowling";

static {
    author = "King";
}

    public static void main(String[] args) {

    Something b1 = new Something();
    b1.author = "Chris";
    Something b2 = new Something();
        System.out.println(b1.author.equals(b2.author));


    }



}
