def is_leap_year(y):
    if (y%100==0 and y%400!=0):
        return False
    if (y%4==0):
        return True
    return False

y = int(input())

# Write your code here!
if (is_leap_year(y)):
    print("true")
else:
    print("false")