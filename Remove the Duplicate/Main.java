a=[]
b=[]
n=int(input())
for i in range(0,n):
  ele=int(input())
  a.append(ele)
  
for i in range(0,n):
  flag=1
  for j in range(i+1,n):
    if(a[i]==a[j]):
      flag=0
      break
  if(flag==1):
    b.append(a[i])
print("Non-duplicate items:")    
print(b)
    