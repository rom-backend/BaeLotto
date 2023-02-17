package BaeLotto;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;

public class BaeLottoTest {

    @Test
    public void 숫자_중복체크_성공() {
        //given
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(43));
        int num = 43;

        //when
        boolean result = BaeLotto.duplicateCheckNum(integers, num);

        //then
        assertEquals(result, true);
    }

    @Test
    public void 숫자_중복체크_실패() {
        //given
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(43));
        int num = 41;

        //when
        boolean result = BaeLotto.duplicateCheckNum(integers, num);

        //then
        assertEquals(result, false);
    }

}