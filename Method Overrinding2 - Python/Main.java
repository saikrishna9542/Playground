class Animal:
  def breathe(self):
    print("I breathe oxygen")
  def food(self):
    print("I eat food")
class Herbivore(Animal):
  def __init__(self,name):
    super().__init__()
    self.name=name
  def food(self):
    print(self.name,": I am a Vegetarian")
class carni(Animal):
  def __init__(self,name):
    super().__init__()
    self.name=name
  def food(self):
    print(self.name,": I am a Non Vegetarian")
class omni(Animal):
  def __init__(self,name):
    super().__init__()
    self.name=name
  def food(self):
    print(self.name,": I eat both")
a=input()
b=input()
f=input()
c=Herbivore(a)
c.food()
c.breathe()
d=carni(b)

d.food()
d.breathe()
e=omni(f)


e.food()
e.breathe()
