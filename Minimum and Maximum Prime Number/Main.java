class Node:
  def __init__(self,data):
    self.data=data
    self.next=None
    
class Linkedlist:
    def __init__(self):
        self.head=None
    def push(self,new_data):
        new_node=Node(new_data)
        new_node.next=self.head
        self.head=new_node
    def printList(self):
        temp= self.head
        while(temp):
            print(temp.data,end="->")
            temp=temp.next
    def prime(self):
        temp=self.head
        min=0
        max=0
        flag=0
        while(temp):
          count=0
          for i in range(1,temp.data+1):
            if(temp.data%i==0):
              count=count+1
          if(count==2):
            flag=flag+1
            if(flag==1):
              min=temp.data
            if(temp.data<min):
              min=temp.data
            if(temp.data>max):
              max=temp.data
          temp=temp.next    
        print("\nMinimum : ",min)
        print("Maximum : ",max)
list=Linkedlist()
while(True):
  n=int(input())
  if(n==-1):
    break
  else:
    list.push(n)
list.printList()
list.prime()
       