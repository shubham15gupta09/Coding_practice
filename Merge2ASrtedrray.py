x = [ 1 , 3 , 5 , 7 , 9 ]
y = [ 2 , 4 , 6 ]
l=[0]*(len(x)+len(y))
i,j,k=0,0,0
while i<len(x) and j<len(y):
    if x[i] < y[j] :
        l[k] = x[i]
        i+=1
    else:
        l[k] = y[j]
        j+=1
    k+=1
while i<len(x):
    l[k]=x[i]
    k+=1
    i+=1
while j<len(y):
    l[k]=y[j]
    k+=1
    j+=1
print(l)