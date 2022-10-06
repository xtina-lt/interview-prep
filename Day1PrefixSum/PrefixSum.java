public class PrefixSum{
    public static int[] runningSum(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            // add the next number to the previous number
            // save as the next number
            arr[i] += arr[i - 1];
            /*  2 : 1
            3 : 3
            4 : 6 */
        }
        return arr;
    }

    public static int pivotIndex(int[] arr){
        // initialize right and left sums
        int right = 0, left = 0;
        // get right sum
        for (int i: arr) right += i;
        // get left sum
        for (int i = 0; i < arr.length; ++i) {
            // if left sum is the same as right sum minus element
            // return index
            if (left == (right - arr[i])) return i;
            // else
            // add element to left sum
            // subtract element from right sum
            left += arr[i];
            right -= arr[i];
        }
        // if nothing return -1
        return -1;
    }
    public static void main(String[] args) {
        // System.out.println("Test java");
        runningSum(new int[] {1,2,3,4});
        System.out.println( pivotIndex(new int[] {1,7,3,6,5,6}) );
    }
}