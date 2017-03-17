package cn.celloud.day02;

public class Client {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		System.out.println("存储1,4,12,44,65,223,98");
		stack.push(1);
		stack.push(4);
		stack.push(12);
		stack.push(44);
		stack.push(65);
		stack.push(223);
		stack.push(98);
		System.out.println("现在个数是："+stack.size());
		System.out.println("现在的栈顶值是: "+stack.top());
		System.out.println("执行3次移除操作");
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println("现在个数是："+stack.size());
		System.out.println("现在的栈顶值是: "+stack.top());
		System.out.println("存储88,77,66");
		stack.push(88);
		stack.push(77);
		stack.push(66);
		System.out.println("现在个数是："+stack.size());
		System.out.println("现在的栈顶值是: "+stack.top());
		System.out.println("执行6次移除操作");
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println("现在个数是："+stack.size());
		System.out.println("现在的栈顶值是: "+stack.top());
		System.out.println("执行1次移除操作");
		stack.pop();
		System.out.println("现在个数是："+stack.size());
		System.out.println("现在的栈顶值是: "+stack.top());
		System.out.println("存储151");
		stack.push(151);
		System.out.println("现在个数是："+stack.size());
		System.out.println("现在的栈顶值是: "+stack.top());
		System.out.println("执行1次移除操作");
		stack.pop();
		System.out.println("现在个数是："+stack.size());
		System.out.println("现在的栈顶值是: "+stack.top());
	}
}
