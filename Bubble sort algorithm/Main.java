def bubbleSort(arr):
    n = len(arr)
   
   
    for i in range(n):
        swapped = False
 
         
        for j in range(0, n-i-1):
   
         
            if arr[j] > arr[j+1] :
                arr[j], arr[j+1] = arr[j+1], arr[j]
                swapped = True
 
       
        if swapped == False:
            break
           
arr = []
a = int(input())
for i in range (0,a):
  arr.append(input())

bubbleSort(arr)
   
for i in range(len(arr)):
    print (arr[i],end=" ")