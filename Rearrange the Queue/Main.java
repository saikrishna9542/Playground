from queue import Queue
def interLeaveQueue(q):
  if(q.qsize()%2!=0):
    print("Input even number of integers.")
  s=[]
  halfSize=int(q.qsize()/2)
  for i in range(halfSize):
    s.append(q.queue[0])
    q.get()
  while len(s)!=0:
    q.put(s[-1])
    s.pop()
  for i in range(halfSize):
    q.put(q.queue[0])
    q.get()
  for i in range(halfSize):
    s.append(q.queue[0])
    q.get()
  while len(s)!=0:
    q.put(s[-1])
    s.pop()
    q.put(q.queue[0])
    q.get()
    
q=Queue()
while True:
  x=int(input())
  if x!=-1:
      q.put(x)
  else:
      break
interLeaveQueue(q)
length=q.qsize()
print("After Rearranging: ")
for i in range(length):
  print(q.queue[0],end=" ")
  q.get()
  	 