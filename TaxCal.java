import java.util.*;
public class TaxCal{
    public final static void clearConsole() {
		try {
		final String os = System.getProperty("os.name");
		if (os.contains("Windows")) {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} else {
		System.out.print("\033[H\033[2J");
		System.out.flush();
		}
		} catch (final Exception e) {
		e.printStackTrace();
		// Handle any exceptions.
		}
	}

	public static void homePage(){
        System.out.println("-----------------------------------------------------");
		System.out.println("|             TAX CALCULATOR                        |");
		System.out.println("-----------------------------------------------------");
        System.out.println("[01] Withholding Tax");
		System.out.println("[02] Payable Tax");
		System.out.println("[03] Income Tax");
		System.out.println("[04] Social Security Contribution Levey (SSCL) Tax");
		System.out.println("[05] Leasing Payment");
		System.out.println("[06] Exit");
    }

	public static void withholdingTexHomePage(){
		System.out.println("-----------------------------------------------------");
		System.out.println("|             WITHHODING TAX                        |");
		System.out.println("-----------------------------------------------------");
        System.out.println("[01] Rent Tax");
		System.out.println("[02] Bank Interest Tax");
		System.out.println("[03] Dividend Tax");
		System.out.println("[04] Exit");

	}

	public static void rentTaxPrint(){
		System.out.println("-----------------------------------------------------");
		System.out.println("|                   RENT TAX                        |");
		System.out.println("-----------------------------------------------------");
	}

	public static String rentTax(int rent){

		if( rent > 0 && rent <= 100000){
			return "          You don't have to pay rent tax"; 
		}else if( rent > 0 && rent > 100000){
			return "           You have to pay Rent Tax :" + ( (rent-100000) * 0.10);
		}else{
			return "            Invalid input...";	
		}
	}

	public static void bankInterestTaxPrint(){
		System.out.println("-----------------------------------------------------");
		System.out.println("|               BANK INTEREST TAX                   |");
		System.out.println("-----------------------------------------------------");
	}

	public static String bankInterestTax(int bInterest){
		if( bInterest > 0){
			return "           You have to pay Bank Interest Tax per year :" + ( bInterest * 0.05);
		}else{
			return "            Invalid input...";
		}
	}

	public static void dividedTaxPrint(){
		System.out.println("-----------------------------------------------------");
		System.out.println("|                  DIVIDED TAX                      |");
		System.out.println("-----------------------------------------------------");
	}

	public static String dividentTax(int dividend){
		if( dividend > 0 && dividend <= 100000){
			return "          You don't have to pay Dividend Tax"; 
		}else if( dividend > 0 && dividend > 100000){
			return "           You have to pay Dividend Tax : " + ( (dividend-100000) * 0.14);
		}else{
			return "            Invalid input...";	
		}
	}

	public static void payableTaxPrint(){
		System.out.println("-----------------------------------------------------");
		System.out.println("|                  PAYABLE TAX                      |");
		System.out.println("-----------------------------------------------------");
	}

	public static double payableTax(int ePayment){
		double tax = 0;

		if (ePayment > 100000) {
			double taxableAmount = ePayment - 100000;
			if (taxableAmount <= 41667) {
				tax = taxableAmount * 0.06;
			} else if (taxableAmount <= 83333) {
				tax = Math.floor((41667 * 0.06) + ((taxableAmount - 41667) * 0.12));
			} else if (taxableAmount <= 125000) {
				tax = Math.floor((41667 * 0.06) + (41667 * 0.12) + ((taxableAmount - 83333) * 0.18));
			} else if (taxableAmount <= 166667) {
				tax = Math.floor((41667 * 0.06) + (41667 * 0.12) + (41667 * 0.18) + ((taxableAmount - 125000) * 0.24));
			} else if (taxableAmount <= 208333) {
				tax = Math.floor((41667 * 0.06) + (41667 * 0.12) + (41667 * 0.18) + (41667 * 0.24) + ((taxableAmount - 166667) * 0.30));
			} else {
				tax = Math.floor((41667 * 0.06) + (41667 * 0.12) + (41667 * 0.18) + (41667 * 0.24) + (41667 * 0.30) + ((taxableAmount - 208333) * 0.36));
			}
		}else{
			tax = 0;
		}
		return tax;
	}

