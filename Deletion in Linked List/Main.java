class Node:
    def __init__(self, data):
        self.item = data
        self.ref = None
        
class LinkedList:
    def __init__(self):
        self.start_node = None
        
    def insert(self, data):
        new_node = Node(data)
        if self.start_node is None:
            self.start_node = new_node
            return
        n = self.start_node
        while n.ref is not None:
            n= n.ref
        n.ref = new_node;
    def delete_at_start(self):
        if self.start_node is None:
            print("List is empty")
            return 
        self.start_node = self.start_node.ref
            
    def delete_at_end(self):
        if self.start_node is None:
            print("List is empty")
            return

        n = self.start_node
        while n.ref.ref is not None:
            n = n.ref
        n.ref = None
    def delete_element_by_value(self, x):
        if self.start_node is None:
            print("List is empty")
            return

        if self.start_node.item == x:
            self.start_node = self.start_node.ref
            return
    
        n = self.start_node
        while n.ref is not None:
            if n.ref.item == x:
                break
            n = n.ref
    
        if n.ref is None:
            print("Element not found")
        else:
            n.ref = n.ref.ref

    def display(self):
        if self.start_node is None:
            print("List is empty")
            return
        else:
            n = self.start_node
            while n is not None:
                print(n.item ,"-> ", end ="")
                n = n.ref       
            print("NULL")

if __name__=='__main__': 
    list = LinkedList()
    while(True):
        choice = int(input())
        if (choice == 1):
            d = int(input())
            list.insert(d)
        elif choice is 2 :
            list.delete_at_start()
        elif choice is 3:
            list.delete_at_end()
        elif choice is 4 :
            list.delete_element_by_value(int(input()))
        elif choice is 5 :
            list.display()
        else:
            break
