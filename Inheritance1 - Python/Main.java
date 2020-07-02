class Calculator:
  def __init__(self,x,y):
    self.x=x
    self.y=y
  def add(self):
    print("Addition :",self.x+self.y)
  def sub(self):
    print("Subtraction :",self.x-self.y)

class AdvancedCalculator(Calculator):
  def __init__(self,x,y):
    self.x=x
    self.y=y
    super().__init__(self.x,self.y)
  def mul(self):
    print("Multiplication :",self.x*self.y)



  def div(self):
    print("Floor Division :",self.x//self.y)
x=int(input())
y=int(input())
o=AdvancedCalculator(x,y)
o.add()
o.sub()
o.mul()
o.div()
