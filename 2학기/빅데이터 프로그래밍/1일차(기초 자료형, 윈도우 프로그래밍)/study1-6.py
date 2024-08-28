# 위젯(Widget)은 윈도우 참에 나올 수 있는 문자, 버튼 등을 의미
# Python에서 GUI 관련 모듈을 제공하는 표준 윈도우 라이브러리
from tkinter import *

window = Tk()

window.title("윈도우창 연습") # 윈도우창 제목 변경
window.geometry("400x100") # 초기 크기 설정
window.resizable(width = FALSE, height = FALSE) # FALSE로 설정하면 창크기를 임의로 조절할 수 없음

# 레이블(Label)은 문자를 표현할 수 있는 위젯
# 레이블 같은 위젯은 pack() 함수를 호출해야 화면에 표시됨
label1 = Label(window, text = "COOKBOOK~~Python을")
label2 = Label(window, text = "열심히", font = ("궁서체", 30), fg = "blue")
label3 = Label(window, text = "공부 중입니다.", bg = "magenta", width = 20, height = 5, anchor = SE)

label1.pack()
label2.pack()
label3.pack()

window.mainloop()