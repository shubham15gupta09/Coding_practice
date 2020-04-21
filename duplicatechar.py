s = "geeksforgeeks"
l , x = [] ,[]
for i in s:
	x.append(i)
	if i not in l:
		l.append(i)
for i in l:
	if x.count(i) >1:
		print(i , end=" ")