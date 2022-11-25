package Earth;

import org.testng.annotations.Test;

public class Avengers {
	@Test(groups = "smoke")
	public void E1() {
		System.out.println("Thanos");
	}

	@Test(groups = "regression")
	public void E2() {
		
		System.out.println("Loki");
	}
}
