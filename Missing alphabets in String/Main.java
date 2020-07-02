alpha='abcdefghijklmnopqrstuvwxyz'
s=input()
s=s.lower()
for i in alpha:
  if i not in s:
    print(i,end=",")
