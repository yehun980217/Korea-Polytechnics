<h1>데이터형</h1>
<ul>
  <li>변수나 상수의 종류를 데이터형이라고 함</li>
  <li>가장 많이 사용되는 기본 데이터형</li>
  <p>정수, 실수, 문자, 불(Boolean), 문자열</p>
</ul>
<h1>정수 데이터형</h1>
<table>
  <tr>
    <th>정수형</th>
    <th>의미</th>
    <th>크기</th>
    <th>값의 범위</th>
  </tr>
  <tr>
    <td>byte</td>
    <td>아주 작은 정수</td>
    <td>1바이트</td>
    <td>-2⁷(-128)~2⁷-1(127)</td>
  </tr>
  <tr>
    <td>short</td>
    <td>작은 정수</td>
    <td>2바이트</td>
    <td>-2¹⁶(-32768)~2¹⁶-1(32767)</td>
  </tr>
  <tr>
    <td>int</td>
    <td>정수</td>
    <td>4바이트</td>
    <td>2³¹(약 -21억)~2³¹-1(약 21억)</td>
  </tr>
  <tr>
    <td>long</td>
    <td>큰 정수</td>
    <td>8바이트</td>
    <td>-2⁶³(약 -900경)~2⁶³-1(약 900경)</td>
  </tr>
</table>
<h1>실수 데이터형</h1>
<ul>
  <li>3.14, -8.8과 같이 소수점이 있는 숫자를 의미함</li>
  <li>기본형은 double형임</li>
  <li>float형의 경우 float를 의미하는 'f'를 숫자 뒤에 붙여야 함 예)3.14f</li>
  <li>float형과 double형은 둘 다 값의 범위가 크기에 이 둘을 구분하여 사용하는 경우는 흔치 않음</li>
  <p><code>float형과 double형의 중요한 차이 : 소수점 아래 자릿수</code><br>
  <code>double형 : 소수점 아래 15~16자리</code><br>
  <code>float형 : 소수점 아래 7자리</code></p>
</ul>
<table>
  <tr>
    <th>실수형</th>
    <th>의미</th>
    <th>크기</th>
    <th>값의 범위</th>
  </tr>
  <tr>
    <td>float</td>
    <td>실수</td>
    <td>4바이트</td>
    <td>약 -3.4 X 1038 ~ 3.4 X 1038</td>
  </tr>
  <tr>
    <td>double</td>
    <td>큰 실수</td>
    <td>8바이트</td>
    <td>약 -1.79 X 10308 ~ 1.79 X 10308</td>
  </tr>
</table>
<h1>문자 데이터형</h1>
<ul>
  <li>작은따옴표로 묶어서 대입함</li>
  <code>char ch1 = 'A';</code>
    <br><code>char ch2 = '난';</code>
    <br><code>char ch3 = '5';</code><br><br>
  <table>
    <tr>
      <th>문자형</th>
      <th>의미</th>
      <th>크기</th>
      <th>값의 범위</th>
    </tr>
    <tr>
      <td>char</td>
      <td>문자</td>
      <td>2바이트</td>
      <td>영문 또는 한글 한 글자</td>
    </tr>
  </table>
  <li>char형에는 문자 뿐 아니라 값의 범위에 해당하는 정수를 대입할 수도 있음</li>
  <code>각 문자에는 고유한 숫자가 할당되어 있는 데, 이를 아스키코드(SACII code)라고 함</code><br><br>
  <table>
    <tr>
      <th>아스키코드</th>
      <th>10진수</th>
    </tr>
    <tr>
      <td>0~9</td>
      <td>48~57</td>
    </tr>
    <tr>
      <td>A~Z</td>
      <td>65~90</td>
    </tr>
    <tr>
      <td>a~z</td>
      <td>97~122</td>
    </tr>
  </table>
</ul>
<h1>불 데이터형</h1>
<ul>
  <li>논리형이라고도 부르면 참(ture) 또는 거짓(flase)만 저장할 수 있음</li>
  <table>
    <tr>
      <th>불형</th>
      <th>의미</th>
      <th>크기</th>
      <th>값의 범위</th>
    </tr>
    <tr>
      <td>boolean</td>
      <td>참 또는 거짓</td>
      <td>1바이트</td>
      <td>true 또는 false</td>
    </tr>
  </table>
</ul>
<h1>문자열 클래스</h1>
<ul>
  <li>한 문자가 여러 개 이어진 문자형의 집합을 의미함</li>
  <li>큰따옴표로 감싸서 표현함</li>
  <li>자바는 문자열 데이터형을 따로 지원하지 않으며 String 클래스를 사용해야 함</li>
  <li>원칙적으로 문자열은 기본 데이터형이 아니지만 자주 사용되므로 데이터형에 포함하여 다룸</li>
  <table>
    <tr>
      <th>문자열 클래스</th>
      <th>의미</th>
      <th>크기</th>
      <th>값의 범위</th>
    </tr>
    <tr>
      <td>String</td>
      <td>문자열</td>
      <td>(입력된 문자 수 X 2)바이트</td>
      <td>입력된 모든 문자</td>
    </tr>
  </table>
