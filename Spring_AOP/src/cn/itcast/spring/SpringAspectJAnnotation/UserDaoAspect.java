package cn.itcast.spring.SpringAspectJAnnotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * ��ǿ�Ĵ��룬ʹ��ע��ķ�ʽ
 * @author Administrator
 *
 */
//����һ������
@Aspect
public class UserDaoAspect {

	//����һ��ǰ��֪ͨ
	@Before("execution(* cn.itcast.spring.SpringAspectJAnnotation.UserDao.add(..))")
	public void before(){
		System.out.println("ǰ����ǿ");
		
	}
}
