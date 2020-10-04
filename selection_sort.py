#selection sort 
l = [ 9 , 6 , 2 , 4 , 3 , 6 ]
for i in range( len( l ) - 1 ):
    for j in range( i + 1 , len( l ) ): 
        if l[i] > l[j]:
            l[i] , l[j] = l[j] , l[i] #swap
print( l )