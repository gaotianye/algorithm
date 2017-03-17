package cn.celloud.day02;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
/**
 * 用2个队列实现栈
 * 说明：基本功能已经实现
 * 缺点：
 * 	1、队列采用的是ArrayBlockingQueue，必须提前指定个数
 * 	2、不是线程安全的
 * 	3、应该还是可以优化的
 * @author Administrator
 *
 */
public class MyStack {
	// 存储倒数第二个值
	private Object temp = null;
	
	//存储top值
	private Object top = null;
	
	private ArrayBlockingQueue<Object> queue1 = new ArrayBlockingQueue<Object>(1000);
	private ArrayBlockingQueue<Object> queue2 = new ArrayBlockingQueue<Object>(1000);
	
	/**
	 * 存储
	 * @param obj
	 */
	public void push(Object obj){
		//判断queue1中是否已经有内容，如果有，则继续push，如果没有，则往另外一个queue中push
		if(queue1.size()>0){
			add(queue1,obj);
		}else{
			add(queue2,obj);
		}
	}
	//push真正执行的是add
	private void add(Queue queue,Object obj){
		//往队列中add
		queue.add(obj);
		//top对象赋当前传的值
		top = obj;
	}
	
	/**
	 * 移除
	 */
	public void pop(){
		if(queue1.size()>0){
			remove(queue1,queue2);
		}else if(queue2.size()>0){
			remove(queue2,queue1);
		}
	}
	
	//真正执行移除的操作
	private void remove(Queue queue1,Queue queue2){
		//首先判断队列中有多少值，至少为1
		int size = size();
		for(int i = 0;i < size-1;i++){
			//从一个队列中将值移除
			Object remove = queue1.remove();
			//将前面队列移除的值，放入另一个队列中
			queue2.add(remove);
			//将移除的值赋值给temp
			temp = remove;
		}
		queue1.remove();
		top = temp;
	}
	
	/**
	 * 获取栈顶值
	 * @return
	 */
	public Object top(){
		if(size()!=0){
			return top;
		}
		return "xxxxxx";
	}
	
	/**
	 * 获取stack个数
	 * @return
	 */
	public int size(){
		if(queue1.size()>0){
			return queue1.size();
		}
		return queue2.size();
	}
}
