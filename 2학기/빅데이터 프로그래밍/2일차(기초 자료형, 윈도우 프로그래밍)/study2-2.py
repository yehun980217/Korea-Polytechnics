import random
myList = [1, 2, 3, 4, 5, 6]

while(True) :
    response = input("주사위 던지기를 계속 하시겠습니까? (yes / no)")
    if response == "yes" :
        coin = random.choice(myList)
        print(coin)
    else :
        break