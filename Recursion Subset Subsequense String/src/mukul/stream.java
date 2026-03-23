package mukul;

public class stream {
    static void main() {
        System.out.println(Skip("baccad"));

    }

    static void skip(String p, String up) {// p = processed and up = unprocessed
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }

    }

    static String Skip( String up) {// p = processed and up = unprocessed
        if (up.isEmpty()) {
            return"";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
           return Skip(up.substring(1));
        } else {
            return ch + Skip(up.substring(1));
        }

    }
}
