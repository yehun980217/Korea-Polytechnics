# 딕셔너리 자료형
# 리스트와 튜플과 다르게 순차적으로 해당 요소값을 얻는 게 아닌 key를 통해 value를 얻는다.
# 딕셔너리 만드는 법 : {key1 : value1, key2 : value2 ...}

dic = {'name':'pey', 'phone':'01022370241', 'birth':'0217'}

# 추가
a = {1:'a'}
a[2] = 'b'
print(a) # {1: 'a', 2: 'b'}
a['name'] = 'pey'
print(a) # {1: 'a', 2: 'b', 'name': 'pey'}
a[3] = [1,2,3]
print(a) # {1: 'a', 2: 'b', 'name': 'pey', 3: [1, 2, 3]}

# 삭제
del a[1] # key가 1인 값이 삭제
print(a) # {2: 'b', 'name': 'pey', 3: [1, 2, 3]}

# key를 사용해 value 얻기
grade = {'pey':10, 'julliet':99}
print(grade['pey']) # 10
print(grade['julliet']) # 99

a = {1:'a', 2:'b'}
# [] 안은 인덱스를 뜻하는 게 아닌 key를 뜻함
print(a[1]) # a
print(a[2]) # b

# 중복된 key값이 존재할 경우 1:'a'라는 쌍이 무시됨
a = {1:'a', 1:'b'}
print(a) # {1: 'b'}

# keys() : key 리스트 만들기
a = {'name':'pey', 'phone':'01022370241', 'birth':'0217'}
print(a.keys()) # dict_keys(['name', 'phone', 'birth'])
# key()는 딕셔너리 a의 key만 모아서 dict_keys라는 객체를 반환
# dict_keys 객체는 리스트와 차이가 없지만 리스트 함수는 사용 못함

# list() : dict_keys를 리스트로 변환
print(list(a.keys())) # ['name', 'phone', 'birth']

# values() : value 리스트 만들기
print(a.values()) # dict_values(['pey', '01022370241', '0217'])

# items() : key:value 쌍 얻기
print(a) # {'name': 'pey', 'phone': '01022370241', 'birth': '0217'}
print(a.items()) # dict_items([('name', 'pey'), ('phone', '01022370241'), ('birth', '0217')])

# clear() : key:value 쌍 모두 지우기
print(a.clear()) # None

# get() : key로 value 얻기
a = {'name': 'pey', 'phone': '01022370241', 'birth': '0217'}
print(a.get('name')) # pey
print(a.get('phone')) # 01022370241

# in() : key가 딕셔너리 안에 있는 지 조사하기
print('name' in a) # True
print('email' in a) # False
