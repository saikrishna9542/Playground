v='aeiou'
s=input()
s=s.lower()
flag=0
for i in range(len(v)):
    if v[i] not in s:
        flag=1
        break
if flag==0:
    print('Accepted')
else:
    print('Not Accepted')
