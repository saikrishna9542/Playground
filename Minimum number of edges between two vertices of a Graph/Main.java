import queue  
def minEdgeBFS(edges, u, v, n): 
    visited = [0] * n  
    distance = [0] * n 
    Q = queue.Queue()
    distance[u] = 0
  
    Q.put(u)  
    visited[u] = True
    while (not Q.empty()): 
        x = Q.get()  
          
        for i in range(len(edges[x])): 
            if (visited[edges[x][i]]): 
                continue
            distance[edges[x][i]] = distance[x] + 1
            Q.put(edges[x][i])  
            visited[edges[x][i]] = 1
    return distance[v] 
def addEdge(edges, u, v): 
    edges[u].append(v)  
    edges[v].append(u)  
if __name__ == '__main__':  
    n = int(input())
    edges = [[] for i in range(n)]
    x=int(input())
    y=int(input())
    while(x!=-1 and y!=-1):
      addEdge(edges, x, y)
      x=int(input())
      if x==-1:
        break
      y=int(input())
      if y==-1:
        break
    u = int(input())
    v = int(input())
    print(minEdgeBFS(edges, u, v, n)) 
