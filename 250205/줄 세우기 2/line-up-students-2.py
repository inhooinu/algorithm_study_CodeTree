class Student:
    def __init__(self, h, w, num):
        self.h = h
        self.w = w
        self.num = num

n = int(input())
students = []
for num in range(1, n+1):
    h, w = map(int, input().split())
    students.append(Student(h, w, num))

students = sorted(students, key = lambda x: (x.h, -x.w))
for student in students:
    print(student.h, student.w, student.num)