	public static void incomeTaxPrint(){
		System.out.println("-----------------------------------------------------");
		System.out.println("|                  INCOME TAX                       |");
		System.out.println("-----------------------------------------------------");
	}

	public static double incomeTax(double income){
		double tax = 0;

		if (income > 1200000) {
			double taxableAmount = income - 1200000;
			if (taxableAmount <= 500000) {
				tax = taxableAmount * 0.06;
			} else if (taxableAmount <= 500000*2) {
				tax = Math.floor((500000 * 0.06) + ((taxableAmount - 500000) * 0.12));
			} else if (taxableAmount <= 500000*3) {
				tax = Math.floor((500000 * 0.06) + (500000 * 0.12) + ((taxableAmount - 500000*2) * 0.18));
			} else if (taxableAmount <= 500000*4) {
				tax = Math.floor((500000 * 0.06) + (500000 * 0.12) + (500000 * 0.18) + ((taxableAmount - 500000*3) * 0.24));
			} else if (taxableAmount <= 500000*5) {
				tax = Math.floor((500000 * 0.06) + (500000 * 0.12) + (500000 * 0.18) + (500000 * 0.24) + ((taxableAmount - 500000*4) * 0.30));
			} else {
				tax = Math.floor((500000 * 0.06) + (500000 * 0.12) + (500000 * 0.18) + (500000 * 0.24) + (500000 * 0.30) + ((taxableAmount - 500000*5) * 0.36));
			}
		}else{
			//Itax = 0;
		}
		return tax;
	}

	public static void ssclTaxPrint(){
		System.out.println("-----------------------------------------------------");
		System.out.println("|   SOCIETY SECURITY CONTRIBUTION LENY (SSCL) TAX   |");
		System.out.println("-----------------------------------------------------");
	}

	public static double ssclTax(int gValue){
		double step1 = gValue*0.025;
		double s=gValue + step1;
		double step2 = s * 0.15;
		return step1 + step2;
	}

	public static void leasingPaymentPrint(){
		System.out.println("-----------------------------------------------------");
		System.out.println("|                  LEASING PAYMENT                  |");
		System.out.println("-----------------------------------------------------");
		System.out.println("[01] Calculate Monthly Installemnt");
		System.out.println("[02] Search Leasing Category");
		System.out.println("[03] Find Leasing Amount");
		System.out.println("[04] Exit");
	}
	
	public static void calLeasingPaymentPrint(){
		System.out.println("-----------------------------------------------------");
		System.out.println("|             CALCULATE LEASING PAYMENT             |");
		System.out.println("-----------------------------------------------------");
	}

	public static String calLeasingPayment(double leaseAmount, double interest, int year){
		double i = interest/1200;
		int n=year*12;
		double answer = (leaseAmount*i)/(1-Math.pow((1+i), -n));
		if(leaseAmount >= 0){
			if(interest >= 0){
				return "Your monthly instalment   : " + answer ;
			}else{
				return "Invalid interest rate";
			}
		}else{
			return "Invalid interest rate";
		}
	}

	public static void searchLeasingCategoryPrint(){
		System.out.println("-----------------------------------------------------");
		System.out.println("|             SEARCH LEASING CATEGORY               |");
		System.out.println("-----------------------------------------------------");
	}

	public static String searchLeasingCategoryThreeYears(double leaseA, double inter){
		double i = inter/1200;
		int year = 0;
		int n=3*12;
		double answer = (leaseA*i)/(1-Math.pow((1+i), -n));
		if(leaseA >= 0){
			if(inter >= 0){
				return "Your monthly instalment for 3 year leasing plan  - " + answer ;
			}else{
				return "Invalid interest rate";
			}
		}else{
			return "Invalid interest rate";
		}
	}