</ul>
<h1>String은 기초(기본) 데이터타입이 아닌데?</h1>
<ul>
  <li>기초(기본) 데이터타입 구분 방법</li>
  <p>첫 글자 소문자 : 기초(기본) 데이터타입<br>
  <code><strong>i</strong>nt, <strong>l</strong>ong, <strong>f</strong>loat, <strong>d</strong>ouble</code><br>
  첫글자 대문자 : 일반 객체</p>
  <li>문자열 데이터타입인 String은 첫글자가 대문자인데, new 함수 써야하는 것 아닌가?</li>
  <p><code>String 객체는 자바에서 유일하게 일반 객체임에도 불구하고, new 함수를 사용하지 않고, 메모리에 올릴 수 있는 객체</code><br>
  자바에서 매우 자주 사용하는 객체이기에 예외적으로 메모리에 올림<br>
  기초(기본) 데이터타입과 동일하게 변수 값에 대입연산자(=)로 값이 저장되면, 자동으로 메모리 올라감</p>
</ul>
<h1>System.out의 대표적인 메서드</h1>
<ul>
  <li>System.out.println() : 괄호 안의 내용 출력 후 행갈이 O</li>
  <li>System.out.print() : 괄호 안의 내용 출력 후 행갈이 X</li>
  <li>System.out.printf() : 서식을 지정하여 출력 가능</li>
  <p>큰따옴표 안에 들어 있는 것이 '문자'든 '숫자 형태의 문자'든 무조건 문자로 취급<br>
  서식(%d)이 지정된 숫자는 숫자 자체를 의마하며, %d는 정수형으로 출력<br>
  <code>System.out.printf("200"); -> 문자열 200</code><br>
  <code>System.out.printf("%d", 200); -> 숫자 200</code></p>
</ul>
<h1>자주 사용되는 서식</h1>
<table>
  <tr>
    <th>서식</th>
    <th>설명</th>
    <th>예</th>
  </tr>
  <tr>
    <td>%d, %x, %o</td>
    <td>정수(10진수, 16진수, 8진수)</td>
    <td>10, 100, 1234</td>
  </tr>
  <tr>
    <td>%f</td>
    <td>실수(소수점이 있는 수)</td>
    <td>0.5, 1.0, 3.14</td>
  </tr>
  <tr>
    <td>%c</td>
    <td>한 개의 문자(작은따옴표로 묶음)</td>
    <td>'a', 'b', 'F'</td>
  </tr>
  <tr>
    <td>%s</td>
    <td>한 개 이상의 문자로 이루어진 문자열(큰따옴표로 묶음)</td>
    <td>"안녕", "abcde", "a"</td>
  </tr>
</table>
<h1>이스케이프(escape) 문자</h1>
<ul>
  <li>서식 문자로고도 함</li>
  <li>이스케이프 문자는 앞에 백슬래시를 붙이는 것이 특징</li>
  <table>
    <tr>
      <th>이스케이프 문자</th>
      <th>설명</th>
    </tr>
    <tr>
      <td>\n</td>
      <td>다음 행으로 이동(Enter와 같은 효과)</td>
    </tr>
    <tr>
      <td>\t</td>
      <td>다음 탭으로 이동(Tab과 같은 효과)</td>
    </tr>
    <tr>
      <td>\b</td>
      <td>뒤로 한 칸 이동(Backspace와 같은 효과)</td>
    </tr>
    <tr>
      <td>\'</td>
      <td>' 출력</td>
    </tr>
    <tr>
      <td>\"</td>
      <td>" 출력</td>
    </tr>
    <tr>
      <td>\\</td>
      <td>\ 출력</td>
    </tr>
  </table>
</ul>
<h1>문자열 관련 메서드</h1>
<ul>
  <li>length() : 문자열의 길이를 확일할 때 사용하는 메서드</li>
  <li>toUpperCase(), toLowerCase()</li>
  <p><code>toUpperCase()</code> : 영문 소문자를 대문자로 변환<br>
  <code>toLowerCase()</code> : 영문 대문자를 소문자로 변환<br>
  영문을 제외한 한글, 숫자, 기호 등은 toUpperCase(), toLowerCase() 메서드의 영향을 받지 않음</p>
  <li>trim() : 문자열 앞뒤의 공백을 잘라내는 메서드</li>
  <li>replaceAll() : 전체 공백 제거 가능, 기존 문자열을 새 문자열로 변경 가능</li>
  <li>indexOf()</li>
  <p>어떤 글자가 문자열의 몇 번째에 위치하는 지 찾는 메서드<br>
  문자열의 위치가 0번부터 시작됨<br>
  공백도 하나의 문자이므로 문자열의 순서에 포함됨</p>
  <li>indexOf( , )</li>
  <p>똑같은 문자가 여러 개 있을 때는 원하는 문자의 위치를 찾는 메서드<br>
  찾는 문자열이 시작위치에서 몇 번째에 있는 지 알려줌</p>
  <li>charAt()</li>
  <p>문자열의 각 문자에 접근하는 메서드<br>
  문자열은 여러 개의 문자로 이루어져 있기 때문에 각 문자마다 위치가 지정되어 있음
  <br><code>문자열의 길이와 순번은 다르기 때문에 주의해야함</code></p>
  <li>substring( , )</li>
  <p>추출한 하나의 문자를 문자열로 취급하고 싶을 때 사용<br>
  끝 위치의 문자는 포함되지 않음<br>
  여러 문자를 추출할 수도 있음</p>
</ul>
