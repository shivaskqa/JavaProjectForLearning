package com.org.sbms;

public class Solution {

	public static void main(String[] argv) {
		//int[] log_1 = { -100, -150, -20, -50, -20, 100, 1050, -100, -1100 };
		//int[] log_2 = {-500, 100, 900, -1100, -100, 1200, -1300, 1400};
		//int[] log_3 = {750, -540, 460, -180, 320, -830, 10, -260, -460, -900, 710, 500, -860, 580, -40};
		//int[] log_8 = {10, -50, -500, -20, -70, 660, -220, -510, 940, -340};
		//System.out.println(alerts(300, 100, 1000, log_1));
		//System.out.println(alerts( 500,    0, 1000, log_2));
		int[] log_7 = {-330, 130, 430, 520, 570};
		System.out.println(alerts( 940,  800, 1100, log_7));
	}

	public static int alerts(int initial_inventory, int low_inventoryalert_amount, int high_inventory_alert_amountint,
			int[] log) {
		int alertCount = 0;
		int tempInventory, lflagCount = 0, hflagCount = 0;
		boolean lflag, hflag;

		for (int i = 0; i < log.length; i++) {
			tempInventory = initial_inventory + log[i];
			System.out.println(tempInventory);
			
			if (tempInventory <= low_inventoryalert_amount && tempInventory>0) {
				

				lflag = true;
				if (lflag && lflagCount == 0) {
					System.out.println("Alert");
					lflagCount += 1;
					alertCount += 1;
				}
			} else if (tempInventory >= high_inventory_alert_amountint) {

				
				hflag = true;
				if (hflag && hflagCount == 0) {
					System.out.println("Alert");
					hflagCount += 1;
					lflag=false;
					alertCount += 1;
				}
				
			} else if (tempInventory < 0) {
				System.out.println("Alert");
				alertCount += 1;
			}

			initial_inventory = tempInventory;
		}

		return alertCount;
	}
}
