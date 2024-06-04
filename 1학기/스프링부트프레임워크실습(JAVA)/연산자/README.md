<h1>산술 연산자</h1>
<p>기본적인 산술 연산자</p>
<table>
  <tr>
    <th>연산자</th>
    <th>설명</th>
    <th>예시</th>
  </tr>
  <tr>
    <td>+</td>
    <td>덧셈 (Addition): 5와 3을 더한 값을 a에 대입</td>
    <td>a = 5 + 3 (a = 8)</td>
  </tr>
  <tr>
    <td>-</td>
    <td>뺄셈 (Subtraction): 5에서 3을 뺀 값을 a에 대입</td>
    <td>a = 5 - 3 (a = 2)</td>
  </tr>
  <tr>
    <td>*</td>
    <td>곱셈 (Multiplication): 5와 3을 곱한 값을 a에 대입</td>
    <td>a = 5 * 3 (a = 15)</td>
  </tr>
  <tr>
    <td>/</td>
    <td>나눗셈 (Division): 5를 3으로 나눈 값을 a에 대입</td>
    <td>a = 5 / 3 (a ≈ 1.67)</td>
  </tr>
  <tr>
    <td>%</td>
    <td>나머지 (Modulo): 5를 3으로 나눈 나머지를 a에 대입</td>
    <td>a = 5 % 3 (a = 2)</td>
  </tr>
</table>
<h1>대입 연산자</h1>

<table>
  <tr>
    <th>연산자</th>
    <th>설명</th>
    <th>예시</th>
  </tr>
  <tr>
    <td>+=</td>
    <td>num = num + 3과 동일</td>
    <td>num += 3</td>
  </tr>
  <tr>
    <td>-=</td>
    <td>num = num - 3과 동일</td>
    <td>num -= 3</td>
  </tr>
  <tr>
    <td>*=</td>
    <td>num = num * 3과 동일</td>
    <td>num *= 3</td>
  </tr>
  <tr>
    <td>/=</td>
    <td>num = num / 3과 동일</td>
    <td>num /= 3</td>
  </tr>
  <tr>
    <td>%=</td>
    <td>num = num % 3과 동일</td>
    <td>num %= 3</td>
  </tr>
</table>
<h1>증감 연산자</h1>
<p>++ : 변수의 값이 1씩 증가</p>
<p>-- : 변수의 값이 1씩 감소</p>
<table>
  <tr>
    <th>연산자</th>
    <th>설명</th>
    <th>예시</th>
  </tr>
  <tr>
    <td>++num</td>
    <td>전위 증가 (Pre-increment): num을 먼저 1 증가시키고, 증가된 값을 반환</td>
    <td>num = 5; ++num; // num은 6이 됨</td>
  </tr>
  <tr>
    <td>num++</td>
    <td>후위 증가 (Post-increment): num을 먼저 반환하고, 그 후에 1 증가시킴</td>
    <td>num = 5; num++; // num은 6이 됨</td>
  </tr>
  <tr>
    <td>--num</td>
    <td>전위 감소 (Pre-decrement): num을 먼저 1 감소시키고, 감소된 값을 반환</td>
    <td>num = 5; --num; // num은 4가 됨</td>
  </tr>
  <tr>
    <td>num--</td>
    <td>후위 감소 (Post-decrement): num을 먼저 반환하고, 그 후에 1 감소시킴</td>
    <td>num = 5; num--; // num은 4가 됨</td>
  </tr>
</table>
<h1>비교 연산자</h1>
<p>어떤 것이 큰지, 작은지, 같은지를 비교하는 연산자로 <strong>관계 연산자</strong>라고도 부름</p>
<p>비교 연산자의 결과 : yes 또는 true(참), no 또는 false(거짓)</p>
<table>
  <tr>
    <th>연산자</th>
    <th>설명</th>
    <th>예시</th>
  </tr>
  <tr>
    <td>==</td>
    <td>같음 (Equal to): 두 값이 같으면 참</td>
    <td>a == b</td>
  </tr>
  <tr>
    <td>!=</td>
    <td>같지 않음 (Not equal to): 두 값이 다르면 참</td>
    <td>a != b</td>
  </tr>
  <tr>
    <td>></td>
    <td>보다 큼 (Greater than): 왼쪽 값이 오른쪽 값보다 크면 참</td>
    <td>a > b</td>
  </tr>
  <tr>
    <td><</td>
    <td>보다 작음 (Less than): 왼쪽 값이 오른쪽 값보다 작으면 참</td>
    <td>a < b</td>
  </tr>
  <tr>
    <td>>=</td>
    <td>보다 크거나 같음 (Greater than or equal to): 왼쪽 값이 오른쪽 값보다 크거나 같으면 참</td>
    <td>a >= b</td>
  </tr>
  <tr>
    <td><=</td>
    <td>보다 작거나 같음 (Less than or equal to): 왼쪽 값이 오른쪽 값보다 작거나 같으면 참</td>
    <td>a <= b</td>
  </tr>
