#python
sentence = input()
 # first split the string into words 
words = sentence.split(' ')  
# then reverse the split string list and join using space 
reverse_sentence = ' '.join(reversed(words))
print(reverse_sentence)
  