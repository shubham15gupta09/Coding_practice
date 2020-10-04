#Bubble sort 
l = [ 9 , 6 , 2 , 4 , 3 , 6 ]
for i in range(len(l)):
    for j in range(len(l)-1) : 
        if l[j] > l[j+1]:
            l[j] , l[j+1] = l[j+1] , l[j] 
print( l )