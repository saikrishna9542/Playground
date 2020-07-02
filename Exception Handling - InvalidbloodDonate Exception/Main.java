class MyError(Exception):
  pass

age=int(input())
weight=int(input())
if age>18 and weight>55:
  print("Can donate blood")
else:
  try:
    raise(MyError)
  except MyError:
    print("Not eligible to donate blood")
