a = "Life is too short, You need Python"
# 문자열은 각 문자마다 번호를 가짐
# 문자열에서 L은 첫 번째 자리를 뜻하는 숫자인 0, 바로 다음인 i는 1

# 문자열 인덱싱(indexing) : 무엇인가를 가리킨다는 의미
print(a[3]) # e 반환
print(a[0]) # L 반환
print(a[12]) # s 반환

# a[-1]은 문자열을 뒤에서부터 읽기 위해서 마이너스(-)를 붙인 것
print(a[-1]) # n 반환
print(a[-0]) # -0과 0은 같은 L 반환
print(a[-2]) # 뒤에서 두 번째 문자 o 반환
print(a[-5]) # 뒤에서 다섯 번째 문자 y 반환



#문자열 슬라이싱 : 한 문자만을 뽑아내는 것이 아닌 'Life' 또는 'You' 같은 단어를 뽑아냄
# 변수명[시작 번호:끝 번호]를 지정하며 끝 번호 전까지만 포함함
# 즉 a[0:4]면 인덱스 0 부터 인덱스 4 이전 까지
print(a[0:4]) # Life 반환, 인덱스 0 ~ 3
print(a[0:2]) # Li 반환, 인덱스 0 ~ 1
print(a[5:7]) # is 반환, 인덱스 5 ~ 6
print(a[12:17]) # short 반환, 인덱스 12 ~ 16

# 변수명[시작 번호:끝 번호]에서 끝 번호 부분을 생략하면 시작 번호부터 그 문자열의 끝까지 뽑아냄
print(a[19:]) # You need Python 반환, 인덱스 19 ~

# 변수명[시작 번호:끝 번호]에서 시작 번호 부분을 생략하면 처음부터 끝 번호까지 뽑아냄
print(a[:17]) # Life is too short 반환, 인덱스 ~ 17

# 변수명[시작 번호:끝 번호]에서 시작과 끝 번호 생략 시 전체를 뽑아냄
print(a[:]) # Life is too short, You need Python 반환

#슬라이싱으로 문자열 나누기
a = "20010331Rainy"

date = a[:8] # date에 처음부터 8까지의 문자를 대입
weather = a[8:] # weather에 8부터 끝까지의 문자를 대입

print(date) # 20010331 반환
print(weather) # Rainy 반환



