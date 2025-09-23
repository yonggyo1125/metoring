package org.sparta.solid.ocp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Mallad {

    private final Quackable quackable; // 의존성
    private final Sleepable sleepable; // 의존성

    public void func() { // 기능이 정상적으로 동작하라면 quickable, sleepable의 기능이 필요!! 의존성
        quackable.quack();
        // 영향에 대한 대안적인 조치 코드 ....

        sleepable.sleep();
    }
}
