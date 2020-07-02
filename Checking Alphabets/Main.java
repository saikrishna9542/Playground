#python
ch=input()
if ch in('a','e','i','o','u','A','E','I','O','U'):
  print("Vowel")
elif( (ch>='a' and ch<='z') or (ch>='A' and ch<='Z') ):
     print("Consonant")
else :
     print("Not an alphabet")