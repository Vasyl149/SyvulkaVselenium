package enums;

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
            namesOfItems.add(item.toString());
        }
        return namesOfItems;
    }

    @Override
    public String toString() {
        return value;
    }
}
