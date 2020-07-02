#python
a=[]
even=[]
odd=[]
n=int(input())
for i in range(0,n):
  ele=int(input())
  a.append(ele)
  
for i in range(0,n):
  if(a[i]%2==0):
    even.append(a[i])
  else:
    odd.append(a[i])
    
print(even)
print(odd)
      
