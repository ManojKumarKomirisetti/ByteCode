class TestFridayLongestPalindrome {

    public int show(String Str) {
        int n = Str.length();
        int i = 0;
        for (i = 0; i <= n - 1; i++) {
            if (Str.charAt(i) != Str.charAt(n - 1 - i)) {

                break;
            }

        }
        if (i == n)
            return Str.length();
            else

            return 0;

    }

    public static void main(String rgs[]) {

        TestFridayLongestPalindrome obj = new TestFridayLongestPalindrome();
        String Str = "Book madam pen malayalam  aaaaaaaazaaaaaaaa";

        String s[] = Str.split(" ");

        int length = 0, max = 0, k = 0;
        String s1 = null;

        /*
         * for (int i = 0;i<s.length;i++)
         * {
         * length = 0;
         * for (int j = s[i].length() -1 ; j>=0 ;j--)
         * {
         * s1 = "" + s[i].charAt(j);
         * 
         * }
         * 
         * if(s[i].equals(s1))
         * {
         * length = s[i].length() ;
         * 
         * if(length > max)
         * {
         * max = length ;
         * k = i;
         * }
         * }
         * System.out.println(s[i].length());
         * }
         */
        for (int i = 0; i < s.length; i++) {
            length = obj.show(s[i]);
            if (length > max) {
                max = length;
                k = i;
            }
        }

        System.out.println("Longest Plindrome:" + s[k] + "\n" + "Length:" + max);
    }
}