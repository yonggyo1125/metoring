package org.sparta;

import org.junit.jupiter.api.Test;
import org.sparta.config.AppCtx;
import org.sparta.solid.ocp.Mallad;
import org.sparta.solid.ocp.RobotDuck;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex02 {
    @Test
    void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Mallad mallad = ctx.getBean(Mallad.class);
        mallad.func();

        RobotDuck robotDuck = ctx.getBean(RobotDuck.class);
        robotDuck.func();
    }
}
