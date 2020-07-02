#python
sum=0
for i in range(1,4):
  n=int(input())
  if(n>0 and n%2==1):
    sum=sum+1
  elif(n>0 and n%2==0):
    sum=sum-0.5
  elif(n<0):
    sum=sum-1
    break
    
print(sum)