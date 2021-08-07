package test;

public class Thread2 extends MainApplication implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Numbers divisible by 5 are");
		for (int i = 0; i<numbers.length; i++) {
			if(numbers[i]%5==0) {
				System.out.println(numbers[i]);
			}
			
		}
	}

}
