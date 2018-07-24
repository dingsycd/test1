package suanfa;
/**
 * 单例模式
 * @author DD
 *
 */
public class Singleton {
	//私有的构造器
	private Singleton(){}
	//静态私有对象
	 static private Singleton instance =new Singleton();
	//静态的公有函数
	 public static Singleton getInstance() {
			return instance;
		}
	 public static void setInstance(Singleton instance) {
			Singleton.instance = instance;
		}
}
