import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        while (true) {
            System.out.println("---------Quan Ly Khach San----------");
            System.out.println("1. Them khach thue");
            System.out.println("2. Xoa khach thue theo so CCCD");
            System.out.println("3. Tinh tien phong theo CCCD");
            System.out.println("4. Hien thi thong tin khach thue");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("------------------------------------------");
            System.out.print("--- > Chon chuc nang de tiep tuc: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> {
                    System.out.print("Nhap ten: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhap tuoi: ");
                    int age = scanner.nextInt();
                    System.out.print("Nhap CCCD: ");
                    scanner.nextLine();
                    String passport = scanner.nextLine();
                    System.out.println("a. Chon Vip A");
                    System.out.println("b. Chon Vip B");
                    System.out.println("c. Chon Vip C");
                    String choise = scanner.nextLine();
                    Room room;
                    if ("a".equals(choise)) {
                        room = new RoomA();
                    } else if ("b".equals(choise)) {
                        room = new RoomB();
                    } else if ("c".equals(choise)) {
                        room = new RoomC();
                    } else {
                        continue;
                    }
                    System.out.print("Nhap so ngay thue: ");
                    int numberRent = scanner.nextInt();
                    Person person = new Person(name, age, passport, room, numberRent);
                    hotel.add(person);
                    scanner.nextLine();
                }
                case "2" -> {
                    System.out.print("Nhap CCCD: ");
                    String passport = scanner.nextLine();
                    hotel.delete(passport);
                }
                case "3" -> {
                    System.out.print("Nhap CCCD: ");
                    String passport = scanner.nextLine();
                    System.out.println("Gia phong: " + hotel.calculator(passport));
                }
                case "4" -> {
                    hotel.show();
                }
                case "0" -> {
                    System.exit(0);
                }
                default -> System.err.println("Khong hop le");
            }
        }
    }
}