	public static String searchLeasingCategoryFourYears(double leaseA, double inter){
		double i = inter/1200;
		int year = 0;
		int n=4*12;
		double answer = (leaseA*i)/(1-Math.pow((1+i), -n));
		if(leaseA >= 0){
			if(inter >= 0){
				return "Your monthly instalment for 3 year leasing plan  - " + answer ;
			}else{
				return "Invalid interest rate";
			}
		}else{
			return "Invalid interest rate";
		}
	}

	public static String searchLeasingCategoryFiveYears(double leaseA, double inter){
		double i = inter/1200;
		int year = 0;
		int n=5*12;
		double answer = (leaseA*i)/(1-Math.pow((1+i), -n));
		if(leaseA >= 0){
			if(inter >= 0){
				return "Your monthly instalment for 3 year leasing plan  - " + answer ;
			}else{
				return "Invalid interest rate";
			}
		}else{
			return "Invalid interest rate";
		}
	}

	public static void findLeasingAmountPrint(){
		System.out.println("-----------------------------------------------------");
		System.out.println("|             FIND LEASING AMOUNT                   |");
		System.out.println("-----------------------------------------------------");
	}

	public static String findLeasingAmount(double leaseMonthly, int y, double iRate){
		double i = iRate/1200;
		int n=y*12;
		double A = (leaseMonthly * (1-Math.pow((1+i), -n))) / i;
		if(iRate > 0){
			if(y <= 5){
				return "Your monthly instalment                              : " + A ;
			}else{
				return "Invalid number of year";
			}
		}else{
			return "Invalid interest rate";
		}
	}



    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
		String i = "";

