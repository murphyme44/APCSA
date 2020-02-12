#Michael Murphy
#class4

import random

class Card:
    face = [2,3,4,5,6,7,8,9,10,'J','Q','K','A']
    suit = ['Spades','Clubs','Diamonds','Hearts']
    def __init__(self):
        self.face = Card.face[random.randint(0, len(Card.face)-1)]
        self.suit = Card.suit[random.randint(0, 3)]
        self.value = Card.value_calc(self)
    def value_calc(self):
        if self.face == 'J':
            return 10
        if self.face == 'Q':
            return 10
        if self.face == 'K':
            return 10
        if self.face == 'A':
            return 11
        else:
            return self.face


class Hand:
    def __init__(self, card1, card2):
        self.card1 = card1
        self.card2 = card2
        self.value = card1.value + card2.value

def playGame():
    card1 = Card()
    card2 = Card()
    card3 = Card()
    card4 = Card()
    myHand = Hand(card1, card2)
    otherHand= Hand(card3, card4)
    value1 = myHand.value
    value2 = otherHand.value
    play = input('Would you like to play a hand of cards?  ')
    if play == 'yes':
        print('Your cards are the {} of {} and the {} of {}.'.format(card1.face, card1.suit, card2.face, card2.suit))
        print('Your opponent\'s cards are the {} of {} and the {} of {}.'.format(card3.face, card3.suit, card4.face, card4.suit))
        if value1 > value2:
            print('You won!')
        elif value1 < value2:
            print('You lost.')
        elif value1 == value2:
            print('You tied!')

playGame()


# card1 =  Card()
# print(card1.face)
# print(card1.value)
