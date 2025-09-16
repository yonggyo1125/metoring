# 커맨드 객체 검증 및 예외 처리
- Spring Web Mvc 프레임워크
- 요청(사용자가 목적에 맞는 데이터 함께 전송)  -> 요청에대한 데이터가 올바른지 검증 -> 처리 ->  응답
- 요청 데이터 검증 
1) Bean Validation API -> 이미 정의된 애노테이션으로 요청 데이터를 1차적으로 검증
   @NotBlank
    @Size
    @Positive, @Negative, @Email ... 
    @Valid : 검증대상이되는 커맨드 객체라고 알려주는 애노테이션
    - 사용자 요청에 대한 검증이 실패한 경우 
    - Errors/BindResult  -> hasErrors -> true : 검증에 성공했는지 실패했는지 여부
      - getter 위주의 메서드 : 문제가 있으면 해결이 목적! 도대체 어디가 문제인지를 알수 있어야 하기떄문에 문제에 대한 정보 확인 메서드가 주
      - getGlobalError.... : 전역 검증 실패 메세지에 대한 정보
      - getFieldError.... : 각 필드(email, password) 별 검증 실패 메세지에 대한 정보
2) Validator 인터페이스를 구현해서 추가 검증
    - Validator 인터페이스 추가 구현
    - Errors / BindResult  - 검증 실패에 대한 정보가 담겨 있는 객체
      - reject("에러코드", ...) : 전역 검증 실패 처리 
      - rejectValue("필드명", "에러코드", ...) : 필드 검증 실패 처리
       --> hasErrors 메서드를 true로 변경해 버림
      
3) 예외를 적절하게 던져서 처리 
@ExceptionHandler
   - 커맨드 객체에서의 예외출력 형식과 
   - 일반 예외객체 던져졌을때 출력 형식이 다를 수 있는 경우
   - 예외별로 다른 출력 또는 다른 응답 코드를 내보내야하는 경우
    .. 
     - 발생한 예외 객체를 매개변수로 주입 / 문제 해결을 위한 정보 제공
    - 컨트롤러에 정의하면 해당 컨트롤러 내에서만 적용
    - 다른 컨트롤러에도 공통적인 형식으로 적용하고 싶은 경우?
      - @RestControllerAdvice 
      - @ControllerAdvice
      
    - @...ControllerAdvice : 컨트롤러 요청 처리전 공통 처리 
        - 공통 예외 출력 처리(@ExceptionHandler ...)
        - 공통으로 유지될 속성값(@ModelAttribute ..)
      - 인터셉터와는 다르다..

- 요청, 응답 테스트 
```
curl -X 요청 메서드 -h 요청 헤더 -d 요청 바디쪽에 데이터 주소 

curl -X POST -h "Content-Type: application/json" -d '{"email": "user01@test.org", "password": "1234"}' http://localhost:8080/member/login
```



@Autowired : 의존성 자동 주입 
    - 멤버 변수 위, 
    - setter 메서드 위에 : 연관관계 
    - 연관관계 측면 : required - false: 의존성 없어도 돼!

생성자 매개변수로 의존성을 주입 : 의존 관계 


객체 지향 설계 5대원칙 
SOLID
S - SRP(Single Resposibility Priciple) : 단일 책임원칙

참고) 애노테이션 : 기능 X, 정보전달 수단 

HandlerMapping 
HandlerAdapter
    -> 처리중 한가지: 사용자의 요청 입력 데이터의 검증 처리
    -> 검증 실패에 대한 정보 (Errors ...)
    
ViewResolver
...

ResponseEntity 
    - 응답에 대한 자세한 정보 설정(setter, builder 패턴 ..) / 조회(getter ...) 
    - 응답 헤더 
    - 응답 바디
