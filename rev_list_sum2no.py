l1 = [ 2 , 4 , 3 ]
l2 = [ 5 , 6 , 4 ]
l1 , l2 = l1.reverse , l2.reverse
x=""
for i in range(len(l1)):
    x = x + str(l1[i])
print(x)