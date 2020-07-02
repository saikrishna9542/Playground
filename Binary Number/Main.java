from queue import Queue
def generatePrintBinary(n):
    q = Queue() 
    q.put("1") 
    while(n>0):
        n=n-1
        s1=q.get()
        print(s1)
        s2=s1
        q.put(s1+"0")
        q.put(s2+"1") 
n=int(input())
generatePrintBinary(n)



