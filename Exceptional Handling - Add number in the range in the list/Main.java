x=int(input())
a=[]
for i in range(x):
  y=int(input())
  a.append(y)
j=int(input()) 
k=int(input())
n=len(a)
sum=0
flag=-1
if(j<0 or k>n):
  print("list index out of range")
else:  
  for i in range(j,k):   
    sum=sum+a[i]
    flag=0
if(flag==0):
  print("Sum of numbers in the given range = {}".format(sum))

