<h1>배열</h1>
<ul>
  <li>배열의 개념</li>
  <ul>
    <li>배열을 사용하는 이유</li>
    <p>정수형 변수 num1 ~ num4를 선언하고 변수에 값을 입력받아 합계를 출력하는 프로그램을 작성하는 경우<br>
        &nbsp; &nbsp; → 변수 네 개를 선언하고 값을 입력받아 합을 구하는 코드는 간단함<br>
      &nbsp; &nbsp;   → 하지만 변수가 1000개 변수 num1 ~ num1000을 입력하는 것은 현실적으로 어려움<br>
        &nbsp; &nbsp; → 이럴 때 배열을 이용함</p>
    <li>배열</li>
    <p>배열에 여러 데이터를 한꺼번에 담을 수 있음<br>
    여러 개의 값을 하나로 묶어놓은 꾸러미와 같음<br>
    배열은 단독으로 사용하기보다는 주로 for문과 함께 사용함</p>
    <li>배열을 사용하는 경우</li>
    <p> &nbsp; &nbsp;→ 배열은 하나씩 사용하던 변수를 한 줄로 붙여놓은 것<br>
       &nbsp; &nbsp;  → 변수를 한 덩어리로 만들면 변수명도 한 개로 충분함<br>
      &nbsp; &nbsp;  → 한 줄로 붙인 덩어리 전체의 이름을 numAry와 같이 하나로 지정함<br>
      &nbsp; &nbsp;   → 배열을 이루는 각 요소에는 numAry[0] ~ numAry[3]과 같이 번호(첨자)를 붙여 접근함</p>
    <li>배열을 선언하는 형식</li>
    <p><code>데이터형[] 배열명 = new 데이터형[개수];</code> 또는 <code>데이터형 배열명[] = new 데이터형[개수]</code><br>
    배열 선언을 먼저 하고 new 연산자를 나중에 사용하는 방법<br>
    <code>데이터형[] 배열명;</code> 또는 <code>데이터형 배열명[];</code><br>
      <code>배열명 = new [개수];</code></p>
    <li>변수 선언과 배열 선언의 차이점</li>
    <p>변수 선언 : 각 변수를 int num1, num2...; 와 같이 선언하여 사용함<br>
    배열 선언 : numAry[0], numAry[1]... 과 같이 첨자로 표시하여 사용함(첨자는 1이 아닌 0부터 시작)</p>
  </ul>
  <li>배열의 활용</li>
  <ul>
    <li>배열의 특성과 활용</li>
    <p>배열에서 100개의 숫자를 더하는 경우<br>
      &nbsp; &nbsp;   → 배열을 선언하고 값을 입력하는 과정을 100번 반복<br>
      &nbsp; &nbsp;   → numAry[0] + numAry[1] + ... + numAry[99]<br>
      &nbsp; &nbsp;   → 이렇게 사용하면 배열의 의미가 없음<br>
    첨자를 반복문(for, while, do~while)과 결합하여 사용하기<br>
      &nbsp; &nbsp;   → 첨자가 순서대로 바뀌도록 반복문고하 함께 활용해야함</p>
    <li>배열의 초기화</li>
    <p>배열을 선언하는 동시에 값을 대입하는 것<br>
    배열을 선언하는 대괄호 안에 개수를 적지 않음<br>
    선언한 초깃값 개수에 따라서 배열의 요소가 차례대로 초기화됨<br>
    <code>int numAry[] = {100, 200, 300, 400};</code><br>
    배열을 먼저 선언하고 초깃값을 대입하는 방식으로 초기화를 할 수도 있음<br>
    <code>int numAry[];</code><br>
    <code>numAry = new int[] {100, 200, 300, 400};</code><br>
    배열을 선언하기만 하고 초기화를 하지 않을 경우 모든 요소에 0이 들어감<br>
    <code>int numAry[] = new int[4]; → {0, 0, 0, 0}</code></p>
    <li>배열의 요소 개수</li>
    <p>배열의 길이(요소 개수)를 알아내는 형식<br>
    <code>배열요소개수 = 배열명.length;</code><br>
    [예] int ary[] = new int[4] 일 때 ary의 길이 알아내기<br>
    <code>int count = ary.length;</code></p>
    <li>배열의 길이 변경</li>
    <p>배열의 길이를 늘려야 하는 경우<br>
    &nbsp; &nbsp;→ 이때 기존 데이터를 그대로 유지하면서 배열의 길이 변경하기<br>
    배열의 길이를 변경하는 형식<br>
    <code>import java.util.Arrays;</code><br>
    <code>배열명 = Arrays.copyOf(배열명, 새로운_길이)</code></p>
    <li>for문의 다른 용법</li>
    <p>배열의 요소에 하나씩 접근하여 출력하는 for문<br>
    &nbsp; &nbsp;→ 배열의 요소를 추출하기 위해 첨자 i를 사용함<br>
    ![image](https://github.com/yehun980217/Korea-Polytechnics/assets/148829925/a1061b2d-cdf4-4a08-8736-831fdac4eadc)
</p>
  </ul>
</ul>