		//Home Page
		L5:do{
			homePage();
			System.out.print("Enter an option to continue -> ");
			int option = input.nextInt();
			
			clearConsole();
	
			switch(option){
			case 1:
			//(01)withholding Tax
			L1:do{
				withholdingTexHomePage();
				System.out.print("Enter an option to continue -> ");
				option = input.nextInt();
				clearConsole();
	
	
					switch(option){
	
						//[01]Rent Tax
						case 1:
						rentTaxPrint();
						System.out.print("Enter your rent         : ");
						int rent = input.nextInt();
						L2:do{
							System.out.println(rentTax(rent));
							System.out.print("Do you want to enter another Rent Tax (Y/N) : ");
							i = input.next();
		
							if(i.equalsIgnoreCase("Y")){
								clearConsole();
								continue L1;
							}else if(i.equalsIgnoreCase("N")){
								clearConsole();
								break;
							}else{
								continue L2;
							}
						}while(true);
	
						//[02]Bank Interest Tax
						case 2:
						L3:do{
							bankInterestTaxPrint();
							System.out.print("Enter your bank interest per year      : ");
							int bInterest = input.nextInt();
							System.out.println(bankInterestTax(bInterest));
	
							System.out.print("Do you want to enter another Bank Interest Tax (Y/N) : ");
							i = input.next();
							
							if(i.equalsIgnoreCase("Y")){
								clearConsole();
								continue L3;
							}else if(i.equalsIgnoreCase("N")){
								clearConsole();
								break;
							}
						}while(true);
	
						//[03]Divided Tax
						case 3:
							L4: do{dividedTaxPrint();
							System.out.print("Enter your total dividend per year      : ");
							int dividend = input.nextInt();
							System.out.println(dividentTax(dividend));
							
							System.out.print("Do you want to enter another Dividend Tax (Y/N): ");
							i = input.next();
	
							if(i.equalsIgnoreCase("Y")){
								clearConsole();
								continue L4;
							}else if(i.equalsIgnoreCase("N")){
								clearConsole();
								break;
							}
							
							}while(true);
	
							//[04]Exit
							case 4: 
								continue L5;
					}
				}while(true);
			
				//(02)Payable Tax
				case 2:
				L6: do{
					payableTaxPrint();
					System.out.print("Enter your employee payment per month    : ");
					int ePayment = input.nextInt();
					System.out.println("You have to pay Payable Tax per month " + payableTax(ePayment));
					
					System.out.print("Do you want to enter another Dividend Tax (Y/N): ");
					i = input.next();

					if(i.equalsIgnoreCase("Y")){
						clearConsole();
						continue L6;
					}else if(i.equalsIgnoreCase("N")){
						clearConsole();
						break;
					}
				}while(true);

				//(03)Income Tax
				case 3:
				L7:do{
					incomeTaxPrint();
					System.out.print("Enter your total income per year    : ");
					double income = input.nextDouble();
					System.out.println("You have to pay Income Tax per year " + incomeTax(income));
						
					System.out.print("Do you want to enter another Dividend Tax (Y/N): ");
					i = input.next();
	
					if(i.equalsIgnoreCase("Y")){
						clearConsole();
						continue L7;
					}else if(i.equalsIgnoreCase("N")){
						clearConsole();
						break;
					}
				}while(true);

				//(04)SSCL Tax
				case 4:
				L8:do{
					ssclTaxPrint();
					System.out.print("Enter value of GOod or Service    : ");
					int gValue = input.nextInt();
					System.out.println("You have to pay SSCL Tax " + ssclTax(gValue));

					System.out.print("Do you want to calculate another SSCL Tax (Y/N): ");
					i = input.next();
					
					if(i.equalsIgnoreCase("Y")){
						clearConsole();
						continue L8;
					}else if(i.equalsIgnoreCase("N")){
						clearConsole();
						break;
					}
				}while(true);	

				//(05)Leasing Payment
				case 5:
					leasingPaymentPrint();
					System.out.print("Enter an option to continue    : ");
					option = input.nextInt();
					
					clearConsole();
	
						//[01]Calculate Monthely Installement
						switch(option){
						case 1:
							L9:do{
								calLeasingPaymentPrint();
								System.out.print("Enter lease amount    : ");
								double leaseAmount = input.nextDouble();
								System.out.print("Enter annual interest rate    : ");
								double interest = input.nextDouble();
								int years=0;
								L10:do{
									System.out.print("Enter number of years    : ");
									years = input.nextInt();
									if(years>=5){
										System.out.print("Invalid number of year...Enter the correct value againg...");	
										continue L10;
									}else{
										break;
									}
								}while(true);
								System.out.println(calLeasingPayment(leaseAmount, interest, years));
									
								System.out.print("Do you want to calculate another monthly instalment (Y/N): ");
								i = input.next();
								if(i.equalsIgnoreCase("Y")){
									clearConsole();
									continue L9;
								}else if(i.equalsIgnoreCase("N")){
									clearConsole();
									break;
								}
							}while(true);
						
						//[02]Search Leasing Category	
						case 2:
							L10:do{
								searchLeasingCategoryPrint();
								System.out.print("Enter lease amount    : ");
								double leaseA = input.nextDouble();
								System.out.print("Enter annual interest rate    : ");
								double inter = input.nextDouble();
								System.out.println(searchLeasingCategoryThreeYears(leaseA, inter));
								System.out.println(searchLeasingCategoryFourYears(leaseA, inter));
								System.out.println(searchLeasingCategoryFiveYears(leaseA, inter));
	
								System.out.print("Do you want to calculate another monthly instalment (Y/N): ");
								i = input.next();
								if(i.equalsIgnoreCase("Y")){
									clearConsole();
									continue L10;
								}else if(i.equalsIgnoreCase("N")){
									clearConsole();
									break;
								}
							}while(true);

						//[03]Find the Leasing Amount
						case 3:
						L11:do{
							findLeasingAmountPrint();
							System.out.print("Enter monthly lease payment amount you can afford    : ");
							double leaseMonthly = input.nextDouble();
							System.out.print("Enter number of years                                : ");
							int y = input.nextInt();
							System.out.print("Enter annual interest rate                           : ");
							double iRate = input.nextDouble();
							System.out.println(findLeasingAmount(leaseMonthly, y, iRate));

							System.out.print("Do you want to calculate another monthly instalment (Y/N): ");
							i = input.next();
							if(i.equalsIgnoreCase("Y")){
								clearConsole();
								continue L11;
							}else if(i.equalsIgnoreCase("N")){
								clearConsole();
								break;
							}
						}while(true);


						//[04]Exit
						case 4: break;
						}	
				
				//(06)Exit		
				case 6:
				clearConsole();
				break;			
				}
		}while(true);	
	}	
}

