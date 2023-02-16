import java.util.Calendar;
import java.util.Scanner;

//test
//さらにテストーーー

public class Cal_study {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        int the_last_day = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int weekday = calendar.get(Calendar.DAY_OF_WEEK)-1;
        int day = 0;
        System.out.println(" 日 月 火　水 木 金　土");
        for(int w = 0; w < 6; w++){
            for(int d = 0; d < 7; d++){
                if(day == 0 && weekday == d || day > 0 && day < the_last_day){
                    int x = ++day;
                    if(x < 10){
                        System.out.print(" " + x);
                    }else{
                        System.out.print(x);
                    }
                }else{
                    System.out.print("  ");
                }
                if(d != 6){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
