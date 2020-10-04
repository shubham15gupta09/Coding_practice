def operation(l):
    lset = set(l)
    ldict = {}
    for i in lset:
        ldict[i] = l.count(i)
    v_max = max( ldict.values() )
    if v_max <= n/2 :
        print( ldict.keys()[ ldict.values().index( v_max ) ] ) 

t = input("enter the no. of test cases : ") 
t = int(t)
while t != 0:
    l = [] 
    n = int(input())
    for i in range(n):
        x = int(input())
        l.append(x)
    operation(l)
    t=t-1