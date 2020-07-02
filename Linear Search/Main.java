items=[]
x=int(input())
for i in range(x):
  items.append(int(input()))
y=int(input())
i = flag = 0
while i < len(items):
	if items[i] == y:
		flag = 1
		break
	i = i + 1
if flag == 1:
	print(y,"is present at location", i)
else:
	print("Element is not found")
