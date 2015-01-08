//外部类
public class HelloWorld {
    
    // 外部类中的静态变量score
    private static int score = 84;
    
    // 创建静态内部类
	public static class SInner {
        // 内部类中的变量score
        int score = 91;
        
		public void show() {
			System.out.println("访问外部类中的score：" + HelloWorld.score);
			System.out.println("访问内部类中的score：" + score);
		}
	}

	// 测试静态内部类
	public static void main(String[] args) {
		// 直接创建内部类的对象
        //创建静态内部类的对象时，不需要外部类的对象，可以直接创建 内部类 对象名= new 内部类();
        SInner si = new SInner();
        
        // 调用show方法
		si.show();
	}
}
