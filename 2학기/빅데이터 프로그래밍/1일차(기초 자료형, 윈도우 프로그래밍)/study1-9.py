from tkinter import *
from tkinter import messagebox

window = Tk()

# 함수 선언 부분
def myFunc() :
    # chk의 값에 따라 보여주는 창이 달라짐
    if chk.get() == 0 :
        messagebox.showinfo("", "체크버튼이 꺼졌어요.")
    else :
        messagebox.showinfo("", "체크버튼이 켜졌어요")

# 체크버튼(Checkbutton)은 켜고 끄는 데 사용하는 위젯
# 메인 코드 부분

#IntVar() 함수는 정수형 타입의 변수를 생성해줌
#체크 버튼을 켜면 chk = 1, 끄면 chk = 0
chk = IntVar()
cb1 = Checkbutton(window, text = "클릭하세요", variable = chk, command = myFunc)

cb1.pack()

window.mainloop()