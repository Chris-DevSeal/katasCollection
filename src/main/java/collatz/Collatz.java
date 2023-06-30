package collatz;

public class Collatz {
    public String collatz(int n) {
        StringBuilder s = new StringBuilder();
        while (n != 1) {
            s.append(n);
            s.append("->");
            n = n % 2 == 0 ? n / 2 : 3 * n + 1;
        }
        s.append(1);
        return s.toString();
    }
}
