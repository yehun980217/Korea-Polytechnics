# 1. 함수 사용 방법

print("hello World")

# R 함수 factorial(n), n이 자연수일 때, 1부터 n까지의 모든 자연수의 곱
9*8*7*6*5*4*3*2*1
factorial(9)

# 두 개의 인자가 필요한 함수 rep(), 어떠한 값을 몇 번 반복해 백터 타입의 시퀀스로 반환
# symbol은 x, times는 반복 횟수
rep(x="대황스피", times=5)

# 그래프 그리기 plot(x,y)
plot(10,10)

# 두 개의 점 찍기 plot(c(x,y), c(x,y))
plot(c(5,7), c(20,30))

# 여러 개의 점 찍기, 랜덤 숫자를 반환해주는 runif(n) 함수
plot(runif(100), runif(100))

# 2. 객체 사용 방법
# R은 '변수'라는 말 대신 '객체'란 단어를 사용
Object1 <- 1
Object2 <- 2
# 객체 값 기입 시 <- 사용

# 객체 값 확인은 객체명 입력
Object1
Object2

# Command 창에 값을 바로 계산 가능
1+2

# 객체에는 수치 값, 문자열, Boolean(TRUE, FALSE) 값 등 입력 가능
# 여러 객체를 합쳐서 보여주는 paste() 함수
Object1 <- "문자열"
Object2 <- "데이터"
paste(Object1, Object2)

# 논리형 Boolean 데이터 기입
Object1 <- TRUE
Object2 <- FALSE
Object1
Object2

# R은 스칼라가 없고 '벡터'가 최소 단위 데이터임

# 3. 객체에 또 다른 객체 넣기
Object1 <- 1
Object2 <- 2
Object1
Object1 <- Object2
Object1

# 4. 객체에 함수 넣기
Object1 <- sum(1,8,4,5,9)
Object1

# 5. 벡터에 대해 더 자세히 살펴보기
# R은 통계를 위한 프로그램 언어이고 통계는 엄청나게 큰 데이터를 다루기에 작은 단위까지 일일이 모두 신경쓰지 않게 하기 위함
# 벡터를 다루는 c() 함수, 인자 안에 벡터로 묶을 데이터 기입
a <- c(1,3,5,6,9)
a

# a객체가 벡터인지 확인하기 위한 is.vector() 함수
a <- 1
is.vector(a)
a <- c(1,2,5)
is.vector(a)

# 객체에 여러 개의 문자열 기입, 문자열은 반드시 ""를 사용해야함
a <- c("첫 번째", "두 번째", "세 번째")
a

# 벡터는 한가지 데이터 형식만 가짐
# 세 번째 값까지는 정수이지만 마지막은 문자열임. 이렇게 쓰면 모든 값을 문자열로 바꿈
a <- c(1,2,3,"돌보다 못한 수익률")
a

# 6. 벡터를 추가, 삭제, 수정하기
Object <- c(1,3,8,9)
Object
#Object는 1 3 8 9 반환

# 맨 끝에 값을 추가하기
Object <- c(Object, 11)
Object
# Object는 1 3 8 9 11을 반환

# 맨 앞에 값을 추가하기
Object <- c(0, Object)
Object
# Object는 0 1 3 8 9 11을 반환

# 중간에 값을 추가하기, append(객체, 값, after = n), after은 중간 위치 지정
Object <- append(Object, 99, after=2)
Object
# Object는 0 1 99 3 8 9 11을 반환

# 중간에 값을 삭제하기
Object <- Object[-2]
Object
# Object는 0 99 3 8 9 11을 반환

# 맨 끝에 값을 삭제하기, 객체[-length(객체)]
Object <- Object[-length(Object)]
Object
# Object는 0 99 3 8 9를 반환

# 특정 위치의 값을 변경하기, 객체[변경하고 싶은 값의 인덱스] <- 변경할 값
Object[3] <- 9
Object
# Object는 0 99 9 8 9를 반환

# 5라는 값을 모두 100으로 변경하기
Object <- c(1,2,3,1,2,3,3,2,1,5,1,2)
Object
Object[Object == 5] <- 100
Object

# 7. 객체 사용 몇 가지 팁

# 자신이 만든 모든 변수를 보고 싶다면 ls()
ls()

# 어떤 객체를 지우고 싶다면 rm(객체명, 객체명, 객체명)

# 모든 객체를 지우고 싶다면 rm(list=ls())

# 8. 패키지 설치

# 3D plot을 구현해주는 rgl 설치
# install.packages("rgl")

# 설치된 패키지 사용하기 위해선 로드를 해야함
# library("rgl")

# 예제 실행
# 인터렉션 그래프, 창 크기 조절 가능, 그래프를 마우스로 회전하며 볼 수 있음
example(plot3d)

# 9. R에서 외부데이터를 읽어 들이는 다양한 방법
# 외부에서 테이블로 정리한 데이터를 R로 가져오면 데이터프레임(dataframe) 객체에 담김

# CSV 포맷 읽어들이기, 객체 <- read.csv("파일명", fileEncoding = "CP949")
# 데이터를 가져오는 가장 좋은 방법은 csv파일을 가져오는 것임
List <- read.csv("example_studentlist.csv", fileEncoding = "CP949")
List
# read.csv() 함수는 첫 번째 행을 변수행의 이름으로 인식하도록 기본값이 설정되어있음
# 만약 csv파일에 변수행의 이름이 없다면 read.csv() 함수의 header 인자를 FALSE로 설정
# 한글을 포함한 데이터를 사용하기 위해 fileEncoding 인자를 "CP949"로 설정

# txt 포맷을 다양한 방법으로 읽어 들이기
# txt 파일은 tab으로 값을 구분
List <- read.table("studentlist.txt", fileEncoding = "CP949")
List

# read.table()은 read.csv()와 다르게 header 인자 값이 FALSE로 되어있음
# 파일에 변수열 이름이 있다면 header=TRUE 인자를 반드시 입력해야됨
List <- read.table("studentlist.txt", fileEncoding = "CP949", header = TRUE)
List

# ';'으로 구분되어 있다면 sep=";" 인자를 입력해야함
List <- read.table("studentlist2.txt", fileEncoding = "CP949", header=TRUE, sep=";")
List

# Excel 파일 읽어들이기

# 패키지 설치
# install.packages("readxl")
# library("readxl")

# Excel 파일 읽기
DF <- read_excel(path="studentlist.xlsx",sheet="Sheet1",col_name=TRUE)
DF