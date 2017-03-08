package cn.celloud.day01;

import java.util.ArrayList;
import java.util.Queue;

/**
 * 通过list来实现队列。
 * 队列除了普通的方法外，还添加一个新的方法，
 * 	display（输出队列内的所有元素，但任何元素不出队列。）
 * 普通方法如下：
 * 	push（从队尾进队列）、
 * 	pop（从队头出队列）、
 *  front（访问队首元素，不出队列）、
 *  size（查看当前元素个数）
 * @author Administrator
 *
 */
public class MyQueue1 extends MyQueue {
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	/**
	 * 从队尾进队列
	 */
	@Override
	public void push(int i) {
		list.add(i);
	}
	
	/**
	 * 从队头出队列
	 */
	@Override
	public int pop() {
		Integer i = list.remove(0);
		return i;
	}
	
	/**
	 * 访问队首元素，不出队列
	 */
	@Override
	public int front() {
		Integer i = list.get(0);
		return i;
	}
	
	/**
	 * 查看当前元素个数
	 */
	@Override
	public int size() {
		return list.size();
	}
	
	/**
	 * 输出队列内的所有元素，但任何元素不出队列
	 */
	@Override
	void display() {
		for (Integer i : list) {
			System.out.print(i+"\t");
		}
	}
}
