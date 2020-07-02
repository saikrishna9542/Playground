def findClosing(c): 
	if c == '(': 
		return ')'
	elif c == '{': 
		return '}'
	elif c == '[': 
		return ']'
	return -1
def check(expr, n): 

	if n == 0: 
		return True
	if n == 1: 
		return False
	if expr[0] == ')' or expr[0] == '}' or expr[0] == ']': 
		return False

	# Search for closing bracket for first 
	closing = findClosing(expr[0]) 

	i = -1
	count = 0
	for i in range(1, n): 
		if expr[i] == expr[0]: 
			count += 1
		if expr[i] == closing: 
			if count == 0: 
				break
			count -= 1

	if i == n: 
		return False
	if i == 1: 
		return check(expr[2:], n - 2) 
	return check(expr[1:], i - 1) and check(expr[i + 1:], n - i - 1) 

if __name__ == "__main__": 
	expr = input()
	n = len(expr) 

	if check(expr, n): 
		print("Balanced") 
	else: 
		print("Not Balanced") 

