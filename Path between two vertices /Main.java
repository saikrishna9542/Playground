from collections import defaultdict 
class Graph: 
   
    def __init__(self,vertices): 
        self.V= vertices 
        self.graph = defaultdict(list)

    def addEdge(self,u,v): 
        self.graph[u].append(v) 
       
    def isReachable(self, s, d): 
        visited =[False]*(self.V)
        queue=[] 
        queue.append(s) 
        visited[s] = True
   
        while queue: 
            n = queue.pop(0)
            if n == d: 
                 return True
            for i in self.graph[n]: 
                if visited[i] == False: 
                    queue.append(i) 
                    visited[i] = True
        return False
   
n=int(input())
g = Graph(n) 
while(True):
  x=int(input())
  if(x==-1):
    break
  else:
      y=int(input())
      g.addEdge(x,y)
  
u=int(input())
v=int(input())
  
if g.isReachable(u, v): 
    print("There is a path from %d to %d" % (u,v)) 
else : 
    print("There is no path from %d to %d" % (u,v)) 
  