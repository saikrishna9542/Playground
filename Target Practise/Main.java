#python
target= int(input())
sum=0;count=0
while(True):
  n=int(input())
  count=count+1
  sum=sum+n
  if(sum>= target):
    print("The number of turns is {}".format(count))
    break