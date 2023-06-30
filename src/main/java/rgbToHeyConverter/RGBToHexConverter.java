package rgbToHeyConverter;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Integer.toHexString;


public class RGBToHexConverter {
    public String rgb(int r, int g, int b) {
        Color col = getColorOfValues(List.of(r, g, b));
        return Arrays.stream(toHexString(col.getRGB()).split(""))
                .skip(2)
                .collect(Collectors.joining("")).toUpperCase();
    }

    private Color getColorOfValues(List<Integer> values) {
        List<Integer> val = values.stream().map(integer -> integer > 255 ? 255 : integer < 0 ? 0 : integer).toList();
        return new Color(val.get(0), val.get(1), val.get(2));
    }
}
