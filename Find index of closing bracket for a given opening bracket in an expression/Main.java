from collections import deque 
def getIndex(s, i): 
	if s[i] != '[': 
		return -1
	d = deque() 
	for k in range(i, len(s)): 
		if s[k] == ']': 
			d.popleft() 
		elif s[k] == '[': 
			d.append(s[i]) 
		if not d: 
			return k 
	return -1
def test(s, i): 
	matching_index = getIndex(s, i) 
	print("Closing bracket at index : "+ str(matching_index)) 
def main():
	expression=input()
	index=int(input())
	test(expression,index)
if __name__ == "__main__": 
	main()    
def sortStack(stack):
	tmpStack=createStack()
	while(isEmpty(stack)==False):
		tmp=top(stack)
		pop(stack)
		while(isEmpty(stack)==False) and int(top(tmpstack))>int(tmp):
			push(stack,top(tmpstack))
			pop(tmpStack)
		push(tmpStack,tmp)
	return tmpStack  

    