package tw.edu.ntut.csie.app01_105590011;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by NTUTCSIE on 2018/4/25.
 */

public class LetterGradeTest {
    private LetterGrade LG;

    @Before public void setUp(){
        LG = new LetterGrade();
    }

    @After
    public void tearDown(){
        LG = null;
    }
    @Test
    public void testLetterGrade(){
        assertEquals("X",LG.lettergrade(-30));
        assertEquals("X",LG.lettergrade(3320));
        assertEquals("F",LG.lettergrade(37));
        assertEquals("D",LG.lettergrade(62));
        assertEquals("C",LG.lettergrade(73));
        assertEquals("B",LG.lettergrade(82));
        assertEquals("A",LG.lettergrade(98));

    }
}
