#python
s1= input()
c1=0;c2=0
for i in s1:
  if(i>='a' and i<='z'):
    c1=c1+1
  elif(i>='A' and i<='Z'):
    c2=c2+1
print(c1)
print(c2)