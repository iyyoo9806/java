import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateCalendar {
	public static void main(String[] args) {
//		LocalDate now = LocalDate.now();
//		System.out.println(now);

//		SimpleDateFormat sdf1 = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
//		SimpleDateFormat sdf1 = new SimpleDateFormat("E"); 요일
//		String nowTime1 = sdf1.format(new Date());
//		System.out.println(nowTime1);
		//특정 날짜의 년,월,일,요일 확인하기,문자열을 Date/Calendar로 변환하기 -> 문자열을 캘린더 객체로?
		String date1 = "2020-12-30 01:30";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		try {
			Date date = sdf2.parse(date1);
			System.out.println(date);
			SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd E");
			System.out.println(sdf3.format(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		//특정 월의 마지막 날짜 구하기
//		GregorianCalendar g = (GregorianCalendar) GregorianCalendar.getInstance();
//		g.set(2023, 4,9);
//		System.out.println(g.getActualMaximum(GregorianCalendar.DAY_OF_MONTH));
		
		//날짜들 시간 차이 구하기
		Date now = new Date();
		System.out.println(now.getTime()/1000/60/60/24/365);
	}
}
