# AOP
- Aspect Oriented Programming (관점 지향 프로그래밍)
- 관점? 개발자의 공통의 관심사
- 핵심기능과 공통 기능을 분리해 주는 패턴을 만들어 줌으로써 공통 기능이 추가된 핵심 기능을 대신 수행

바닐라 라떼는 커피가 맞나? 맞다! 커피 원액이 들어가 있으므로

커피 + 우유 + 바닐라 향 

커피 : 핵심 기능 
우유 + 바닐라 : 공통 기능
-> 데코레이터 패턴

## 프록시
- 데코레이터 패턴
- proxy : 대신하다, 대리하다
- 개발자의 공통 관심사를 대신 해주는 패턴 (공통 기능)
- 핵심 기능을 대신 수행주는 부분을 강조해서 스프링쪽에는 관례적으로 프록시를 데코레이터 패턴과 혼용해서 사용

참고) JDBC API를 이용한 SQL 실행 한다

DB 연결 작업 // 공통 기능

SQL 실행 코드  // 핵심 기능

DB 연결 해제, 자원 해제 // 공통 기능

BufferedInputStream : InputStream + 버퍼 기능
- InputStream : 핵심 기능 대신 수행 / read()
- 버퍼 : 공통 기능 추가
```java 
class BufferedInputStream extends InputStream {
    
    private InputStream in;
    
    public BufferedInputStream(InputStream in) {
        this.in = in;
    }
    
    public int read() {
        
        // 버퍼라는 추가 공통 기능  코드 ...
        
        int bytes = in.read(); // BufferedInputStream이 직접 수행하는것 아니라 다른 InputStream의 read() 메서드를 대신 수행 // 핵심기능
        
        
        // 버퍼라는 추가 공통 기능 코드 ...
        
        return bytes;
    }

}
```
- 데코레이터 패턴 

참고) 프록시 패턴
- 방화벽 
- 데코레이터 패턴과 차이점은 통제의 역할을 하는 부분이 있는 경우
### 자바 표준 프록시
- java.lang.reflect.Proxy 
- InvocationHandler 인터페이스 : 데코레이터 패턴을 구현할 클래스에는 이 인터페이스를 구현하면 된다. 
- 자바 표준 프록시는 인터페이스 기반의 프록시

참고)
- 팩토리얼 연산 
- !5 -> 5 * 4 * 3 * 2 * 1
### 스프링에서는?
