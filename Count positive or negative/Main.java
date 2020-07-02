#python
n=int(input())
i=0;sum=0;count=0
while(i<n):
  x=int(input())
  i=i+1
  if(x>=0):
    count=count+1
    sum=sum+x
print("Number of positive numbers entered is {} and the sum is {}".format(count,sum))