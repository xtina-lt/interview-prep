import math
from os import stat


def reverseString(s):
    i = 0
    j = len(s) - 1
    while i < j:
        temp = s[i]
        s[i] = s[j]
        s[j] = temp
        i+=1
        j-=1
    return s

# print(reverseString(["h", "e", "l", "l", "o"]))

def maxArea(list):
    maxarea = 0
    i = 0
    j = len(list) - 1
    
    while i < j:
        width = j - i
        area = min(list[i], list[j]) * width
        maxarea = max(maxarea, area)
        if list[i] <= list[j]:
            i += 1
        else:
            j -= 1
            
    return maxarea
print( maxArea([1,8,6,2,5,4,8,3,7]) )

