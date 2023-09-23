class Pallindrome {
    public boolean isPalindrome(int x) {
        int temp = 0;
        int og = x;
        int r = 0;

        while (x > 0) {
            r = x % 10;
            temp = temp * 10 + r;
            x = x / 10;
        }
        System.out.println(temp);

        if (temp == og) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Pallindrome p = new Pallindrome();
        System.out.println(p.isPalindrome(121));
    }
}