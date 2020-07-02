
from collections import deque  
def reverse(q): 
 
	s = len(q) 
	ans = deque() 

	for i in range(s): 

		 
		for j in range(s): 
			x = q.popleft() 
			q.appendleft(x) 

	 
		ans.appendleft(q.popleft()) 
	return ans 

q = deque() 
while True:
  x=int(input())
  if x!=-1:
    q.append(x)
  else:
    break



q = reverse(q) 

print("Reversed Queue:")
while (len(q) > 0): 
	print(q.popleft(), end = " ")  
