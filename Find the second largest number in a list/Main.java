a=[]
n=int(input())
for i in range(0,n):
  ele=int(input())
  a.append(ele)
a.sort()
x=len(a)
print(a[x-2])