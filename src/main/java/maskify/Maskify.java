package maskify;

public class Maskify {
    public String masikfy(String str) {
        if (str.length() < 4) {
            return str;
        }
        String[] strArray = str.split("");
        for (int i = 0; i < strArray.length - 4; i++) {
            strArray[i] = "#";
        }
        return String.join("", strArray);
    }
}
