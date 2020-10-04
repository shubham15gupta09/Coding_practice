suml = sumr = 0
def change(l):
    if len(l)==1:
        print(l[0])
    else:
        for i in l:
            suml = sum( l[:i] )
            sumr = sum( l[i+1:] )
            if suml == sumr:
                print(i+1)
                break

l = [1]
l=[2,2]
print( change(l) )