package test;

public class Thread3 extends MainApplication implements Runnable {
	@Override
	public void run() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("Average: ");
		double total = 0;
		int count=0;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]%5==0) {
				total+=numbers[i];
				count++;
			}
		}
		System.out.print(total/count);
	}

}
