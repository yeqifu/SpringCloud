import java.time.ZonedDateTime;

/**
 * @Author: 落亦-
 * @Date: 2020/8/9 7:59
 */
public class T2 {
    public static void main(String[] args) {
        //默认时区
        ZonedDateTime zbj = ZonedDateTime.now();
        System.out.println(zbj);
        //2020-08-09T08:01:04.232+08:00[Asia/Shanghai]
    }
}
