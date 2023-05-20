import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainClass {
	public static void main(String[] args) {
//		String a = "hello";
//		
//		System.out.println(a.hashCode());
//		System.out.println(a);
//		a.trim();
//		System.out.println(a);
//		
//		StringBuffer b = new StringBuffer(a);
//		b.append("1");
//		b.append("2");
//		b.append("3");
//		System.out.println(b);
//		b.reverse();
//		System.out.println(b);
//		
//		String c = b.toString();
//		

		LocalDate date = LocalDate.of(2023, 06, 15);
		System.out.println(date);
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL, Locale.KOREAN));

		Calendar cal = Calendar.getInstance();

		cal.set(2023, 5, 15);// 6월 이지만 월은 -1해줘야 해당 월 인식(0부터 시작하기 때문)

		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));

		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = "2023-06-15";
		try {
			Date date2 = sdf.parse(strDate);
			calendar.setTime(date2);
			System.out.println(calendar.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}

		LocalDateTime time1 = LocalDateTime.of(2023, 6, 15, 15, 17, 3);
		LocalDateTime time2 = LocalDateTime.of(2023, 5, 9, 10, 13, 15);
		
		System.out.println("시작일 : " + time1.toLocalDate());
		System.out.println("종료일 : "+ time2.toLocalDate());
		
		Period diff = Period.between(time1.toLocalDate(), time2.toLocalDate());
		
		System.out.printf("두 날짜 사이 기간: %d년 %d월 %d일",
		          diff.getYears(), diff.getMonths(), diff.getDays());
		
	}
}
