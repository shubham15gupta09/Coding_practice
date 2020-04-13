print("enter the no. of input")
n = int(input())
a , b , temp , pair = [] , [] , [] , []
max = 21
# a denotes the person
# b denotes the activity skill value 
for i in range(n):
    temp = input().split(" ")
    a.append(temp[0])
    b.append(temp[1])
print("enter the no. of pair")
p = int(input())
for i in range(p):
    temp = input().split(" ")
    pair.append(temp[0])
    pair.append(temp[1])
pair=list(set(pair))
sum = 0
val = []
for i in pair:
    val.append( int(b[ a.index(i) ]) )
print( sum(val) )
print(val)