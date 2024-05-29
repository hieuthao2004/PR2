package tutorial_2;

public class BitReturn {
    static String DecToBin(long num) {
        String s = "";
        while (num > 0) {
            long remainder = num % 2;
            s = remainder + s;
            num /= 2;
        }
        return s;
    }

    static int lowestCommon(long num1, long num2) {
        String bin1 = DecToBin(num1);
        String bin2 = DecToBin(num2);
        int smaller_length = 0;
        if (bin1.length() < bin2.length()) {
            smaller_length = bin1.length();
        } else {
            smaller_length = bin2.length();
        }
        for (int i = smaller_length -1 ; i >=0; i--) {
            if (bin1.charAt(i) == bin2.charAt(i)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(DecToBin(14));
        System.out.println(DecToBin(15));
        System.out.println(lowestCommon(14, 15));
        

    }
}
