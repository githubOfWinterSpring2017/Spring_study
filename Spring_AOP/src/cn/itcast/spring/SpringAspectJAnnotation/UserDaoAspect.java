package cn.itcast.spring.SpringAspectJAnnotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 增强的代码，使用注解的方式
 * @author Administrator
 *
 */
//定义一个切面
@Aspect
public class UserDaoAspect {

	//定义一个前置通知
	@Before("execution(* cn.itcast.spring.SpringAspectJAnnotation.UserDao.add(..))")
	public void before(){
		System.out.println("前置增强");
		
	}
}
