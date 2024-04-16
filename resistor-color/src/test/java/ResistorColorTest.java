import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ResistorColorTest {

    private ResistorColor resistorColor;

    @BeforeEach
    public void setup() {
        resistorColor = new ResistorColor();
    }

    @Test
    public void testBlackColorCode() {
        assertThat(resistorColor.getColorCode("black")).isEqualTo(0);
    }

    @Test
    public void testWhiteColorCode() {
        assertThat(resistorColor.getColorCode("white")).isEqualTo(9);
    }


    @Test
    public void testOrangeColorCode() {
        assertThat(resistorColor.getColorCode("orange")).isEqualTo(3);
    }


    @Test
    public void testGetAllColors() {
        assertThat(resistorColor.getAllColors()).containsExactly(
                "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"
        );
    }
}
