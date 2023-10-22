public class RemoveColor {
    public boolean winnerOfGame(String colors) {
        int bob = 0, alice = 0;
        int b = 0, a = 0;
        int n = colors.length();
        for (int i = 0; i < n; i++) {
            if (colors.charAt(i) == 'A') {
                a++;
                if (b != 0) {
                    b = 0;
                }
                if (a == 3) {
                    alice++;
                    a = a - 1;
                }
            } else {
                b++;
                if (a != 0) {
                    a = 0;
                }
                if (b == 3) {
                    bob++;
                    b = b - 1;
                }
            }
        }
        while (alice >= 0 || bob >= 0) {
            alice--;
            if (alice < 0) {
                return false;
            }
            bob--;
            if (bob < 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        RemoveColor rc = new RemoveColor();
        String colors = "AAABABB";
        System.out.println(rc.winnerOfGame(colors));
    }
}
