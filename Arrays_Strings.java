public class Arrays_Strings{
    public static char[] reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
        return s;
    }

    public static int maxArea(int[] arr) {
        int maxArea = 0;
        int i = 0;
        int j = arr.length - 1;

        while (i < j){
            int width = j - i;
            int area = Math.min(arr[i], arr[j]) * width;
            maxArea = Math.max(maxArea, area);

            if(arr[i] <= arr[j])
                // move towards larger
                i++;
            else
                // move towards larger
                j--;
        }
        return maxArea;
    }
    public static void main(String[] args) {
        // reverse character array
        //System.out.println( reverseString(new char[] {'h','e','l','l','o'}) );
        System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    }
}