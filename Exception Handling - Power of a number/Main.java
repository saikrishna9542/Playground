class Mycalculator(Exception):
  def __init__(self,n,p):
    self.n=n
    self.p=p
  def power(self):
    self.x=self.n**self.p
    print(self.x)
x=int(input())
y=int(input())
if(x<0 or y<0):
  print("n or p should not be negative.")
elif(x==0 and y==0):
  print("n and p should not be zero.")
else:
  s=Mycalculator(x,y)
  s.power()

