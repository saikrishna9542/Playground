class Person:
  def __init__(self,s,i,d,h):
    self.name=s
  def display(self):
    print("Name of Person = {}".format(self.name))


class Staff(Person):
  def __init__(self):
    self.id=i
    self.days=d


  def display(self):
    print("Staff Id is  = {}".format(self.id))
class Temporarystaff(Staff):
  def __init__(self):   
    self.hours=h

  def salary(self):
    self.salary=d*h*150

  def display(self):
    print("No. of Days = {}".format(d))
    print("No. of Hours Worked = {}".format(h))
    print("Total Salary = {}".format(self.salary))


s=input()
i=int(input())
d=int(input())
h=int(input())

obj1=Person(s,i,d,h)
obj1.display()
obj2=Staff()
obj2.display()
obj=Temporarystaff()
obj.salary()
obj.display()

