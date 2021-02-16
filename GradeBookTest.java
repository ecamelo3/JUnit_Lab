import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	GradeBook g1;
	GradeBook g2;
	
	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g1.addScore(98);
		g1.addScore(49);
		g1.addScore(54);
		g1.addScore(79.7);
		
		g2 = new GradeBook(5);
		g2.addScore(0);
		g2.addScore(34.5);

	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	public void testSum() {
		assertEquals(280.7, g1.sum());
		assertEquals(34.5, g2.sum());
	}
	
	@Test
	public void testMinimum() {
		assertEquals(49, g1.minimum());
		assertEquals(0, g2.minimum());
	}
	
	@Test
	public void addScoreTest() {
		String gs1 = "98.0 49.0 54.0 79.7 0.0 ";
		String gs2 = "0.0 34.5 0.0 0.0 0.0 ";
		assertEquals(4, g1.getScoreSize());
		assertEquals(2, g2.getScoreSize());
		
		assertEquals(gs1, g1.toString());
		assertEquals(gs2, g2.toString());
	}
	
	@Test
	public void finalScoreTest() {
		assertEquals(231.7, g1.finalScore());
		assertEquals(34.5, g2.finalScore());
	}
}
