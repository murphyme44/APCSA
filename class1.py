#Michael Murphy
#class1.py
#birds are not real.

import datetime
now = datetime.datetime.now()

class Student:

    def __init__(self, name, age, subject):
        self.name = name
        self.age = age
        self.subject = subject

    def greeting(self):
        print('My Name is {}, I am {} years old, and my favorite subject is {}.'.format(self.name, self.age, self.subject))

    def birthday(self):
        self.age += 1
        print('Happy Birthday! {} is now {} years old.'.format(self.name, self.age))

    def birthyear(self):
        birthyear = now.year - self.age
        print('{} was born in {}.'.format(self.name, str(birthyear)))


#----------#END OF CLASS#----------#

stu1 = Student('Luke', 16, 'Computer Science')
# stu2 = Student('Cole', 15, 'History')
# stu3 = Student('Sala', 15, 'Lunch')
#
# Student.greeting(stu1)
# Student.birthday(stu2)
# Student.birthyear(stu3)
