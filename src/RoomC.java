import java.text.NumberFormat;
import java.util.Locale;

public class RoomC extends Room{
    public RoomC() {
        super("C", 150000);
    }

    @Override
    public String toString() {
        Locale locale = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getInstance(locale);

        return ",Vip C{" +
                "Loai phong: '" + category + '\'' +
                ", Gia phong: " + numberFormat.format(price) + " VND"+
                '}';
    }
}
