public class StringEx{
    public static void forwards(String str){
        for (char i : str.toCharArray() ) System.out.print(i);
        for (int i=0; i < str.length(); i++) System.out.println(str.charAt(i));
    }
    
    public static String backwards(String str){
        String result = "";
        for (int i=str.length()-1; i>=0; i--) result += str.charAt(i);
        return result;
    }

    public static boolean isIsomorphic(String one, String two){
        // create and empty array to store letters
        char[] oArr = new char[256];
        char[] tArr = new char[256];

        for (int i=0; i<one.length(); i++){
            // get each letter
            char oChar = one.charAt(i);
            char tChar = two.charAt(i);

            if(oArr[oChar] == 0 && tArr[tChar] == 0){
                // swap and add to arr
                oArr[oChar]  = tChar;
                tArr[tChar]  = oChar;
            // if the added letter is not the letter in the second word
            } else if (oArr[oChar] != tChar){
                System.out.println(oArr[oChar] + " != " + tChar);
                return false;
            }
        }

        return true;
    }

    public static boolean isSubsequence(String one, String two){
        if(one.length() > two.length()){
            return false;
        }
        if(one.length() == 0)
            return true;
        int i = 0, j = 0;
        while(i < two.length() && j < one.length()){
            if(two.charAt(i) == one.charAt(j))
                j++;
            i++;
        }
        if(j == one.length())
            return true;
        return false;
    }
    public static void main(String[] args) {
        // forwards("xtina");

        //System.out.println( backwards("xtina") );
        // System.out.println( isIsomorphic("badc", "baba" ) ); // false
        // System.out.println( isIsomorphic("egg", "add" ) ); // true
        //System.out.println( isIsomorphic( "paper", "title" ) ); // true
        System.out.println( isSubsequence("abc", "ahbgdc") );
    }
}