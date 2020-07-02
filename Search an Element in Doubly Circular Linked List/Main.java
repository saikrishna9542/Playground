import math 
class Node:  
    def __init__(self, data):  
        self.data = data  
        self.next = None
def insertNode(start, value): 
      
    if (start == None) :  
        new_node = Node(value)  
        new_node.data = value  
        new_node.next = new_node 
        new_node.prev = new_node  
        start = new_node  
        return new_node 
      
    # If list is not empty  
  
    # Find last node */ 
    last = start.prev  
  
    # Create Node dynamically  
    new_node = Node(value)  
    new_node.data = value  
 
    new_node.next = start  
  
    (start).prev = new_node  
 
    new_node.prev = last  
  
    last.next = new_node 
    return start 

def displayList(start):  
    temp = start  
  
    while (temp.next != start):  
        print(temp.data, end = " ")  
        temp = temp.next
      
    print(temp.data)  
 
def searchList(start, search): 
      

    temp = start 
      
    
    count = 0
    flag = 0
    value = 0
      
    
    if(temp == None): 
        return -1
    else: 
          
       
        while(temp.next != start): 
              
            
            count = count + 1
              
           
            if(temp.data == search): 
                flag = 1
                count = count - 1
                break
              
           
            temp = temp.next
          
        
        if(temp.data == search): 
            count = count + 1
            flag = 1
      
        # If flag is true, then element 
        # found, else not 
        if(flag == 1): 
            print(search,"found at location ", count) 
        else: 
            print(search, " not found") 
      
    return -1
  
# Driver code 
if __name__=='__main__':  
    start = None
    x=int(input())
    while(x!=-1):
      start = insertNode(start, x)
      x=int(input())
  
    print("Circular doubly linked list is: ", 
                                            end = "")  
    displayList(start)  
    y=int(input())
    searchList(start, y) 