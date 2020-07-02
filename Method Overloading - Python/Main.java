import math
class Compute():
  def area(instanceOf,*args):
    print("Area of Circle = {}".format(math.ceil(math.pi*args[0]*args[0])))
    print("Area of Rectangle = {}".format(args[1]*args[2]))
x=int(input())
y=int(input())
z=int(input())
o=Compute()
o.area(x,y,z)
