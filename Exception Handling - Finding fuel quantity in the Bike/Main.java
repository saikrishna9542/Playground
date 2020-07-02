a=input()
try:
  if(a.lower()!='null'):
    print("Petrol Quantity = ",a)
  else:
    raise ValueError

except(ValueError) :

  print("There is no fuel in the Bike")
