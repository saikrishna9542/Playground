n=int(input())
a=[]
for i in range(0,n):
  ele=int(input())
  a.append(ele)
count=0
for i in range(0,n):
  flag=1;
  for j in range(i+1,n):
      if(a[i]==a[j]):
          flag=0
  if(flag==1):
      count=count+1
print(count)