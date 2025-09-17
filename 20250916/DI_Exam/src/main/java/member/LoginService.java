package member;

public class LoginService {

    private LoginValidator validator;
    private MemberRepository repository;

    public void setValidator(LoginValidator validator) {
        this.validator = validator;
    }

    public void setRepository(MemberRepository repository) {
        this.repository = repository;
    }

    // 로그인 처리
    public void process(LoginRequestDto requestDto) {
        // 입력된 데이터를 검증하는 역할의 객체
        validator.check(requestDto);

        // 로그인 유지 처리 - DB에서 회원 정보를 조회할 필요!
        repository.findByEmail(requestDto.getEmail());

        System.out.println("로그인 성공");
    }
}
