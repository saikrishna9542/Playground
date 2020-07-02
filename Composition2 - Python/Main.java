class Passport:
  def __init__(self):
    x=input()
    self.name=x
  def nameclass1(self):
    print("Name :",self.name)
class Person(Passport):
  def __init__(self):
    super().__init__()

    y=input()
    z=input()
    self.address=y
    self.passno=z
  def display(self):
    print("Address : {}".format(self.address))
    print("Passport Number : {}".format(self.passno))

a=Person()
a.nameclass1()
a.display()
