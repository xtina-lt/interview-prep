// console.log("Test JS");
const runningSum = arr =>{
    // add the next number to the previous numebr
    // save in the next number
    for (var i=1; i<arr.length; i++)
        arr[i] += arr[i-1]
    return arr
}

// console.log(runningSum([1,2,3,4]));


const pivotIndex = arr => {
    // intiate a right and left sum
    var right=0, left=0;

    //get the sum for right
    for (i of arr) right+=i

    // if leftSum == rightSum-e -> they are the same
    // else add to the left sum
    //      subtract from the right sum
    for (var i=0; i<arr.length; i++){
        if ( left == (right - arr[i]) ) return i;
        left += arr[i]
        right -= arr[i]
    }

    // if it makes it to the end with no anser
    // return -1
    return -1
}
console.log( pivotIndex([1,7,3,6,5,6]) )