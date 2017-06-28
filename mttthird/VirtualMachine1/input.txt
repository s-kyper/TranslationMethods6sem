public class Euclid {
    public static void main(String[] args) {
        int lol;
        int a;
        int b = 3;

        a = 5;
        b = 25;

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        lol = b;
        lol = a;
    }
}
