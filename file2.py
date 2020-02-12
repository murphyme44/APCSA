#Michael Murphy
#file2
with open('story.txt') as f:
    story = f.readlines()

print('first line of story')
print(story[0])

print('last line of story')
print(story[len(story)-1])

print('read even lines of story')
for i, j in enumerate(story):
    if i % 2 != 0:
        print(j)

print('print odd lines')
for i, j in enumerate(story):
    if i % 2 == 0:
        print(j)

#---------------------------part2

with open('names.txt') as f:
    name_list = f.readlines()

print('names in name_list')
for i in name_list:
    print(i, end='')
print()

print('find all names that start with I')
for i in name_list:
    if i.startswith('I'):
        print(i)

for i in name_list:
    if i.lower().startswith('i'):
        print(i)

print('SORTED NAMES')
def sort_names():
    names_sorted = sorted(name_list)
    with open('names_sorted.txt', 'w') as f:
        for i in names_sorted:
            f.write(i)
            print(i)

def addName(name):
    name_list.append('{}\n'.format(name))
    with open('names.txt', 'a') as f:
        f.write('{}\n'.format(name))

addName('Arnold')

sort_names()
