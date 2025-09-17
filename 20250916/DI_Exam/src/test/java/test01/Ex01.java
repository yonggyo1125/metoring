package test01;

import member.*;

public class Ex01 {

    public static void main(String[] args) {
        LoginRequestDto requestDto = new LoginRequestDto();
        requestDto.setEmail("user01@test.org");
        requestDto.setPassword("123456");

        BeanContainer container = new BeanContainer();
        LoginService service = container.loginService();
        service.process(requestDto);

        JoinService service2 = container.joinService();

//        LoginService service = new LoginService();
//        service.setValidator(new LoginValidator());
//        service.setRepository(new UpgradedMemberRepository());
//        service.process(requestDto);
//
//        JoinService joinService = new JoinService();
//        joinService.setRepository(new UpgradedMemberRepository());
//
    }
}
