const forwards = str =>{
    // i in str -> 1,2,3,4,5
    // i of st -> x,t,i,n,a
    for (i of str) console.log(i);
    for (i=0; i<str.length; i++) console.log(str[i]);
}
// forwards("xtina")

const backwards= str => {
    result = '';
    for (i=str.length-1; i >= 0; i--) result+= str[i]
    return result
}
// console.log( backwards("xtina") )

const isIsomorphic = (one, two) => {
    var oArr = {}
    var tArr = {}

    for (i=0; i<one.length; i++){
        var oChar = one[i]
        var tChar = two[i]

        if(oArr[oChar] == null && tArr[tChar] == null){
            oArr[oChar] = tChar
            tArr[tChar] = oChar
        } else if (oArr[oChar] != tChar){
            return false
        }
    }

    return true
}
console.log( isIsomorphic("egg", "add" ) );
console.log( isIsomorphic("paper", "title" ) );
console.log( isIsomorphic("badc", "baba" ) );
