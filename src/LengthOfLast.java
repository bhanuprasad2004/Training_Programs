public class LengthOfLast {
    public static void main(String[] args) {
        String s = "Bhanu Prasad";
        lastword(s);
    }
    static void lastword(String s) {
        String str = s.trim();
        int count = 0;
        for (int i = str.length()-1; i>=0; i--) {
            if (str.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
