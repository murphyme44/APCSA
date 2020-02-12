#Michael Murphy
# guessNum.py

# Create your own custom guessing game using for loops and while loops
# Be creative!
import random
i = randomNumber = random.randint(1,101)
running=True;
running2=False;
while running:
    guess = int(input('Enter an answer: '))
    if guess > i:
        print('Nope, that is to high')
    elif guess == i:
        print('Congratulations, you got it. Would you like to play again?')
        newGame = raw_input()
        if newGame=="yes":
            running2=True;
    else:
        print('Nope, that is to low')
    running=True
while running2:
    guess2 = int(input('Enter an answer: '))
    if guess2 > i:
        print('Nope, that is to high')
    elif guess2 == i:
        print('Congratulations, you got it. Would you like to play again?')
        running2=False
    else:
        print('Nope, that is to low')

