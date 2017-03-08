package cn.celloud.day01;


public class Client {
	public static void main(String[] args) {
		MyQueue1 queue = new MyQueue1();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.push(4);
		queue.push(5);
		System.out.println("依次push 1,2,3,4,5");
		int p1 = queue.pop();
		int p2 = queue.pop();
		int p3 = queue.pop();
		System.out.println("pop3次，依次取出的顺序是："+p1+","+p2+","+p3);
		System.out.println("接着依次push 6,7,8,9,10");
		queue.push(6);
		queue.push(7);
		queue.push(8);
		queue.push(9);
		queue.push(10);
		int size = queue.size();
		System.out.println("获取总数: "+size);
		int front = queue.front();
		System.out.println("现在排在第一个的是："+front);
		size = queue.size();
		System.out.println("获取总数: "+size);
		System.out.println("输出队列内的所有元素....");
		queue.display();
		size = queue.size();
		System.out.println();
		System.out.println("获取总数: "+size);
	}
}
