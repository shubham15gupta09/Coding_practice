s1 = "rotate"
s2 = "aterot"
# when u rotate s1 by 2 u will get s2
t = s1 + s1
if s2 in t:
    print("\""+ s2 + "\" is a rotation of \"" + s1+"\"")
else:
    print(" "+ s2 + "\" is not a rotation of \"" + s1+"\"")