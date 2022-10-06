# print("Test!")
def runningSum(lst):
    # start at 1
    # go to the lenght of the list
    for i in range(1, len(lst)):
        # add the next number to the last number
        # save as next number
        lst[i] = lst[i] + lst[i-1]
    # return updated list
    return lst
print(runningSum([1,2,3,4]))

def pivotIndex(lst):
    # initialize right and left sums
    right=0 
    left=0
    # loop through to get right sum
    for e in lst:
        right = right + e
    print(right)
    # if left sum equals the right sum minus the element
    # return the index
    for i in range(len(lst)):
        if left == (right - lst[i]):
            return i
        # else
        # add elent to left
        # subtract element from right
        left = left + lst[i]
        right = right - lst[i]
    
    return -1

print(pivotIndex([1,7,3,6,5,6]))
        