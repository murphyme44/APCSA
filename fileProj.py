#Michael Murphy
#fileProj.py
#This function is used to input the word that will be inserted into the story.
def teacherStory(): #Teacher story
    input1=input("Insert a number. ") #Allows user to insert the requested word type
    input2=input("Insert a plural noun. ")
    input3=input("Insert a plural noun. ")
    input4=input("Insert a verb with ing. ")
    input5=input("Insert a verb. ")
    input6=input("Insert a plural noun. ")
    input7=input("Insert a plural noun. ")
    input8=input("Insert a verb. ")
    input9=input("Insert an adjective. ")
    input10=input("Insert a vehicle. ")
    input11=input("Insert an adjective. ")
    input12=input("Insert a noun. ")
    input13=input("Insert a plural noun. ")
    input14=input("Insert a noun. ")
    input15=input("Insert an adjective. ")
    ans=input("Would you like to read your story?")
    if ans=="yes"or ans=="Yes" or ans=="y": #credit: Luke Chrampanis
        return("I'd like to teach {}th grade when I grow up.\nMy classroom would be filled with {} and {} for {}.\nI'd {} stories about {} and {} to my students, and teach them how to {}.\nThe very {} part about being a teacher would be taking a {} on field trips to {} places, like the zoo or to see a {}.\nSharing {} together and stories about {} would be a really {} job.".format(input1, input2, input3, input4, input5, input6, input7, input8, input9, input10, input11, input12, input13, input14, input15))

def astroStory():#Astronaut story
    input1=input("Insert a verb with ing. ")
    input2=input("Insert a verb. ")
    input3=input("Insert a vehicle. ")
    input4=input("Insert a verb. ")
    input5=input("Insert tools. ")
    input6=input("Insert a plural noun. ")
    input7=input("Insert a color. ")
    input8=input("Insert an adjective. ")
    input9=input("Insert a color. ")
    input10=input("Insert a number. ")
    input11=input("Insert body parts. ")
    input12=input("Insert body parts. ")
    input13=input("Insert a verb. ")
    input14=input("Insert a verb. ")
    input15=input("Insert an vehicle. ")
    input16=input("Insert an place. ")
    input17=input("Insert an verb. ")
    ans=input("Would you like to read your story?")   #This code is to display the story the user made.
    if ans=="yes"or ans=="Yes" or ans=="y": #credit: Luke Chrampanis
        return("Instead of {} every day to an office, I want to {} to outer space on a {} for my job.\nI'd {} science experiments using {} and {}, and get to see {} holes and {} stars up close.\nMaybe I'd even get to meet an alien life form, with {} skin and {} {} and {}.\nWhen it's time to {} to Earth, I'll {} in a {} and land safely in a {} where friends and family will {} me and welcome me home.".format(input1, input2, input3, input4, input5, input6, input7, input8, input9, input10, input11, input12, input13, input14, input15, input16, input17))

def pizzaStory():#Pizza story
    input1=input("Insert a adjective. ")
    input2=input("Insert a nationality. ")
    input3=input("Insert a person. ")
    input4=input("Insert a noun. ")
    input5=input("Insert an adjective. ")
    input6=input("Insert a noun. ")
    input7=input("Insert a adjective. ")
    input8=input("Insert an adjective. ")
    input9=input("Insert a plural noun. ")
    input10=input("Insert a noun. ")
    input11=input("Insert a number. ")
    input12=input("Insert shapes. ")
    input13=input("Insert a food. ")
    input14=input("Insert a food. ")
    input15=input("Insert an number. ")
    ans=input("Would you like to read your story?")
    if ans=="yes"or ans=="Yes" or ans=="y": #credit: Luke Chrampanis
        return("Pizza was invented by {} {} named {}.\nTo make a pizza, you need to take a lump of {}, and make a thin, round {} {}.\nThen you cover it with {} sauce, {} cheese, and fresh chopped {}.\nNext you have to bake it in a very hot {}.\nWhen it is done, cut it into {} {}.\nSome kids like {} pizza the best, but my favorite is the {} pizza.\nIf I could, I would eat pizza {} times a day.".format(input1, input2, input3, input4, input5, input6, input7, input8, input9, input10, input11, input12, input13, input14, input15))

def WelcomeUser():#This function is displayed at the end because all the functions are defined.
    print("Here are our themes.")
    print("Teacher, Astronaut, or Pizza")
    ans=input("Choose a theme!")#This allows user to pixk a theme.
    if ans=="Teacher":
        with open("teacherStory.txt", "w") as f:
            f.write(teacherStory())
        with open("teacherStory.txt") as f:
            for i in range(0,6):
                variable = f.readline()
                print(variable, end="")
    if ans=="Astronaut":
        with open("astroStory.txt", "w") as f:
            f.write(astroStory())
        with open("astroStory.txt") as f:
            for i in range(0,5):
                variable = f.readline()
                print(variable, end="")
    if ans=="Pizza":
        with open("pizzaStory.txt", "w") as f:
            f.write(pizzaStory())
        with open("pizzaStory.txt") as f:
            for i in range(0,8):
                variable = f.readline()
                print(variable, end="")
WelcomeUser()
