def forward(lst):
    [print(i) for i in lst]
    [print(i) for i in range(len(lst))]
    [lst[i] for i in range(1, len(lst))]
# forward([1,2,3,4,5])


def backwards(lst):
    # start inclusive, stop non inclusive, backwards -1
    [print(lst[i]) for i in range(len(lst)-1, -1, -1)]
# backwards([1,2,3,4,5])

def shiftLeft(lst):
    for i in range(1, len(lst)):
        lst[i-1] = lst[i]
    return lst
# print(shiftLeft([1,2,3,4,5]))

def shiftRight(lst):
    for i in range(len(lst)-1,0,-1):
        lst[i] = lst[i-1]
    return lst
# print(shiftRight([1,2,3,4,5]))

def pushFront(lst, num):
    lst[:0] = [num]
    return lst

# print(pushFront([1,2,3],0))

def popFront(lst):
    # show the list minus the first number
    print(lst[1:])
    # return removed number
    return lst[0]
# print(popFront([1,2,3]))


def insertAt(lst, index, num):
    lst2= lst[:index]
    lst2 = lst2 + [num]
    lst2 = lst2 + lst[index:]

    return lst2
# print(insertAt([100,200,5], 2, 333));

def removeAt(lst, index):
    lst2 = lst[:index]
    lst2 = lst2 + lst[index+1:]

    return lst2
print( removeAt([1000,3,204,77],1) )