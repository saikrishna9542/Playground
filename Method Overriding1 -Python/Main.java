class rbi:
  def __init__(self):
    pass
  def interest(self):
    pass
class sbi:
  def __init__(self,roi):
    self.roi=roi
  def interest(self):
    print('SBI Interest :',self.roi)
class indianbank:
  def __init__(self,roi):
    self.roi=roi
  def interest(self):
    print('IndianBank Interest :',self.roi)
class canara:
  def __init__(self,roi):
    self.roi=roi
  def interest(self):
    print('Canara Bank Interest :',self.roi)

a=eval(input())
b=eval(input())
c=eval(input())

s1=sbi(a)
s1.interest()
i1=indianbank(b)
i1.interest()
c1=canara(c)
c1.interest()
