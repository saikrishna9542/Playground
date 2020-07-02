class Node:
  def __init__(self,data):
    self.data=data
    self.next=None
class Queue:
  def __init__(self):
    self.front=self.rear=None
  def isEmpty(self):
    return self.front==None
  def EnQueue(self,item):
    temp=Node(item)
    if self.rear==None:
      self.front=self.rear=temp
      return
    self.rear.next=temp
    self.rear=temp
  def DeQueue(self):
    if self.isEmpty():
      return
    temp=self.front
    self.front=temp.next
    if(self.front==None):
      self.rear=None
    return str(temp.data)
  def display(self):
    if self.isEmpty():
      print("Queue is Empty")
    else:
      temp=self.front
      while temp is not None:
        print(temp.data)
        temp=temp.next
        
q=Queue()
num=int(input())
for i in range(num):
  q.EnQueue(int(input()))
r=int(input())
for i in range(r):
  q.DeQueue()
q.display()
    
  