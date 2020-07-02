#python
s1=input()
n=int(input())
s2=""
for j in range(0,len(s1)):
    if(j!=n):
        s2= s2+s1[j];
print(s2)