package member;

/**
 * 객체를 가지고 있고, 객체의 의존성 주입을 통제하는 클래스
 *
 */
public class BeanContainer {

   public LoginValidator loginValidator() {
       return new LoginValidator();
   }

   public MemberRepository memberRepository() {
       return new UpgradedMemberRepository();
   }

   public LoginService loginService() {
       LoginService service = new LoginService();
       //service.setRepository(memberRepository());
       //service.setValidator(loginValidator());

       return service;
   }

   public JoinService joinService() {
       return new JoinService(memberRepository());
   }
}
