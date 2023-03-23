import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weizhenqiang
 * @date 2023/3/21 10:04
 */
public class JdkSEtest {
    @Test
    public void test01(){
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add(i);
        }

        list.forEach((var i)->{
            System.out.println(i);
            System.out.println(i.TYPE);
            String convert = String.valueOf(i);
            System.out.println("convert"+convert);
        });

    }
}
