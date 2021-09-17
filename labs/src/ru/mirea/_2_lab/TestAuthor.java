package ru.mirea._2_lab;

public class TestAuthor {
    public static void main(String[] args) {
        Author author_1 = new Author("Ivan", "SomeEmail.mail.ru", 'M');
        Author author_2 = new Author("Emely Jonson", "AnotherEmail@gmail.com", 'F');

        System.out.println(author_1);
        System.out.println(author_2);

        author_1.setEmail("NewEmail@bk.ru");

        System.out.println(author_1);
    }
}