</table>
<h1>논리 연산자</h1>
<p>비교 연산자가 여러번 필요할 때 사용</p>
# 논리 연산자 테이블

논리 연산자에 대한 기본적인 설명을 담은 표입니다.

<table>
  <tr>
    <th>연산자</th>
    <th>설명</th>
    <th>의미</th>
    <th>예시</th>
  </tr>
  <tr>
    <td>&&</td>
    <td>논리 AND (Logical AND): 두 조건이 모두 참일 때만 참</td>
    <td>그리고(AND)</td>
    <td>(a > 0) && (b > 0)</td>
  </tr>
  <tr>
    <td>||</td>
    <td>논리 OR (Logical OR): 두 조건 중 하나라도 참이면 참</td>
    <td>또는(OR)</td>
    <td>(a > 0) || (b > 0)</td>
  </tr>
  <tr>
    <td>!</td>
    <td>논리 NOT (Logical NOT): 조건이 거짓일 때 참</td>
    <td>부정(NOT)</td>
    <td>!(a > 0)</td>
  </tr>
</table>
<h1>연산자 우선순위</h1>
<p>한 줄에 여러 연산자가 동시에 들어가는 경우 어떤 연산자를 먼저 계산할지 정함</p>
<table>
  <tr>
    <th>우선순위</th>
    <th>연산자</th>
    <th>설명</th>
    <th>순위가 같을 때의 진행 방향</th>
  </tr>
  <tr>
    <td>★1</td>
    <td>() [] .</td>
    <td>1차 연산자</td>
    <td>→</td>
  </tr>
  <tr>
    <td>★2</td>
    <td>+ - ++ -- ~ ! (type)</td>
    <td>단향 연산자(변수 또는 상수 앞에 붙음)</td>
    <td>←</td>
  </tr>
  <tr>
    <td>★3</td>
    <td>* / %</td>
    <td>산술 연산자</td>
    <td>→</td>
  </tr>
  <tr>
    <td>★4</td>
    <td>+ -</td>
    <td>산술 연산자</td>
    <td>→</td>
  </tr>
  <tr>
    <td>5</td>
    <td><< >> >>></td>
    <td>비트 시프트 연산자</td>
    <td>→</td>
  </tr>
  <tr>
    <td>6</td>
    <td>< <= > >= instanceof</td>
    <td>비교 연산자</td>
    <td>→</td>
  </tr>
  <tr>
    <td>7</td>
    <td>== !=</td>
    <td>비교 연산자</td>
    <td>→</td>
  </tr>
  <tr>
    <td>★8</td>
    <td>&</td>
    <td>비트 연산자</td>
    <td>→</td>
  </tr>
  <tr>
    <td>★9</td>
    <td>^</td>
    <td>비트 연산자</td>
    <td>→</td>
  </tr>
  <tr>
    <td>10</td>
    <td>|</td>
    <td>비트 연산자</td>
    <td>→</td>
  </tr>
  <tr>
    <td>★11</td>
    <td>&&</td>
    <td>논리 연산자</td>
    <td>→</td>
  </tr>
  <tr>
    <td>★12</td>
    <td>||</td>
    <td>논리 연산자</td>
    <td>→</td>
  </tr>
  <tr>
    <td>13</td>
    <td>?:</td>
    <td>조건 삼향 연산자</td>
    <td>→</td>
  </tr>
  <tr>
    <td>★14</td>
    <td>= += -= *= /= %= &= ^= |= <<= >>=</td>
    <td>대입 연산자</td>
    <td>←</td>
  </tr>
</table>

