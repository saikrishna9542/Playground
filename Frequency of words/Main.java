s=input()
l=s.split()
l1=[]
for i in l:
  if i not in l1:
    l1.append(i)

for i in range(len(l1)):
  print(l1[i],':',l.count(l1[i]))
