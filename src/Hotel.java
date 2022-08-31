import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Person> persons;

    public Hotel() {
        persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
        System.out.println("Them khach thue thanh cong!");
    }

    public boolean delete(String passport) {
        Person person = this.persons.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);
        if (person == null) {
            return false;
        } else {
            this.persons.remove(person);
            System.out.println("Xoa thong khach thue thanh cong!");
            return true;
        }
    }

    public int calculator(String passport) {
        Person person = this.persons.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);
        if (person == null) {
            return 0;
        }
        System.out.println("Tong so tien khach phai thanh toan: ");
        return person.getRoom().getPrice() * person.getNumberRent();
    }

    public void show() {
        System.out.println("Danh sach cac khach thue: ");
        this.persons.forEach(p -> System.out.println(p.toString()));
    }
}
