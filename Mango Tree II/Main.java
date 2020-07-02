#python
r=int(input())
c=int(input())
n=int(input())
if(n<=r or n%r==1 or (n >(r-1)*c and n <=r*c) ):
  print("No")
else :
  print("Yes")

 