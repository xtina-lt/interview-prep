public class Arrays{
    public static void forward(int[]arr){
        for (int i : arr)
            System.out.println(i);

        for (int i=0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    public static void backwards(int[] arr){
        for (int i=arr.length-1; i >=0; i--) System.out.println(arr[i]);
    }
    
    public static void shiftLeft(int[] arr){
        for (int i=1; i<arr.length; i++) 
            arr[i-1] = arr[i];
        
        for (int i : arr)
            System.out.print(i);
    }

    public static void shiftRight(int[] arr){
        for (int i=arr.length-1; i>0; i--)
            arr[i] = arr[i-1];
        
        for (int i: arr)
            System.out.print(i);
    }

    public static int[] pushFront(int[] arr, int num){
        // allocate memory
        int[] arr2 = new int[arr.length];
        // add in numberrs and keep space for inserted num
        for (int i=0; i < arr.length-1; i++){
            arr2[i+1] = arr[i];
        }
        // insert num
        arr2[0] = num;
        // print
        for (int j : arr2) System.out.println(j);

        // return array
        return arr2;
    }

    public static int popFront(int[] arr){
        int[] arr2 = new int[arr.length-1];
        for (int i=1; i<arr.length; i++)
            arr2[i-1] = arr[i];
        
        for (int i: arr2) System.out.println(i);

        return arr[0];
    }

    public static void insertAt(int[]arr, int index, int num){
        //initialize a new array add a number
        int[] arr2 = new int[arr.length+1];
        // shift right until index
        for(int i=arr.length; i > index; i--)
            arr2[i] = arr[i-1];
        // insert left
        for(int i=0; i<index; i++)
            arr2[i] = arr[i];
        //insert number
        arr2[index] = num;

        for (int i : arr2) System.out.println(i);
    }

    public static void removeAt(int[]arr, int index){
        int[] arr2 = new int[arr.length-1];
        for (int i=0; i<index; i++)
            arr2[i] = arr[i];
        for (int i=arr.length-1; i > index; i--)
            arr2[i-1] = arr[i];
        
        for (int i : arr2) System.out.println(i);
    }
    public static void main(String[] args) {
        // forward(new int[] {1,2,3,4,5});
        // backwards(new int[] {1,2,3,4,5});
        // shiftLeft(new int[] {1,2,3,4,5});
        // shiftRight(new int[] {1,2,3,4,5});
        // pushFront(new int[] {0, 5, 10, 15}, 8);
        //System.out.println( popFront(new int[] {0, 5, 10, 15}) );
        // insertAt(new int[] {100,200,5}, 2, 333);
        // removeAt(new int[] {1000,3,204,77}, 1);
    }
}