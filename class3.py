#Michael Murphy
#class3.py

class Robot:
    population = 0
    robot_list = []
    def __init__(self, name):
        Robot.population += 1
        self.name = name
        self.battery_power = 100
        self.robot_num = Robot.population
        Robot.robot_list.append(self.name)
        print("Intializing Robot{}: {}.".format(self.robot_num, self.name))

    def charge_robot(self):
        if (self.battery_power == 100):
            print("{}\'s battery is already full.".format(self.name))
            return
        elif (self.battery_power < 75):
            self.battery_power += 25
            print("{}\' battery is at {}%.".format(self.name, self.battery_power))
        elif (self.battery_power > 75):
            self.battery_power = 100
            print("{}\'s battery is now at {}%.".format(self.name, self.battery_power))

    def is_robot_alive(self):
        print("{}\'s battery is at {}%.".format(self.name, self.battery_power))

    def do_robot_things(self,action):
        self.battery_power -= 10
        print("{} {}ed and is now at {}%.".format(self.name, action, self.battery_power))
        # print('{}:'.format(self.name), end=' ')
        # for i in range(1, 11):
        #     print('{]'.format(action.upper()), end=' ')
        # print()
        # self.battery_power -= 10
        # self.do_robot_things()
    # @classmethod
    # def robot_roll_call(self):
    #     for i in range (len(Robot.robot_list)):
    #         if(i < len(Robot.robot_list)



#-----END OF CLASS -----#
robo1 = Robot('Dwight')
robo2 = Robot('CP30')
robo1.charge_robot()
robo2.is_robot_alive()
robo1.do_robot_things('walk')
