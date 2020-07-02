class Node:
  def __init__(self,data):
    self.data=data
    self.next=None
    
class Linkedlist:
  def __init__(self):
    self.head=None
    self.last_node=None
  def push(self,data):
    if self.last_node is None:
      self.head= Node(data)
      self.last_node= self.head
    else:
      self.last_node.next= Node(data)
      self.last_node= self.last_node.next
  def printList(self):
      temp= self.head
      while(temp):
        print(temp.data,end=" ")
        temp=temp.next
  def rotate(self,k):
        if(k==0):
          return
        current=self.head
        count=1
        while(count<k and current is not None):
          current=current.next
          count=count+1
        if( current is None):
          return
        kthnode= current
        while(current.next is not None):
          current= current.next
        current.next=self.head
        self.head= kthnode.next
        kthnode.next= None
        
list= Linkedlist()
while True:
  num= int(input())
  if(num==-1):
    break
  else:
    list.push(num)
print("Given linked list:")
list.printList()
rotate=int(input())
list.rotate(rotate)
print("\nRotated Linked list:")
list.printList()
          