def isMinHeap(level, n): 
    for i in range(int(n / 2) - 1, -1, -1): 
        if level[i] > level[2 * i + 1]:  
            return False
  
        if 2 * i + 2 < n: 
            if level[i] > level[2 * i + 2]: 
                return False
    return True
  
# Driver code  
if __name__ == '__main__': 
    n=int(input())
    level = []  
    for i in range(n):
      level.append(int(input()))
    n = len(level) 
    if isMinHeap(level, n):  
        print("True")  
    else: 
        print("False") 