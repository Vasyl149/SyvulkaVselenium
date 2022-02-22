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

    public static List<String> getNamesOfItems(){


        List<String> namesOfItems = new ArrayList<>();
        for (MenuListEnum item : MenuListEnum.values()) {
            namesOfItems.add(item.tee());
        }
        return namesOfItems;
    }

    public static void qt() throws FileNotFoundException, UnsupportedEncodingException {

    }

    public String tee(){
        byte[] a = value.getBytes(StandardCharsets.UTF_8);
        String b = a.toString();
        return b;
    }



    @Override
    public String toString() {
        return value;
    }
}
