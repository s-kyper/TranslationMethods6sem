import java.io.*;
import java.util.*;

/**
 * Created by pinkdonut on 20.06.2017.
 */
public class Translator {

    private int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private char[] name = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
    private char[] d = {'C', 'C', 'X', 'X', 'I', 'I', '-'};
    private final int N = value.length;
    private HashMap<Character, Integer> romans = new HashMap<>();

    Translator() {
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);

    }

    public String toDecimal(File input) {
        StringBuilder res = new StringBuilder();
        FastScanner scanner = new FastScanner(input);

        boolean f = true;
        while (f) {
            try {
                String cur = scanner.next();
                if (cur.equals("et"))
                    res.append("+");
                else
                    res.append(decimal(cur));
            } catch (Exception e) {
                f = false;
            }
        }
        return res.toString();
    }

    public String toRoman(int numeral) {
        int[] count = new int[N];
        boolean[] fl = new boolean[N];
        StringBuilder res = new StringBuilder();

        int sum = numeral;
        for (int i = 0; i < N; i++) {
            count[i] += sum / value[i];
            sum %= value[i];
        }

        for (int i = N - 1; i >= 1; i--) {
            if ((i % 2 == 1) && count[i] != 0) {
                count[i - 1]++;
                count[i] = 0;
                fl[i - 1] = true;
            }
        }

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                for(int j = 0; j < count[i] - 1; j++)
                    res.append(name[i / 2]);
                if (fl[i])
                    res.append(d[i / 2]);
                if (count[i] != 0)
                    res.append(name[i / 2]);
            }
        }

        return res.toString();
    }

    private int decimal(String s) {
        int res = 0, cur = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int numeral = romans.get(s.charAt(i));
            if (numeral < cur) {
                res -= numeral;
            } else {
                res += numeral;
                cur = numeral;
            }
        }
        return res;
    }

    static FastScanner in;
    static PrintWriter out;

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        Boolean hasNext() {

            return st.hasMoreTokens();
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }
}
