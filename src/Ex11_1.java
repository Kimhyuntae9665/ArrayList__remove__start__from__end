import java.util.ArrayList;
import java.util.Collections;


public class Ex11_1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);//크기가 10인 list생성
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1,4));
		print(list1,list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1,list2);
		
		System.out.println("list1.containsAllist2:"+list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3,"A");
		print(list1,list2);
		
		list2.set(3, "AA");
		print(list1,list2);
		
		System.out.println("list1.retainAll(list2):"+list1.retainAll(list2));
		
		print(list1,list2);
		
		for(int i=list2.size()-1;i>=0;i--) { //효율성을 위해서 뒤에서 부터 remove 
			if(list1.contains(list2.get(i)))//앞에서 부터 지우면 요소들을 복사 너무 많이 해야
				list2.remove(i); //수정본2 업데이트 루트를 위한 확인차
		}//원래처럼 commit들어가면 그만 
		
		print(list1,list2);
		
		
		
	}
	
	static void print(ArrayList list1,ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();
	}

}
