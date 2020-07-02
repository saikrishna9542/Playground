x=input()
y=int(input())
y=y%26
stri= list(x)

for i in stri:
    if(i==' '):
        print(' ',end='')
    else:
        a=ord(i)
        if(65<=a<=90):
            s=(a+y)
            if(s>90):
                s=(s%90)+64
            print(chr(s),end="")
        elif(97<=a<=122):
            s=(a+y)
            if(s>122):
                s=(s%122)+96
            print(chr(s),end="")
      