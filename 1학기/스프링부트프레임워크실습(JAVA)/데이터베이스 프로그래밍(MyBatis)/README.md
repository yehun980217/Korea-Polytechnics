<h1>오류 내용</h1>
<ul>
  <li>ORA-17056 : 지원되지 않는 문자 집합(클래스 경로에 orai18n.jar 추가)</li>
  <p>DB에 데이터는 들어가는 데 select 시 해당 오류가 발생하였는 데 이 오류는 말 그대로 orai18n.jar을 추가해주면 된다.<br>
  프로젝트에 직접 넣어도되고 pom.xml 안 dependency로 추가해줘도 된다.<br>
  https://mvnrepository.com/artifact/com.oracle.database.nls/orai18n/19.3.0.0</p>
  <li>ORA-00911: 문자가 부적합합니다</li>
  <p>오류 안내 위에 문제가 되는 쿼리문을 알려준다.<br>
  <code>SQL: select user_id, user_name, email, addr from student where user_id = ?;</code><br>
  해당 쿼리문에서 오류가 나타난건데 쿼리문 뒤에 세미콜론(;)이 붙어서 오류가 발생한 것이다.</p>
</ul>
