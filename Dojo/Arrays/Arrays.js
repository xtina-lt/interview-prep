const forward = arr => {
    for (i of arr) console.log(i);
    for (i=0; i<arr.length; i++) console.log(arr[i])
}
// forward([1,2,3,4,5])

const backwards = arr => {
    for (i=arr.length-1; i>=0; i--) console.log(arr[i])
}
// backwards([1,2,3,4,5])

const shiftLeft = arr =>{
    for (i=1; i<arr.length; i++)
        arr[i-1] = arr[i]
    return arr
}
// console.log( shiftLeft([1,2,3,4,5]) );

const shiftRight = arr => {
    for (i=arr.length-1; i>0; i--)
        arr[i] = arr[i-1]
    return arr
}
// console.log( shiftRight([1,2,3,4,5]) );

const pushFront = (arr, num) => {
    // add to front
    arr.length = arr.length+1;
    // shift right
    for (i=arr.length-1; i >= 0; i--){
        arr[i] = arr[i-1]
    }
    // input number
    arr[0] = num
    //return array
    return arr
}
// console.log( pushFront([0, 5, 10, 15], 8) );

const popFront = arr =>{
    // save popped
    temp = arr[0]
    // shift left
    for (i=1; i<arr.length; i++)
        arr[i-1] = arr[i]
    // update length
    arr.length = arr.length-1;
    // print all
    for (i of arr) console.log(i);
    // return saved num
    return temp
}
// console.log( popFront([0, 5, 10, 15] ) )


const insertAt = (arr, index, num) => {
    arr.length = arr.length + 1

    for (i=arr.length-1;i>index;i--)
        arr[i] = arr[i-1]
    
    arr[index] = num

    return arr
}
// console.log(insertAt([100,200,5], 2, 333));

const removeAt = (arr, index) => {
    for (i=arr.length-1; i > index;i--)
        arr[i-1] = arr[i]
    arr.length = arr.length-1

    return arr
}
console.log(removeAt([1000,3,204,77],1));