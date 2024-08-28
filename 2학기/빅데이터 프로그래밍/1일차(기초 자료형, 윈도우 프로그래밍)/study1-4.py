# python에서 제공하는 turtle 패키지를 불러옴
import turtle

# 불러온 turtle의 모양을 설정
turtle.shape('turtle')

# 거북이 이동
turtle.forward(200)
turtle.right(90)
turtle.forward(200)
turtle.right(90)
turtle.forward(200)
turtle.right(90)
turtle.forward(200)
turtle.right(90)

# 그래픽 창이 닫히지 않도록 해주는 명령어
# JAVA의 scanner.close()와 다른 역할
turtle.done()