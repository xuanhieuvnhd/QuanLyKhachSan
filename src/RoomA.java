import java.text.NumberFormat;
import java.util.Locale;

public class RoomA extends Room{
    public RoomA() {
        super("A", 500000);
    }

    @Override
    public String toString() {
        Locale locale = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        return ",Vip A{" +
                "Loai phong: '" + category + '\'' +
                ", Gia phong: " + numberFormat.format(price) + " VND"+
                '}';
    }
}
