import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PythagoreanTripletTest {

    @Test
    public void tripletsWhoseSumIs12() {
        List<PythagoreanTriplet> actual
                = PythagoreanTriplet
                        .getTripletListBuilder()
                        .thatSumTo(12)
                        .buildTriplets();
        List<PythagoreanTriplet> expected
                = Collections.singletonList(new PythagoreanTriplet(3, 4, 5));
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void tripletsWhoseSumIs108() {
        List<PythagoreanTriplet> actual
                = PythagoreanTriplet
                        .getTripletListBuilder()
                        .thatSumTo(108)
                        .buildTriplets();
        List<PythagoreanTriplet> expected
                = Collections.singletonList(new PythagoreanTriplet(27, 36, 45));
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void tripletsWhoseSumIs1000() {
        List<PythagoreanTriplet> actual
                = PythagoreanTriplet
                        .getTripletListBuilder()
                        .withFactorsLessThanOrEqualTo(1000)
                        .thatSumTo(1000)
                        .buildTriplets();
        List<PythagoreanTriplet> expected
                = Collections.singletonList(new PythagoreanTriplet(200, 375, 425));
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void tripletsWhoseSumIs1001() {
        List<PythagoreanTriplet> actual
                = PythagoreanTriplet
                        .getTripletListBuilder()
                        .thatSumTo(1001)
                        .buildTriplets();
        List<PythagoreanTriplet> expected = Collections.emptyList();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void tripletsWhoseSumIs90() {
        List<PythagoreanTriplet> actual
                = PythagoreanTriplet
                        .getTripletListBuilder()
                        .thatSumTo(90)
                        .buildTriplets();
        List<PythagoreanTriplet> expected
                = Arrays.asList(
                        new PythagoreanTriplet(9, 40, 41),
                        new PythagoreanTriplet(15, 36, 39));
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void tripletsWhoseSumIs840() {
        List<PythagoreanTriplet> actual
                = PythagoreanTriplet
                        .getTripletListBuilder()
                        .thatSumTo(840)
                        .buildTriplets();
        List<PythagoreanTriplet> expected
                = Arrays.asList(
                        new PythagoreanTriplet(40, 399, 401),
                        new PythagoreanTriplet(56, 390, 394),
                        new PythagoreanTriplet(105, 360, 375),
                        new PythagoreanTriplet(120, 350, 370),
                        new PythagoreanTriplet(140, 336, 364),
                        new PythagoreanTriplet(168, 315, 357),
                        new PythagoreanTriplet(210, 280, 350),
                        new PythagoreanTriplet(240, 252, 348));
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void tripletsWhoseSumIs840WithFactorsLessThanOrEqualTo370() {
        List<PythagoreanTriplet> actual
                = PythagoreanTriplet
                        .getTripletListBuilder()
                        .withFactorsLessThanOrEqualTo(370)
                        .thatSumTo(840)
                        .buildTriplets();
        List<PythagoreanTriplet> expected
                = Arrays.asList(
                        new PythagoreanTriplet(120, 350, 370),
                        new PythagoreanTriplet(140, 336, 364),
                        new PythagoreanTriplet(168, 315, 357),
                        new PythagoreanTriplet(210, 280, 350),
                        new PythagoreanTriplet(240, 252, 348));
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void tripletsWhoseSumIs30000() {
        List<PythagoreanTriplet> actual
                = PythagoreanTriplet
                        .getTripletListBuilder()
                        .thatSumTo(30000)
                        .buildTriplets();
        List<PythagoreanTriplet> expected
                = Arrays.asList(
                        new PythagoreanTriplet(1200, 14375, 14425),
                        new PythagoreanTriplet(1875, 14000, 14125),
                        new PythagoreanTriplet(5000, 12000, 13000),
                        new PythagoreanTriplet(6000, 11250, 12750),
                        new PythagoreanTriplet(7500, 10000, 12500));
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void tripletsWhoseSumIs30000WithFactorsLessThanOrEqualTo12500() {
        List<PythagoreanTriplet> actual
                = PythagoreanTriplet
                        .getTripletListBuilder()
                        .withFactorsLessThanOrEqualTo(12500)
                        .thatSumTo(30000)
                        .buildTriplets();
        List<PythagoreanTriplet> expected
                = Arrays.asList(new PythagoreanTriplet(7500, 10000, 12500));
        assertThat(actual).isEqualTo(expected);
    }
}
