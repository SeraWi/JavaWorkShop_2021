package myJava0526;

import java.util.Calendar;

public class CalendarEx2 {
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년"+(date.get(Calendar.MONTH)+1)
				+"월"+date.get(Calendar.DATE)+"일";
	}
	public static void main(String[] args) {
		//요일은 1부터 시작하기 때문에 ,  DAY_OF_WEEK[0]은 비워두었다
		final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		//month의 경우 0부터 시작하기 때문에 8월인 경우, 7로 지정해야 한다. 
		// date1.ser(2015,Calendar.AUGUST,15);와 같이 할 수도 있다.
		date1.set(1995,5,4);
		System.out.println("date1은"+toString(date1)+
				DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] 
						+"요일입니다.");
		System.out.println("date2은"+toString(date2)+
				DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] 
						+"요일입니다.");
		
		//두 날짜간의 차이를 구하기
		long difference = (date2.getTimeInMillis()-date1.getTimeInMillis())/1000;
		System.out.println("그날(date1)로부터 지금(date2)까지"+difference+"초 가 지났습니다.");
		System.out.println("일로 계산되면"+difference/(24*60*60)+"일입니다.");
	}

}
