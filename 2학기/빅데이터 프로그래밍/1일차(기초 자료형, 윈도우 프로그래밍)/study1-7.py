from tkinter import *

window = Tk()

# 버튼(Button)은 마우스로 클릭하면 눌리는 효과와 함께 지정한 작업이 실행되는 위젯
# 레이블과 달리 버튼을 눌렀을 때 어떤 작업을 하도록 설정해야 함
# command 옵션은 버튼을 눌렀을 때 지정한 작업을 처리

# 버튼 생성, command로 버튼을 누르면 나가지게 설정
button1 = Button(window,text = "파이썬 종료", fg = "red", command = quit)

button1.pack()

window.mainloop()