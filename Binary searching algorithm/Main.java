def binary_search(item_list,item):
  count=0
  first=0
  last = len(item_list)-1
  found = False
  while( first<=last and not found):
    mid = (first + last)//2
    if item_list[mid] == item :
      found = True
      print(item,"found at location {0}.".format(mid+1))
      count+=1
      break
    else:
        if item < item_list[mid]:
          last = mid - 1
        else:
          first = mid + 1	
  if(count==0):
    print("Not found")
opp=[]
x=int(input())
for i in range(x):
  opp.append(int(input()))
y=int(input())
binary_search(opp,y)
