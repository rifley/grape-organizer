import org.junit.*;
import static org.junit.Assert.*;

public class GrapeTest {

    @Test
    public void Grape_instantiatesCorrectly_true() {
      Grape goodGrape = new Grape("Green");
      assertTrue(goodGrape instanceof Grape);
    }

    @Test
    public void Grape_instantiatesWithDescription_String() {
      Grape goodGrape = new Grape("Green");
      assertEquals("Green", goodGrape.getFlavor());
    }
}
