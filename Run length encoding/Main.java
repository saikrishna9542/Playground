s=input()
sf=''
x=s[0]
y=s.count(s[0])
sf=sf+x+str(y)
for i in range(1,len(s)):
    if(s[i]!=s[i-1]):
        x=s[i]
        y=s.count(s[i])
        sf=sf+x+str(y)
print(sf)
