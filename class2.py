#Michael Murphy
#class2.py

#Create a Car class
#Create the __init__ method which takes in a cars year, make, and model
    #set odo miles here
class Car:
    def __init__(self, year, make, model):
        self.year = year
        self.make = make
        self.model = model
        self.odo_miles = 0
        self.gas_miles = 500
#Create a method honk() that beeps your horn!
    def honk(self):
        print('BEEP!')

#Create a method registration that gives you information about your car
    def registration(self):
        print('{} {} {} has {} miles.'.format(self.year, self.make, self. model, self.odo_miles))

#Create a method drive() that takes in a parameter milesDriven
    def drive(self, milesDriven):
        if(milesDriven > -1):
            #if gas_miles == 0
            if(self.gas_miles == 0):
                print('The {} has no gas! Fill up soon!',format(self.model))
            #if gas miles > milesDriven AND milesDriven < 500
            elif(self.gas_miles > milesDriven and milesDriven <= 500):
                self.odo_miles += milesDriven
                self.gas_miles -= milesDriven
                print('The {} has driven {} miles.'.format(self.model, milesDriven))
            #else
            else:
                self.odo_miles += self.gas_miles
                print('The {} drove {} miles, but ran out of gas! Fill up now!'.format(self.model, self.gas_miles))
                self.gas_miles = 0
                #do something else
        else:
            print('Sorry! We cannot drive backwards.')

    def fillUp(self):
        self.gas_miles = 500
        print('You filled up!')
