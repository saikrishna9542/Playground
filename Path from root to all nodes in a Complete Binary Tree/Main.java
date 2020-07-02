def printPath(res,nThNode,kThNode):
    if kThNode>nThNode:
        return
    res.append(kThNode)
    for i in range(0,len(res)):
        print(res[i],end=" ")
    print()
    printPath(res[:],nThNode,kThNode*2)
    printPath(res[:],nThNode,kThNode*2+1)
  
def printPathToCoverAllNodeUtil(nThNode):
    res=[]
    printPath(res,nThNode,1)
  
nThNode= int(input())
printPathToCoverAllNodeUtil(nThNode)