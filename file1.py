#Michael Murphy
#file1.py

def line(text):
    print('----------{}----------'.format(text))
#------------------------------part1
quote = 'Patience you must have my young padawan.\n'

wf = open('quote.txt', 'w')

wf.write(quote)

wf.close()

#------------------------------part2
rf = open('quote.txt')

data = rf.read()

print(data)

rf.close()

#------------------------------part3
quote2 = 'Feel the force!\n'

af = open('quote.txt', 'a')

af.write(quote2)

af.close()

rf = open('quote.txt')

data = rf.read()

print(data)

rf.close()

#------------------------------part4
quote3 = 'Train yourself to let go of everything you fear to lose.\n'

def write2File(filename, stringObj):
    wf = open(filename, 'w')
    wf.write(stringObj)
    wf.close()

def readFile(filename):
    rf = open(filename)
    data = rf.read()
    print(data)
    rf.close()

write2File('another_quote.txt', quote3)
line('Part 4')
readFile('another_quote.txt')

#------------------------------part5
quote4 = "Once you start down the dark path, forever will it dominate your destiny, consume you it will.\n"

def append2File(filename, stringObj):
    af = open(filename, 'a')
    af.write(stringObj)
    af.close()

append2File('another_quote.txt', quote4)
readFile('another_quote.txt')
