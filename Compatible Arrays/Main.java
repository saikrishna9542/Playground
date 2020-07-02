n=int(input())
a=[]
b=[]
for i in range(0,n):
  x=int(input())
  a.append(x)
for i in range(0,n):
  x=int(input())
  b.append(x)
flag=1  
for i in range(0,n):
  if(a[i]<b[i]):
    flag=0
    break

if(flag==1):
  print("Compatible")
else:
  print("Not Compatible")

  