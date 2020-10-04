def search(a,s):
    mid = int( len(a)/2 )
    if s == a[mid]:
        print( a[mid])
    elif s > a[mid]:
        return search( a[mid:] , s)
    else:
        return search( a[:mid] , s )
a = [1,2,3,4,5,6,7,8,9]
s = 12
print( search(a,s) )         