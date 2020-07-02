s1=input()
s2=''
l=list(s1)

for j in range(len(l)-1):
  for i in range(0,len(l)-1):
    if(l[i]>l[i+1]):
      l[i], l[i+1] = l[i+1], l[i]

s1=''
for i in range(len(l)):
  s1=s1+l[i]

for i in range(len(s1)):
  if s1[i] not in s2:
    x=s1.count(s1[i])
    print(s1[i], x)
    s2=s2+s1[i]
