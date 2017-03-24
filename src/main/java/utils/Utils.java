package utils;

import java.awt.*;
import java.awt.datatransfer.StringSelection;

public class Utils {
    public static void setClipboardData(String string) {
        StringSelection stringSelection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }
}
