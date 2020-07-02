class Node:
  def __init__(self,data):
    self.data=data
    self.next=None
class LinkedList:
  def __init__(self):
    self.head=None
    self.last_node=None
  def append(self,data):
    if self.last_node is None:
      self.head=Node(data)
      self.last_node=self.head
    else:
      self.last_node.next=Node(data)
      self.last_node=self.last_node.next
  def display(self):
    current=self.head
    while current is not None:
      print(current.data,"-> ",sep=" ",end=' ')
      current=current.next
    print("NULL")
  def delete(self,num):
    temp=self.head
    prev=None
    while temp!=None and temp.data%num==0:
      self.head=temp.next
      temp=self.head
    while temp!=None:
      while temp!=None and temp.data%num!=0:
        prev=temp
        temp=temp.next
      if temp==None:
        return self.head
      prev.next=temp.next
      temp=prev.next
    return None
a_llist=LinkedList()
n=int(input())
for i in range(n):
  d=int(input())
  a_llist.append(d)
num=int(input())
print("Before Deletion:")
a_llist.display()
a_llist.delete(num)
print("After Deletion:")
a_llist.display()

      