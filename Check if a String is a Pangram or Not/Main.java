#python
def ispangram(str): 
    alphabet = "abcdefghijklmnopqrstuvwxyz"
    for char in alphabet: 
        if char not in str.lower(): 
            return False
  
    return True
      
# Driver code 
string = input()
if(ispangram(string) == True): 
    print("pangram") 
else: 
    print("No") 