package deadFish;

import java.util.Arrays;

public class DeadFish {
    public int[] parse(String data) {
        String[] commands = data.split("");
        int outputLength = (int) Arrays.stream(commands).filter(command -> command.equals("o")).count();
        int[] output = new int[outputLength];
        int currentOutputStep = 0;
        int currentVal = 0;
        for (String command : commands) {
            switch (command) {
                case "i" -> ++currentVal;
                case "s" -> currentVal = (int) Math.pow(currentVal, 2);
                case "d" -> --currentVal;
                case "o" -> output[currentOutputStep++] = currentVal;
            }
        }
        return output;
    }
}
