import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Days {
    public static void main(String[] args) {
        int dt1[]={10,2,2000};
        int dt2[]={10,2,2000};
        if(dt1.length!=3||dt2.length!=3){
            System.out.println("Invalid array");
        }
        String s1=convertToDate(dt1);
        String s2=convertToDate(dt2);
        System.out.println(s1 +"\n"+s2);
        int days=findDays(s1,s2);
        System.out.println("Days : "+days);
    }

    private static int findDays(String s1, String s2) {
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime localDateTime1= LocalDate.parse(s1,formatter).atStartOfDay();
        LocalDateTime localDateTime2=LocalDate.parse(s2,formatter).atStartOfDay();

        long days= java.time.Duration.between(localDateTime1,localDateTime2).toDays();
        return (int)days;
    }

    private static String convertToDate(int[] dt1) {
        String ans = "";
        for (int i = 0; i < dt1.length; i++) {
            if (dt1[i] < 10) {
                ans += "0" + dt1[i] + "-";
            }
        else if (dt1[i] > 9 && dt1[i] < 99) {
            ans += dt1[i] + "-";
        } else {
            ans += dt1[i];
        }
    }
        return ans;
    }
    }
