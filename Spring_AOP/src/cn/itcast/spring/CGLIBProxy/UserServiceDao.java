package cn.itcast.spring.CGLIBProxy;

/**
 * 目标类：目标类实现了接口
 * @author Administrator
 *
 */
public class UserServiceDao  {

	public void add() {
		System.out.println("执行添加用户的操作.....");
	}

	public void delete() {
		System.out.println("执行删除用户的操作");
	}

}
