package projectdavid;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a test score: ");
		int testscore = scanner.nextInt();
		
        int ascii;
         if (testscore >= 90) {
        	 ascii = 65;
         }
         else {
        	 ascii = 74 - (testscore / 10);
        	 if (ascii > 68)
        	 ascii = 70;
        
        }
        
        char letter = (char) ascii;

        String grade = "" + letter;


        int lastDigit = testscore % 10;
        
        
        if (letter != 'F') {

            if (letter == 'A') {
                if (testscore >= 93) {
                    grade = "A";
                } else {
                    grade = "A-";
                }
            }
            else {
                if (lastDigit >= 7) {
                    grade += "+";
                }
                else if (lastDigit <= 2) {
                    grade += "-";
                }
            }
        }

        System.out.println("Grade = " + grade);
		
		   
	    }
	}
        



