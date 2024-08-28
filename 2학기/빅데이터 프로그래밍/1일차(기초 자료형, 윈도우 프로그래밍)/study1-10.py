from tkinter import *

window = Tk()

# 함수 선언 부분
def myFunc() :
    if var.get() == 1 :
        label1.configure(text = "Python")
    elif var.get() == 2 :
        label1.configure(text = "C++")
    else :
        label1.configure(text = "JAVA")

# 메인 코드 부분
var = IntVar()

rb1 = Radiobutton(window, text = "Python", variable = var, value = 1, command = myFunc)
rb2 = Radiobutton(window, text = "C++", variable = var, value = 2, command = myFunc)
rb3 = Radiobutton(window, text = "JAVA", variable = var, value = 3, command = myFunc)

label1 = Label(window, text = "선택한 언어 : ", fg = "red")

rb1.pack()
rb2.pack()
rb3.pack()
label1.pack()

window.mainloop()
