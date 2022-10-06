var reverseString = function(s) {
    var left = 0, right = s.length - 1;
    while (left < right) {
        var temp = s[left];
        s[left++] = s[right];
        s[right--] = temp;
    }
    return s;
};
console.log( reverseString(['h', 'e', 'l', 'l', 'o']) )

const maxArea = arr =>{
    // 1. Initialize max
    var max=0;
    // 2. For left side loop
        for (var i=0; i<arr.length; i++){
        // 3. For riht side loop starting later
            for (var j=i+1; j<arr.length; j++){
                // 4. Get the min of i and j multiply tat by j-i
                var area = Math.min(arr[i], arr[j]) * (j-i)
                // 5. Get max of current area and current max
                max = Math.max(max, area)   
            }
        }
    return max;
}
console.log(maxArea([1,8,6,2,5,4,8,3,7]))