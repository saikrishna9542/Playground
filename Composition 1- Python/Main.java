class Salary():
  def __init__(self,m):
    self.month=m

  def get_total(self):
    self.total=self.month*12
    return self.total

class Employee:
  def __init__(self,x,y):
    self.month=x
    self.bonus=y
    self.b=Salary(self.month)

  def annual_salary(self):
    self.totsalary=self.bonus+self.b.get_total()
    print("Total:",self.totsalary)
x=int(input())
y=int(input())
a=Employee(x,y)
a.annual_salary()

