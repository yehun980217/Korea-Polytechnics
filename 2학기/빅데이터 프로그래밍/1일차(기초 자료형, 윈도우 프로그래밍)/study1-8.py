from tkinter import *

# messagebox를 사용하기 위해 패키지를 불러와야함
from tkinter import messagebox

# 함수 선언 부분
def myFunc() :
    messagebox.showinfo("강아지 버튼", "강아지 귀엽죠? ^^")

# 메인 코드 부분
window = Tk()

photo = PhotoImage(file = "GIF/dog2.gif")
# 버튼에 photo를 넣어 이미지로 설정하고 command로 버튼 이벤트 시 myFunc 함수가 실행되게 설정
button1 = Button(window, image = photo, command = myFunc)

button1.pack()

window.mainloop()
