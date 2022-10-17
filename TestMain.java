

public class TestMain {

	public static void main(String[] args) {
		Queue que1 = new Queue(5);
		boolean bResult;
		int data;
		
		/*
		bResult=que1.enqueue(11);
		bResult=que1.enqueue(22);
		bResult=que1.enqueue(33);
		bResult=que1.enqueue(44);
		bResult=que1.enqueue(55);
		
		bResult=que1.enqueue(66);//false
		*/
		System.out.print(" 최초 배열 : ");
		que1.enqueue(11);
		que1.enqueue(22);
		que1.enqueue(33);
		que1.enqueue(44);
		//que1.enqueue(55);
		
		//que1.enqueue(66);
		
		

		System.out.print("\n 반환한 값 : ");
		System.out.print(que1.dequeue()+" ");
		System.out.print(que1.dequeue()+" ");
		//System.out.print(que1.dequeue()+" ");
		//System.out.print(que1.dequeue()+" ");
		//System.out.print(que1.dequeue()+" ");
				
		System.out.print("\n 새 데이터 : ");
		que1.enqueue(66);
		que1.enqueue(77);
		que1.enqueue(88);
		//que1.enqueue(99);
		
		que1.print();
	}

}
