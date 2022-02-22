package enums;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public enum MenuListEnum {
    INBOX("Вхідні"),
    DRAFTS("Чернетки"),
    SENT("Надіслані"),
    SPAM("Спам"),
    TRASH("Видалені"),
    UNDREAD("Непрочитані"),
    MARKED("Відмічені"),
    FILES("Вкладення");

    private final String value;

    MenuListEnum(String value) {
        this.value = value;
    }

    public static List<String> getNamesOfItems() throws UnsupportedEncodingException {


        List<String> namesOfItems = new ArrayList<>();
        for (MenuListEnum item : MenuListEnum.values()) {
            namesOfItems.add(item.tee());
        }
        return namesOfItems;
    }

    public static void qt() throws FileNotFoundException, UnsupportedEncodingException {

    }

    public String tee() throws UnsupportedEncodingException {
        byte[] a = value.getBytes();
        String b = new String(a, "UTF-8");
        return b;
    }



    @Override
    public String toString() {
        return value;
    }
}
