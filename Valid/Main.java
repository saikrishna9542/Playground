#python
count=0
while(True):
  n=int(input())
  if(n%8==0):
    count=count+1
  else:
    break
print("The number of valid numbers entered is {}".format(count))