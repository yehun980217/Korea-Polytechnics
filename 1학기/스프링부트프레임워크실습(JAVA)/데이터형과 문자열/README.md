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
    <br><code>char ch3 = '5';</code>
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
  <code>각 문자에는 고유한 숫자가 할당되어 있는 데, 이를 아스키코드(SACII code)라고 함</code>
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
