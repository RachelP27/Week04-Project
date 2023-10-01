package Week04;


import java.util.Arrays;

public class classProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//array of ints called ages. The array of moreAges is a test to check accurate iteration.
System.out.println("-----------ages array------------------");
int[] ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93};

System.out.println(ages[ages.length-1] - ages[0]);

//finding the average of the array ages.  Sum is like a bucket for all the int within
//the array to fall into and get added together.  The total within sum is then 
//divided by the length of the array. 
int sum = 0;
for(int i = 0; i < ages.length; i++) {
sum += ages[i];
}System.out.println(sum / ages.length);

//moreAges array
int[] moreAges = new int[] {3, 9, 23, 64, 2, 8, 28, 93, 100};
System.out.println(moreAges[moreAges.length-1] - ages[0]);

System.out.println("---------names array--------------------");
//String array of names.  The first iteration prints out the length of characters in each name.
String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
for(String name : names) {
	System.out.println(name.length());
}

//This print line prints out each name as requested.  The string builder below also prints out
//each name, but both of them show the names encased in square brackets. 
StringBuilder sb = new StringBuilder();
for(int i = 0; i < names.length; i++) {
	if(i != names.length - 1) {
	
	sb.append(names[i] + ", ");
	}
	else { 
		sb.append(names[i]);	
	}
}

System.out.println(sb);

//to access the last element of an array you subtract one from the length of the array, 
//because indexes start at 0, but the length is 1 more.  The first element is always index 0.
//int sum1 = 0;
//for(int i = 0; i < names.length; i++) {
//	sum1 += names[i];
//}
System.out.println("-----------conversion of names array to namelengths array-------------");



int[] namesLength = new int [names.length];
for(int i = 0; i < namesLength.length; i++) {
	
namesLength[i] = names[i].length();
}
System.out.println(Arrays.toString(namesLength));// to print each element in array Arrays.toString(namesLength

System.out.println("----------------");
int x = 0;
for(int i = 0; i < namesLength.length; i++) {
	x += namesLength[i];
	
}
System.out.println(x);
//int x = 0;
//for(int num : namesLength) {
//	
//x += num;
//System.out.println(x);
//}




System.out.println("-----------using my methods----------------");

String str = multiplyWord("candy", 3);
System.out.println(str);

System.out.println("---------------------------------");

System.out.println(makeTheName("Rachel", "Payne"));

System.out.println("----------------------------------");

System.out.println(addTheNumbers(ages));
	
System.out.println("----------------------------------");
//finding greater average between two double arrays
double[] week1Temperatures = new double [] {72.0, 79.0, 75.0, 80.0, 84.0, 80.0, 77.0}; 
double[] week2Temperatures = new double [] {85.0, 96.0, 90.0, 79.0, 89.0, 93.0, 75.0};
System.out.println(greaterAverageTemperature(week1Temperatures, week2Temperatures));	
System.out.println("----------------------------------");	

//finding out if it is hot enough and if we have enough money to buy a drink
int tempOutside = 80;
boolean isHot = false;
	if(tempOutside > 70) {
		isHot = true;	
		}
	
System.out.println("the answer is: " + (willBuyDrink(isHot, 11.00)));
System.out.println("-----------------------------------------------");

//money enough for groceries? 
double paycheck = 50.00;
String[] groceryItems = new String[] {"milk", "bread", "cheese", "chicken"};
double[] prices = new double[] {2.99, 1.50, 7.89, 6.33};

System.out.println(enoughMoneyForGroceries(paycheck, prices));



	
	
	}//end of main
//return concatenated word int number of times	
public static String multiplyWord(String word, int n) {
	StringBuilder sb = new StringBuilder();
	for(int i = 0; i < n; i++) {
		sb.append(word);
	} 
	return sb.toString();
}
//return full name
public static String makeTheName(String firstName, String lastName) {
	StringBuilder name = new StringBuilder(firstName);
	name.append(" " + lastName);
	return name.toString();
}
//returning true if sum of ints in array is greater than 100
public static boolean addTheNumbers(int[] array) {
	int sum = 0;
	for(int i = 0; i < array.length; i++) {
		sum += array[i];
	}//end of for loop
//		int max = 100;
//		boolean isItGreater = sum > max;
		
	
	//end of if statement
	return sum > 100;		
}//end of method

//returning greater value of arrays
public static boolean greaterAverageTemperature(double[] array1, double[] array2) {
	double sum = 0.0;
	double sum2 = 0.0;
	
	for(double temp : array1) {
		sum += temp/array1.length;
		for(double temptemp : array2) {
			sum2 += temptemp/array2.length;
		}
	}
	return sum > sum2;	
}

public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
boolean weWillBuyDrink = false;
	if(isHotOutside && moneyInPocket > 10.50) {
		weWillBuyDrink = true;
	}
	return weWillBuyDrink;	
	
}

//my own method
public static boolean enoughMoneyForGroceries(double moneyIn, double[] priceArray) {
	boolean doWeHaveEnoughMoney = true;
//	StringBuilder sb = new StringBuilder();
//	for(int i = 0; i < foodArray.length; i++) {
//		sb.append(" " + foodArray[i] + ": " + priceArray[i]);
//	}
	double sum = 0.0;
	for(int i = 0; i < priceArray.length; i++) {
	sum += priceArray[i];
	
	if(sum > moneyIn) {
		doWeHaveEnoughMoney = false;
		}
} 
	return doWeHaveEnoughMoney;

}//end of method





//int totalDaysInYear = 365;
//String[] months = new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}; 
//int[] days = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

//public static int daysUntilBirthday(String date, int number, String[] month, int[] day) {
//	
//}
	
	
		



}//end of class
