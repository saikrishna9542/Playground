import queue 
class node: 
    def __init__(self, data = None): 
        self.data = data 
        self.left = None
        self.right = None
  
Q = queue.Queue() 
def insertValue(data, root): 
    newnode = node(data) 
    if Q.empty() != True: 
        temp = Q.get() 
    if root == None: 
        root = newnode 
    elif temp.left == None: 
        temp.left = newnode 
    elif temp.right == None: 
        temp.right = newnode 
        atemp = Q.get() 
    Q.put(newnode) 
    return root 
 
def createTree(a, root): 
    for i in range(len(a)): 
        root = insertValue(a[i], root) 
    return root 
  
# Function for printing level order traversal 
def levelOrder(root): 
    Q = queue.Queue() 
    Q.put(root) 
    while Q.empty() != True: 
        temp = Q.get() 
        print(temp.data, end = ' ') 
        if temp.left != None: 
            Q.put(temp.left) 
        if temp.right != None: 
            Q.put(temp.right) 
  
# Driver Code 
a = []
n=int(input())
for i in range(n):
  a.append(int(input()))
root = None
root = createTree(a, root)  
levelOrder(root) 
 
