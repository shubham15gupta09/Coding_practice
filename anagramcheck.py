def check(x,y):
    n1 = len(x)
    n2 = len(y)
    if n1 != n2:
        print("not an anagram")
    else:
        if sorted(x) == sorted(y):
            print("anagram")
        else:
            print("not an anagram")
s1 = "listen"
s2 = "silent"
check( s1,s2 )