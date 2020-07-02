def last(n): 
    return n[m]    
def sort(tuples): 
    return sorted(tuples, key = last) 

a=eval(input())
m = 1
print(sort(a)) 