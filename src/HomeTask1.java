public class HomeTask1 {

    public static String reverseString(char[] s){
        String result = "";
        for(int i = s.length-1;i >= 0; i--){
            result = result + s[i];
        }
        return result;
    }

    public static void main(String[] args) {
       String str = "Hallo!";
       char[] s = str.toCharArray();
        System.out.println(reverseString(s));
    }
}
