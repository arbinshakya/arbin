x= input("Enter the name: ")
y= int(input("Enter your age: "))
def birthday_cake(x,y):
    if (y %2 == 0):
        print(""+str(y)+" #### Happy Birthday ",x,"##### " +str(y)+"!!! ####")

    else:
      print(""+str(y)+"******Happy Birthday",x,"!!!!!!"+str(y)+"!!! *******")

      
birthday_cake(x,y)