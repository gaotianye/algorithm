package cn.celloud.day02;

import java.util.ArrayList;
import java.util.List;

/**
 * 请实现combine函数，利用这个函数合并两个链表，得到一个新的链表
 * 两个链表的值是升序
 * 如：a = 1->2->3->4 和 b = 2->3->5 合并为 c = 1->2->3->4->5
 * 
 * 弊端：应该是可以优化的
 * @author Administrator
 *
 */
public class MyTest {
	
	static List<Integer> combine(List<Integer> list1,List<Integer> list2){
		int size1 = list1.size();
		int size2 = list2.size();
		int last1 = list1.size();
		int last2 = list2.size();
		int temp1 = 0;
		int temp2 = 0;
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		int i1 = 0;
		int i2 = 0;
		while(!(last1==temp1 || last2==temp2)){
			i1 = list1.get(temp1);
			i2 = list2.get(temp2);
			if(i1>i2){
				list3.add(i2);
				temp2++;
				size2--;
			}else if(i1<i2){
				list3.add(i1);
				temp1++;
				size1--;
			}else if(i1==i2 && temp1<temp2){
				list3.add(i2);
				temp1++;
				temp2++;
				size2--;
				size1--;
			}else{
				list3.add(i1);
				temp1++;
				temp2++;
				size1--;
				size2--;
			}
		}
		if(size1==1){
			for(;temp2<last2;temp2++){
				list3.add(list2.get(temp2));
			}
		}else{
			for(;temp1<last1;temp1++){
				list3.add(list1.get(temp1));
			}
		}
		return list3;
	}
	
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(8);
		list1.add(9);
		list1.add(15);
		list1.add(21);
		list1.add(33);
		ArrayList list2 = new ArrayList();
		list2.add(2);
		list2.add(3);
		list2.add(8);
		list2.add(9);
		list2.add(18);
		List<Integer> combine = combine(list1,list2);
		System.out.println(combine.toString());
	}
}
