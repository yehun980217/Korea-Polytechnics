<h1>실습 내용</h1>
<ul>
  <li>Tesseract 업로드 된 이미지 파일의 문자를 인식</li>
  <li>Komoran 인공지능 기술 중 자연어 처리 기술 사용</li>
</ul>
<h1>실습 환경</h1>
<ul>
  <li>개발 도구</li>
  <p>인텔리J</p>
  <li>사용 프레임워크</li>
  <p>Spring Boot Frameworks</p>
  <p>Lombok <br><code>@어노테이션을 활용하여 코드를 쉽고 간결하게 작성</code></p>
  <p>Tesseract <br><code>인공지능 플랫폼으로 OCR에 최적화된 기술</code></p>
  <p>Komoran <br><code>자바 기반 인공지능 기술 중 자연어 처리 기술</code></p>
</ul>
<h1>자바 및 스프링 프레임워크 버전</h1>
<ul>
  <li>자바 17</li>
  <li>Spring Boot</li>
  <p>Spring Boot 3.x 버전으로 실습</p>
</ul>
<h1>문자열 인식-DTO</h1>
<ul>
  <li>DTO(Data Transfer Object) 데이터 전달 객체?</li>
  <p>자바 함수에 정보를 전달 및 전달받기 위한 목적으로 만드는 객체</p>
  <li>왜 사용하는가?</li>
  <p>많은 변수들을 객체에 정의하여 한번에 전달 가능<br><code>전달할 변수가 증가되어도 함수병 변경X</code></p>
  <p>전달하는 데이터 명확화 <br><code>데이터 전달 시 어떤 데이터가 전달되는 지 이해하기 쉬움</code></p>
  <p>Spring Frameworks 및 자바 기반 시스템에 사용함</p>
</ul>
<h1>문자열 인식-Service</h1>
<ul>
  <li>Spring Boot Frameworks는 중요 핵심 로직을 작성하는 영역을 Service로 정의함</li>
  <p>Service 영역은 핵심 로직만 작성</p>
  <li>Service 사용 방법</li>
  <p>Class명 위에 @Service 어노테이션 추가함<br><code>@Service 어노테이션이 붙은 자바 파일은 자동으로 메모리에 올림</code></p>
  <li>Service 특징</li>
  <p>Spring Boot Frameworks는 실행될 때 <Strong>@Service 정의된 자바 클래스들을 메모리에 올리며, 메모리 관리를 Spring Boot Frameworks가 수행</Strong>함<br><code>따라서 Service는 메모리 관리를 개발자가 하지 않음</code></p>
  <li>Service 구조</li>
  <p>인터페이스와 그 인터페이스를 구현한 자바로 구성</p>
  <code>public class <strong>OcrService</strong>(자바) implements <strong>IOcrServce</strong>(인터페이스)</code>
  <li>참고 사항</li>
  <p>메모리는 싱글톤 패턴으로 올라감</p>
</ul>
