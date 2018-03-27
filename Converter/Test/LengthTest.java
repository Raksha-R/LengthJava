import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {
    @Test
    public void twelveInchesIsEqualToOneFoot() {
        assertEquals(new Length(1, Unit.FOOT), new Length(12, Unit.INCH));
    }

    @Test
    public void twentyFourInchIsEqualToTwoFoot() {
        assertEquals(new Length(2, Unit.FOOT), new Length(24, Unit.INCH));
    }

    @Test
    public void oneInchIsEqualToOneInch() {
        assertEquals(new Length(1, Unit.INCH), new Length(1, Unit.INCH));
    }

    @Test
    public void thirtySixInchIsEqualToThreeFoot() {
        assertEquals(new Length(36, Unit.INCH), new Length(3, Unit.FOOT));
    }

    @Test
    public void oneYardIsEqualToThreeFoot() {
        assertEquals(new Length(1, Unit.YARD), new Length(3, Unit.FOOT));
    }

    @Test
    public void oneYardIsEqualToThirtySixInch() {
        assertEquals(new Length(1, Unit.YARD), new Length(36, Unit.INCH));
    }

    @Test
    public void threeFootIsEqualToOneYard() {
        assertEquals(new Length(3, Unit.FOOT), new Length(1, Unit.YARD));
    }

    @Test
    public void threeFootIsEqualToThirtySixInch() {
        assertEquals(new Length(3, Unit.FOOT), new Length(36, Unit.INCH));
    }

    @Test
    public void twoInchPlusTwoInchIsEqualToFourInch(){
        assertEquals(new Length(4, Unit.INCH), new Length(2, Unit.INCH).add(new Length(2, Unit.INCH)));
    }

    @Test
    public void twoFootPlusTwelveInchIsEqualToThreeFoot(){
        assertEquals(new Length(3, Unit.FOOT), new Length(2, Unit.FOOT).add(new Length(12, Unit.INCH)));
    }


}