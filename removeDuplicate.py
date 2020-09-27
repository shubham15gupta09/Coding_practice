# remove duplicate
def removeDuplicate(l):
    ans = []
    for i in l:
        if i not in ans:
            ans.append(i)
    return ans


l = [9, 6, 2, 4, 3, 6, 7, 7, 5, 3]
print(removeDuplicate(l))
