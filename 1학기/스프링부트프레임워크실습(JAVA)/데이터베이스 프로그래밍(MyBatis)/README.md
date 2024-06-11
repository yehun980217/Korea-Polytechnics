<h1>오류 내용</h1>
<ul>
  <li>ORA-17056 : 지원되지 않는 문자 집합(클래스 경로에 orai18n.jar 추가)</li>
  <p>DB에 데이터는 들어가는 데 select 시 해당 오류가 발생하였는 데 이 오류는 말 그대로 orai18n.jar을 추가해주면 된다.<br>
  프로젝트에 직접 넣어도되고 pom.xml 안 dependency로 추가해줘도 된다.<br>
  https://mvnrepository.com/artifact/com.oracle.database.nls/orai18n/19.3.0.0</p>
</ul>
