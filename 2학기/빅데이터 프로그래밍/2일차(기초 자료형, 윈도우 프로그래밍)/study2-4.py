from tkinter import *
from typing import List

# 전역 변수 선언 부분.
# 버튼을 저장할 9개짜리 리스트 준비
btnList = [None] * 9
# 이미지 파일명을 저장하는 리스트
fnameList = ["froyo.gif", "gingerbread.gif", "honeycomb.gif", "icecream.gif",
             "jellybean.gif", "kitkat.gif", "lollipop.gif", "marshmallow.gif", "nougat.gif"]

photoList = [None] * 9 # Photoimage()로 생성할 9개짜리 리스트
i, k = 0, 0
xPos, yPos = 0, 0 # 좌표 변수
num = 0

# 메인 코드 부분
window = Tk()
window.geometry("210x210")

for i in range(0, 9) :
    photoList[i] = PhotoImage(file = "../GIF/" + fnameList[i]) # 경로와 파일명을 합침
    btnList[i] = Button(window, image = photoList[i]) # 버튼에 이미지 삽입

for i in range(0, 3) :
    for k in range(0, 3) :
        btnList[num].place(x = xPos, y = yPos)
        num += 1
        xPos += 70 # x로 70씩 증가
    xPos = 0
    yPos += 70 # k for문을 빠져나와 y좌표 70 증가

window.mainloop()
