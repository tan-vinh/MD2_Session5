package ra.entity;

import java.util.*;

public class BookImp {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<Book>();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("*********************MENU******************\n" +
                    "1. Nhập thông tin n sách (n nhập từ bàn phím)\n" +
                    "2. Tính lợi nhuận các sách\n" +
                    "3. Hiển thị thông tin sách\n" +
                    "4. Sắp xếp sách theo giá bán tăng dần\n" +
                    "5. Sắp xếp sách theo lợi nhuận giảm dần\n" +
                    "6. Tìm sách theo tên sách (tên sách nhập từ bàn phím)\n" +
                    "7. Thống kê số lượng sách theo năm xuất bản\n" +
                    "8. Thống kê số lượng sách theo tác giả\n" +
                    "9. Thoát");
            System.out.println("Hãy chọn từ 1 đến 9:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Mời nhập số lượng sách cần nhập.");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        Book book = new Book();
                        book.inputData();
                        list.add(book);
                    }
                    break;
                case 2:
                    for (Book book : list) {
                        book.prosesInterest();
                    }
                    break;
                case 3:
                    System.out.println("Hiện thị danh sách:");
                    for (Book book : list) {
                        book.displayData();
                    }
                    break;
                case 4:
                    list.sort(Comparator.comparing(Book::getExportPrice));
                    for (Book book : list) {
                        book.displayData();
                    }
                    break;
                case 5:
                    list.sort(Comparator.comparing(Book::getInterest));
                    for (Book book : list) {
                        book.displayData();
                    }
                    break;
                case 6:
                    System.out.print("Nhập tên sách cần tìm:");
                    String name = sc.next();
                    for (Book book : list) {
                        if (book.getBookName() == name){
                            book.displayData();
                        }
                    }
                    break;
                case 7:
                    int sumYear = 0;
                    System.out.println("Nhập năm muốn thống kê:");
                    int yearCheck = sc.nextInt();
                    for (Book book : list) {
                        if (book.getYear() == yearCheck){
                            sumYear += 1;
                        }
                    }
                    System.out.println("Số lượng sách trong năm " + yearCheck + " là: " + sumYear);
                    break;
                case 8:
                    int sumAuthor = 0;
                    System.out.println("Nhập năm muốn thống kê:");
                    String authorCheck = sc.nextLine();
                    for (Book book : list) {
                        if (Objects.equals(book.getAuthor(), authorCheck)){
                            sumAuthor += 1;
                        }
                    }
                    System.out.println("Số lượng sách trong năm " + authorCheck + " là: " + sumAuthor);
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.err.println("Mời bạn chọn lại.");
            }
        }while (true);
    }
}
