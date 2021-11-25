import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BMICalculatorTest {
    public BMICalculator bmi1;
    public BMICalculator bmi2;
    public BMICalculator bmi3;

    @BeforeEach
    void setUp() {
        BMICalculator bmi1 = new BMICalculator("Max", "Mustermann", 180, 80, 'm');
        BMICalculator bmi2 = new BMICalculator("Susi", "Sorglos", 174, 52, 'w');
        BMICalculator bmi3 = new BMICalculator("Tom", "Tränenreich", 202, 114, 'm');

    }

    @Test
    void calculateBMI() {
        assertEquals(24.69, bmi1.calculateBMI());
        assertEquals(17.18, bmi2.calculateBMI());
        assertEquals(27.94, bmi3.calculateBMI());
    }

    @Test
    void calculateBMICategory() {
        assertEquals(0, bmi1.calculateBMICategory());
        assertEquals(-1, bmi2.calculateBMICategory());;
        assertEquals(1, bmi3.calculateBMICategory());
    }

    @Test
    void getBMICategoryName() {
        assertEquals("Normalgewicht", bmi1.getBMICategoryName());
        assertEquals("Untergewicht", bmi2.getBMICategoryName());
        assertEquals("Übergewicht", bmi3.getBMICategoryName());
    }
}
