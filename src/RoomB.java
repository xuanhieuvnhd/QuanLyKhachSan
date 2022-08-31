import java.text.NumberFormat;
import java.util.Locale;

public class RoomB extends Room{
    public RoomB() {
        super("B", 300000);
    }

    @Override
    public String toString() {
        Locale locale = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        return ",Vip B{" +
                "Loai phong: '" + category + '\'' +
                ", Gia phong: " + numberFormat.format(price) + " VND"+
                '}';
    }
}
