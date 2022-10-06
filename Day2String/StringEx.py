def forwards(str):
    [print(i) for i in str]
    for i in range(len(str)):
        print(str[i])
    [print(str[i]) for i in range(len(str))]
# forwards("xtina")


def backwards(str):
    [print(str[i]) for i in range(len(str)-1, -1, -1)]
# backwards("xtina")


def isIsomorphic(one, two):
    oDict = {}
    tDict = {}

    for k, v in zip(one, two):
        # Case 1: No mapping exists in either of the dictionaries
        if (k not in oDict) and (v not in tDict):
            oDict[k] = v
            tDict[v] = k
        # Case 2: Ether mapping doesn't exist in one of the dictionaries or Mapping exists and
        # it doesn't match in either of the dictionaries or both
        elif oDict.get(k) != v or tDict.get(v) != k:
            return False

    return True


print(isIsomorphic("egg", "add"))
# print( isIsomorphic("paper", "title" ) );
# print( isIsomorphic("badc", "baba" ) );
