alpha='abcdefghijklmnopqrstuvwxyz'
c=0
s=input()
for i in alpha:
    cn=s.count(i)
    if cn>c:
        c=cn
        m=i
print(m,c)
