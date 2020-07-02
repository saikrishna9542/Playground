class mobile:
  def __init__(self,a,b,c,d):
    self.name=a
    self.brand_name=b
    self.color=c
    self.pixel=d
  def display(self):
    print("{} own {} {} color smartphone having {} MP camera".format(self.name,self.brand_name,self.color,self.pixel))

a=input()
b=input()
c=input()
d=int(input())
o=mobile(a,b,c,d) 
o.display()
