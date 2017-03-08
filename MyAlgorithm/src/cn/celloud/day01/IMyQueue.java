package cn.celloud.day01;

public interface IMyQueue {
	/**
	 * 从队尾进队列
	 * @param i
	 */
	void push(int i);
	
	/**
	 * 从队头出队列
	 * @return
	 */
	int pop();
	
	/**
	 * 访问队首元素，不出队列
	 * @return
	 */
	int front();
	
	/**
	 * 查看当前元素个数
	 * @return
	 */
	int size();
}
