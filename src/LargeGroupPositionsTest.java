import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * created by IDEA
 *
 * @author: jinze
 * @Date: 18-5-8
 * @Time: 下午5:41
 */
public class LargeGroupPositionsTest {

    @Test
    public void largeGroupPositions() {

        List<List<Integer>> result=new ArrayList<>();
        ArrayList<Integer> oneItem=new ArrayList<>();
        oneItem.add(3);oneItem.add(6);
        result.add(oneItem);
        assertEquals(result,new LargeGroupPositions().largeGroupPositions("abbxxxxzzy"));
    }
}