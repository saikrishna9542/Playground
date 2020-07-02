a_string = input()
a_string= a_string.lower()
sorted_characters = sorted(a_string)
#Sort string alphabetically and return list

a_string = "".join(sorted_characters)
#Combine list elements into one string

print(a_string)