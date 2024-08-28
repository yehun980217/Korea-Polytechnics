# input() 함수는 무조건 문자열만 입력 받기 때문에 문자열을 다시 int() 함수를 사용하여 정수로 변환시킴

a = int(input("첫 번째 숫자를 입력하세요 : "))
b = int(input("두 번째 숫자를 입력하세요 : "))

result = a + b
print(a, " + ", b, " = ", result)
result = a - b
print(a, " - ", b, " = ", result)
result = a * b
print(a, " * ", b, " = ", result)
result = a / b
print(a, " / ", b, " = ", result)
