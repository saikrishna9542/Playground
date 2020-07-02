class shape:
  def __init__(self,side,length,breadth):
    self.side=side
    self.length=length
    self.breadth=breadth

  def square(self):
    print("The side of square = {}".format(self.side))
    print("Area of square = {}".format(self.side*self.side))
  def rectangle(self):
    print("The length and breadth of rectangle = {} , {}".format(self.length,self.breadth))
    print("Area of rectangle = {}".format(self.length*self.breadth))

side=int(input())
length=int(input()) 
breadth=int(input()) 
o=shape(side,length,breadth)
o.square()
o.rectangle()
