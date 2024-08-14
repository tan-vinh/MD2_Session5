package ra.entity;

import java.util.Scanner;

public class Book {
    private String bookId;
    private String bookName;
    private float importPrice;
    private float exportPrice;
    private String author;
    private float interest;
    private int year;

    public Book() {
    }

    public Book(String bookId, String bookName, float importPrice, float exportPrice, float interest, String author, int year) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.author = author;
        this.interest = interest;
        this.year = year;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID Sack: ");
        this.bookId = sc.nextLine();
        System.out.println("Nhap Ten Sach: ");
        this.bookName = sc.nextLine();
        System.out.println("Nhap Gia Nhap: ");
        this.importPrice = Float.parseFloat(sc.nextLine());
        System.out.println("Nhap Gia Xuat: ");
        this.exportPrice = Float.parseFloat(sc.nextLine());
        System.out.println("Nhap Tac Gia: ");
        this.author = sc.nextLine();
        System.out.println("Nhap Nam SX: ");
        this.year = Integer.parseInt(sc.nextLine());
        System.out.println();
    }

    public void displayData(){
        System.out.println("======Thong tin sach======");
        System.out.println("ID Sach: " + this.bookId);
        System.out.println("Ten Sach: " + this.bookName);
        System.out.println("Gia Nhap: " + this.importPrice);
        System.out.println("Gia Xuat: " + this.exportPrice);
        System.out.println("Tac Gia: " + this.author);
        System.out.println("Nam SX: " + this.year);
    }

    public void prosesInterest(){
        this.interest = this.exportPrice - this.importPrice;
        this.displayData();
        System.out.println("Loi Nhuan: " + this.interest);
    }
}
