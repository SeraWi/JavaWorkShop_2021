package myjava0516;

public class HSKscoreCounting {

	public static void main(String[] args) {
		
		String[] correctAnswer = {"D","B","D","C","C","D","A","E","A","D"};
		
		String[][] student = new String[5][10];
		student[0]= new String[]{"A","B","A","C","C","D","E","F","A","D"};
		student[1]= new String[]{"D","B","A","B","C","A","E","F","A","D"};
		student[2]= new String[]{"E","D","D","A","C","B","E","E","A","D"};
		student[3]= new String[]{"C","B","A","E","D","D","E","F","A","D"};
		student[4]= new String[]{"A","B","D","C","C","D","E","E","A","D"};
		
		
		for(int j =0; j <student.length ; j++) {
			int score = 0;
			for( int i = 0 ; i< correctAnswer.length; i++) {
				if( student[j][i]== correctAnswer[i] ) {
					score++;
				}
			}
			System.out.printf("The Student [%d]'s Score is %d \n",j+1,score);
		}
	}

}
