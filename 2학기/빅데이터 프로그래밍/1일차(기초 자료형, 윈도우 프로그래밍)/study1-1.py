# 정수형
a =  123
print(a) # 123 반환
a = -123
print(a) # -123 반환
a = 0
print(a) # 0 반환

# 실수형
a = 1.2
print(a) # 1.2 반환
a = -3.45
print(a) # -3.45 반환

# 8진수는 숫자 0 + 알파벳 o 사용
a = 0o177
print(a) # 127 반환

# 16진수는 숫자 0 + 알파벳 x 사용
a = 0x5ff
print(a) # 1535 반환
a = 0xABC
print(a) # 2748 반환

# 복소수(Complex number)는 Python에선 i 대신 j를 사용
a = 1 + 2j
print(a) # (1+2j) 반환
a = 3 - 4j
print(a) # (3-4j) 반환

# 복소수 관련 내장 함수를 사용하기 위해 변수명.함수이름 사용
# 변수명.real은 복소수의 실수 부분 반환
print(a.real) # 3.0 반환
# 변수명.imag는 복수수의 허수 부분 반환
print(a.imag) # -4 반환

# 사칙연산
a = 3
b = 4
print(a + b) # 7
print(a - b) # -1
print(a * b) # 12
print(a / b) # 0.75

# x의 y제곱을 나타내는 연산자
print(a ** b) # 81

# 나눗셈 후 나머지를 반환하는 % 연산자
print(7 % 3) # 1
print(3 % 7) # 3

# 나눗셈 후 소수점 아랫자리를 버리는 // 연산자
print(7 / 4) # 1.75
print(7 // 4) # 1