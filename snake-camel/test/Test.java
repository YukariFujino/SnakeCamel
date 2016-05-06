import snakecamel.SnakeCamelUtil;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class Test {

	@org.junit.Test
	public void testSC() {
		SnakeCamelUtil util=new SnakeCamelUtil();
		String scCase= util.snakeToCamelcase("hello_world");
		String expected="HelloWorld";
		assertThat(scCase,is(expected));
	}
	@org.junit.Test
	public void testCS() {
		SnakeCamelUtil util=new SnakeCamelUtil();
		String csCase= util.camelToSnakecase("GoodBye");
		String expected="good_bye";
		assertThat(csCase,is(expected));
	}


}
