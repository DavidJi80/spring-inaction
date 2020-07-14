package net.tongark.spring.aop.annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Poet {
    // 定义切点（切入位置）
    @Pointcut("execution(* net.tongark.spring.aop.annotation.CrusadesSoldier.embarkOnQuest(..))")
    private void embark(){}

    @Before(value = "embark()")
    void composeBeforeQuest(){
        System.out.println("Poet record : the knight is so brave!");
    }

    @After(value = "embark()")
    void composeAfterQuest(){
        System.out.println("Poet record : the knight did embark on a quest!");
    }
}