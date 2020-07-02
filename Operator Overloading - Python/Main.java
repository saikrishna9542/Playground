class Gridpoint:
  def __init__(self,a):
     self.a=a 
  def __add__(self,other):
      return self.a+other.a

x=int(input()) 
y=int(input())  
z=int(input())  
w=int(input())  
ob1=Gridpoint(x)
ob2=Gridpoint(y)
ob3=Gridpoint(z)
ob4=Gridpoint(w)
print(ob1+ob3,end=",")
print(ob2+ob4)
