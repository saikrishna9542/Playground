import math 
def height(N): 
    return math.ceil(math.log2(N + 1)) - 1
  
# driver node 
N = int(input())
print(height(N)) 