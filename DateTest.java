import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date;
		System.out.println(new Date());//�������ǰʱ��
        try {
			System.out.println(InetAddress.getLocalHost().getHostAddress());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
        System.out.println(df.format(new Date()));// new Date()Ϊ��ȡ��ǰϵͳʱ��
        
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.get(Calendar.HOUR));
        
        SimpleDateFormat df1 = new SimpleDateFormat("HH:mm");//�������ڸ�ʽ
        System.out.println(df1.format(new Date()));// new Date()Ϊ��ȡ��ǰϵͳʱ��

	}

}
