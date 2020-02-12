#Michael Murphy
#1v1project.py
import random

print('Murph was walking in the hallway on a Monday afternoon when he saw his arch nemesis, Luke.')
class Player:#This class allows for Murph to perform actions in game.
    def __init__(self, name):
        self.hp = 100
        self.name = name
    def attack(self,player):#Takes 10 health away from Luke.
        player.hp -= 10#-10 health
        if (player.hp < 0):
            player.hp = 0
        print('Murph attacked {} for 10 damage!'.format(player.name))
    def heal(self):#Gives Murph a random amunt of hp 1 to 30
        self.hp += random.randint(1,31)
        print('{} healed.'.format(self.name))
    def specialMove(self,player):#Takes 25 health away from Luke
        player.hp -= 25#-25 health
        if (player.hp < 0):
            player.hp = 0
        print('Murph destroyed {} with his special move, ask question, for 25 damage.'.format(player.name))
    def health(self):#Display's health
        print('{} has {} hp.'.format(self.name, self.hp))
    def quit(self):
        print('GAME OVER')
class Enemy:
    def __init__(self, name):
        self.hp = 100
        self.name = name
    def attack(self, player):#deals 10 damage to opponent
        player.hp -= 10#-10 health
        if (player.hp < 0):
            player.hp = 0
        print('Luke attacked {} for 10 damage!'.format(player.name))
    def heal(self):#heals player with 1-30 health
        self.hp += random.randint(1,30)
        print('Luke healed.')
    def specialMove(self,player):#deals 25 damage to opponent
        player.hp -= 25#-25 health
        if (player.hp < 0):
            player.hp = 0
        print('Luke destroyed {} with his special move, finger crush, for 25 damage.'.format(player.name))
    def health(self):#displays health
        print('{} has {} hp.'.format(self.name, self.hp))

player1 = Player('Murph')
enemy1 = Enemy('Luke')

def enemyMenu():
    computer = random.randint(1,3)#randomly chooses to attack, special move, or heal
    if computer == 1:
        enemy1.attack(player1)#Luke attacks
        player1.health()#displays player health
        enemy1.health()#displays enemy health
    elif computer == 2:
        enemy1.heal()#Luke heals
        player1.health()
        enemy1.health()
    elif computer == 3:
        enemy1.specialMove(player1)#Luke does special move
        player1.health()
        enemy1.health()
def menu():
    while True:
        if player1.hp <= 0:
            print('LUKE WINS')
            return
        if enemy1.hp <= 0:
            print('MURPH WINS')
            return
        operation = input('(1) Attack, (2) Heal, (3) Special Move, (4) Quit\n')
        if operation.isdigit():#
            if(int(operation) == 1):#to attack
                player1.attack(enemy1)
                enemyMenu()
            elif(int(operation) == 2):#to heal
                player1.heal()
                enemyMenu()
            elif(int(operation) == 3):#to do special move
                player1.specialMove(enemy1)
                enemyMenu()
            elif(int(operation) == 4):#to quit
                player1.quit()
                return
            else:#if the user does not pu 1, 2, 3, or 4
                print('Please select a valid action.')
menu()
