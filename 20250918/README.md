JDBC(Java DataBase Connectivity) API
- 자바의 데이터베이스 연결 기술의 설계 명세서
- 데이터베이스 프로그램을 제공하는 업체가 다양하다(mysql, oracle, mssql, postgresql ...)
    - 각 프로그램을 제공하는 업체들이 각기 다른 명세로 개발하게 된다면? 각각 사용 방법 다르다..
        - 다른 명세라면 각 이용하는 프로그램 종류마다 다르게 또 개발을 해야 되는 번거로움
- 자바에서 데이터베이스 기술을 구현한다면 표준적인 틀을 제공(동일한 클래스 체계, 동일 메서드 체계 따를 수 있게 강제)
- 표준에 대한 강제 수단은 인터페이스의 추상 메서드를 이용
- 각 구현은 데이터베이스 프로그램을 제공하는 업체에서 표준에 맞게 라이브러리를 개발!

- Mysql Driver, Oracle Driver -> Java의 JDBC API 구현체


- DriverManager  : 접속할떄마다 연결 매번하는 연결객체 
- DataSource 인터페이스 : 커넥션 풀 / 커넥션 풀을 구현때의 가이드라인
  (스프링 부트는 기본적으로 DataSource 인터페이스의 구현체인 HikariCP를 기본 사용하고 있음)
- 

API(Application Programming Interface)
    - Interface : 설계 명세서, 가이드라인 
    - 애프리케이션을 프로그래밍할때의 지켜야할 명세


JPA(Java/Jakarta Persistence API)
- ORM 표준 명세 / JAVA EE / Jakarta EE 
- ORM(Object Relational Mapping) : 객체간의 관계 매핑
- 객체간의 관계를 명시만 해도 SQL로 자동 번역 실행 
- SQL로 실행된 데이터베이스의 결과 -> 객체간의 관계 형태로 번역
- ORM의 구현도 표준대로 해서 구현하는 업체가 달라도 동일한 동작을 기대할 수 있게 표준적인 가이드라인을 제공 
- 인터페이스로 주로 정의 

EntityManager
EntityManagerFactory 

- 구현체 : Hibernate, EclipseLink, OpenJpa ...
- JDBC 필요 
