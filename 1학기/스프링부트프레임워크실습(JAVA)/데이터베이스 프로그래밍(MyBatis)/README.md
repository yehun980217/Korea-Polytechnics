<h1>실습 내용</h1>
<ul>
  <li>Oracle의 Student 테이블에 학생 정보 저장하기</li>
  <li>Oracle의 Student 테이블에 학생 정보 수정하기</li>
  <li>Oracle의 Student 테이블에 학생 정보 삭제하기</li>
</ul>
<h1>실습 환경</h1>
<ul>
  <li>개발 도구</li>
  <p>인텔리J</p>
  <li>사용 프레임워크</li>
  <p>Spring Boot Frameworks</p>
  <p>Lombok <br><code>@어노테이션을 활용하여 코드를 쉽고 간결하게 작성</code></p>
  <p>오라클 전용 JDBC<br>자바와 데이터베이스 연동을 위해 사용함</p>
  <p>MyBatis Frameworks<br><code>SQL을 XML에 작성하여 코드의 가독성을 높이고 유지보수가 용이함</code></p>
</ul>
<h1>자바 및 스프링 프레임워크 버전</h1>
<ul>
  <li>자바 17</li>
  <li>Spring Boot</li>
  <p>Spring Boot 3.x 버전으로 실습</p>
</ul>
<h1>MyBatis의 역할</h1>
<ul>
  <li>오라클 데이터베이스 연결</li>
  <p>JDBC 드라이버를 이용하여 개발자들이 별도의 코딩없이 자동으로 DB 접속 및 연결 해제</p>
  <li>SQL을 자바 코드에 분리</li>
  <p>XML 파일에 SQL 작성</p>
</ul>
<h1>MyBatis 설정 정보</h1>
<ul>
  <li>오라클 테이블과 매칭될 DTO 설정 및 카멜식 적용</li>
  <p>select 쿼리 결과를 자동으로 DTO 변수에 매칭함<br>
  <code>매칭 기준은 오라클 테이블의 컬럼 이름과 변수명이 카멜식에 일치</code></p>
  <p>카멜식(Camel Case) : 낙타 모양 글씨 표현 방법<br>
  <code>원문(보통 DB 테이블 칼럼) : user_id</code><br>
  <code>카멜식 : user<strong>I</strong>d</code></p>
  <li>SQL 작성된 XML 파일 위치 설정</li>
  <p>src 폴더는 자바 파일만 존재 가능<br>
  <code>자바 파일이 아닌 파일들은 모두 resource폴더에 존재</code><br>
  <code>mybatis.mapper-locations=classpath:mapper/*.xml (Application.properties파일에 설정한 mapper.xml 위치)</code></p>
</ul>
<h1>개발 구현 순서</h1>
<ul>
  <li>1단계. DTO</li>
  <li>2단계. Mapper 인터페이스 (자바)</li>
  <li>3단계. Mapper XML (쿼리)</li>
  <li>4단계. Service 인터페이스</li>
  <li>5단계. Service 자바</li>
  <li>6단계. Main 자바</li>
</ul>
<h1>@Mapper 어노테이션</h1>
<ul>
  <li>MyBatis 프레임워크에서 제공하는 어노테이션</li>
  <p><code>Spring Boot에서 제공하는 어노테이션 아님</code></p>
  <li>Mapper 역할하는 인터페이스로 정의</li>
  <li>Spring Boot 시작될 때, 자동으로 Mapper XML 파일과 연결하여 메모리에 올림</li>
</ul>
<h1>MyBatis 사용법</h1>
<ul>
  <li>정보 전달 방법</li>
  <p><strong>DTO를 통해 정보 전달하는 것을 권장함</strong><br>
  아이디, 이름과 같이 회원 정보를 오라클 테이블에 저장하기 위해서는 많은 정보를 받아야함<br>
  많은 정보를 한번에 전달하기 위해 DTO 사용함(MyBatis가 권장하는 방법)<br>
  <code>parameterType : 함수의 파라미터 타입 -> DTO 클래스명 이름 사용<br>resultType : 함수의 리턴 타입 -> DTO 클래스명 이름 사용</code></p>
  <li>parameterType 작성법</li>
  <p>DTO에 저장된 값을 SQL 쿼리에 바인딩<br>
  <code>#{DTO변수명}
  <br><strong><주의>SQL인젝션 해킹 공격에 취약하기에 ${DTO변수명}사용하지않음</strong></code></p>
    <li>resultType 작성법</li>
    <p>select 쿼리만 작성함
<br><code>조회 결과가 존재
<br>조회 결과의 레코드 수와 상관없이 무조건 DTO 정의함
<br>조회 결과가 1개 이상 MyBatis가 자동으로 List 형태에 결과 저장하여 전달
<br>insert, update, delete 쿼리는 작성하지 않음</code></p>
</ul>
<h1>Optional 객체? 자바 NULL 처리?</h1>
    <ul>
      <li>모든 프로그래밍 언어의 고민 -> NULL</li>
      <p>예상치 못한 장애 등 문제, 개발자들의 코딩 실수로 인해 메모리에 값이 저장되어야 함에도 불구하고 저장되지않아 NULL 문제가 발생
      <br>NULL 처리를 쉽게 할수 있는 대안으로 자바 1.8부터 지원되는 Optional 객체</p>
      <li>Optional 주요 목적</li>
      <p>NULL 박생할 수 있는 프로그래밍 문법에 적용하여 에러 방지(특히 DB 연동 부분)
        <br>studentMapper.getStudent(pDTO) : select 쿼리 실행
        <br>Student 테이블에 데이터가 존재하지 않으면 select 쿼리 반환값 없음(당연히 NULL값)</p>
      <li>Optional 주요 사용 방법</li>
      <p><code>Optional.ofNullable()</code>함수<br>
      결과가 NULL인지 구분할 때 사용함<br>
      isPresent() : 값의 존재여부 결과 반환<br><br>
      <code>Optional.ofNullable().orElseGet()</code>함수<br>
      함수 실행 결과가 NULL값이면 NULL 대신 Empty(값이 없음)로 처리<br>
      프로그래밍 언어에서 NULL과 Empty는 큰 차이가 있음
      <code>NULL</code> : 메모리에 존재하지 않음(메모리에 없는 데이터 참조 시 무조건 에러, NullPointerException 발생<br>
      <code>Empty</code> : 메모리에 변수는 존재하나 값이 없음</p>
    </ul>
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
