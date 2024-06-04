<h1>변수명 작성 규칙</h1>
<ul>
  <li><strong>영문과 숫자 사용 가능</strong></li>
  <ul>
    <li>변수명은 영문이 맨 앞에 와야 함</li>
    <li>변수명을 숫자로만 구성해도 안되고 영문과 숫자가 섞여있더라도 숫자로 시작하면 안됨</li>
    <li>변수명의 첫글자는 보통 소문자 영어로 시작</li>
  </ul>
  <code>int a = 100;</code><br>
  <code>int abcd = 200;</code><br>
  <code>int zzzz = 300;</code><br>
  <code>int its4you = 400;</code><br><br>
  <li><strong>오류가 발생하는 경우</strong></li>
  <code>int 333 = 100;</code><br>
  <code>int 3abc = 200;</code><br><br>
  <li><strong>언더바 사용 가능</strong></li>
  <ul>
    <li>변수명에는 띄어쓰기를 허용하지 않음</li>
    <li>띄어쓰기 자리에 언더바(_)를 사용하면 의미를 쉽게 알아볼 수 있음</li>
    <li>언더바는 변수명의 맨 앞, 중간, 맨 뒤 어디에든 넣을 수 있음</li>
  </ul>
    <code>int input_number = 100;</code><br>
    <code>int _number = 200;</code><br>
    <code>int _data_ = 300;</code><br>
    <code>int __my__ = 400;</code><br>
    <code>_1 = 500;</code><br>
    <code>_1234 = 600;</code><br><br>
  <li><strong>대소문자 구분</strong></li>
  <ul>
    <li>변수명의 대문자와 소문자는 같지 않음</li>
    <li>변수명에 대문자와 소문자를 섞으면 언더바 없이도 의미를 부여할 수 있음</li>
    <li>변수명은 소문자로 시작하고 클래스명은 대문자로 시작하는 것을 권장함</li><br>
  </ul>
  <li><strong>예약어 사용 불가</strong></li>
  <ul>
    <li>예약어란 자바에서 이미 문법상 사용하고 있는 단어</li>
  </ul>
<table>
  <tr>
    <td><code>abstract</code></td>
    <td><code>continue</code></td>
    <td><code>for</code></td>
    <td><code>new</code></td>
    <td><code>switch</code></td>
    <td><code>assert</code></td>
    <td><code>default</code></td>
  </tr>
  <tr>
    <td><code>goto</code></td>
    <td><code>boolean</code></td>
    <td><code>do</code></td>
    <td><code>if</code></td>
    <td><code>private</code></td>
    <td><code>this</code></td>
    <td><code>break</code></td>
  </tr>
  <tr>
    <td><code>double</code></td>
    <td><code>implements</code></td>
    <td><code>protected</code></td>
    <td><code>throw</code></td>
    <td><code>byte</code></td>
    <td><code>else</code></td>
    <td><code>import</code></td>
  </tr>
</table>
<li><strong>클래스명 사용 지양</strong></li>
  <ul>
    <li>클래스명을 변수로 사용하면 문법상 오류가 발생하지는 않음</li>
    <li>하지만 클래스 본래의 기능을 잃어버리기 때문에 프로그램이 엉망이 될 수도 있음</li>
  </ul>
</ul>
<h1>바람직한 변수명</h1>
<ul>
  <li><strong>바람직하지 않은 변수명</strong></li>
  <ul><li>변수의 용도를 알 수 없는 경우</li></ul>
  <code>int a = 100;</code><br>
  <code>int bbb = 200;</code><br>
  <code>int asdf = 300;</code><br><br>
  <ul><li>너무 긴 경우</li></ul>
  <code>int first_number_of_user_input_values = 100;</code><br>
  <code>int second_number_of_user_input_values = 200;</code><br><br>
  <li><strong>바람직한 변수명</strong></li>
  <ul><li>짧으면서도 의미를 한눈에 파악할 수 있는 경우</li></ul>
  <code>int first_num = 100;</code><br>
  <code>int num_input = 200;</code><br>
  <code>int inputData = 300;</code><br><br>
</ul>
<h1>변수 표기 방식</h1>
<ul>
  <li><strong>카멜(Camel) 표현식</strong></li>
  <ul>
    <li>일반적으로 가장 많이 사용하는 방식</li>
    <li>"낙타 혹" 모양으로 변수명을 표현</li>
    <li>단어와 단어를 붙여 표현하는 경우, 가독성을 높이기 위해 사용</li>
    <li>Oracle과 DB는 컬럼명을 언더바로 단어와 단어 구분</li>
    <li>JAVA와 같은 프로그래밍 언어는 카멜 표현식 사용</li>
  </ul>
  <code>String user_name → String user<strong>N</strong>ame</code>
</ul>
