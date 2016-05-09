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

	@org.junit.Test
	public void testCap1() {
		SnakeCamelUtil util=new SnakeCamelUtil();
		String csCase= util.capitalize("a");
		String expected="A";
		assertThat(csCase,is(expected));
	}
	@org.junit.Test
	public void testCap2() {
		SnakeCamelUtil util=new SnakeCamelUtil();
		String csCase= util.capitalize("xyz");
		String expected="Xyz";
		assertThat(csCase,is(expected));
	}
	@org.junit.Test
	public void testunc1() {
		SnakeCamelUtil util=new SnakeCamelUtil();
		String csCase= util.uncapitalize("A");
		String expected="a";
		assertThat(csCase,is(expected));
	}
	@org.junit.Test
	public void testunc2() {
		SnakeCamelUtil util=new SnakeCamelUtil();
		String Case= util.uncapitalize("Xyz");
		String expected="xyz";
		assertThat(Case,is(expected));
	}
	@org.junit.Test
	public void testSC1() {
		SnakeCamelUtil util=new SnakeCamelUtil();
		String Case= util.snakeToCamelcase("abc");
		String expected="Abc";
		assertThat(Case,is(expected));
	}
	@org.junit.Test
	public void testSC2() {
		SnakeCamelUtil util=new SnakeCamelUtil();
		String Case= util.snakeToCamelcase("abc_def");
		String expected="AbcDef";
		assertThat(Case,is(expected));
	}
	@org.junit.Test
	public void testSC3() {
		SnakeCamelUtil util=new SnakeCamelUtil();
		String Case= util.snakeToCamelcase("abc_def_gh");
		String expected="AbcDefGh";
		assertThat(Case,is(expected));
	}
	@org.junit.Test
	public void testSC4() {
		SnakeCamelUtil util=new SnakeCamelUtil();
		String Case= util.snakeToCamelcase("abc__def__gh");
		String expected="AbcDefGh";
		assertThat(Case,is(expected));
	}
	@org.junit.Test
	public void testSC5() {
		SnakeCamelUtil util=new SnakeCamelUtil();
		String Case= util.snakeToCamelcase("_abc_def__");
		String expected="AbcDef";
		assertThat(Case,is(expected));
	}
	@org.junit.Test
	public void testCS1() {
		SnakeCamelUtil util=new SnakeCamelUtil();
		String Case= util.camelToSnakecase("Abc");
		String expected="abc";
		assertThat(Case,is(expected));
	}
	@org.junit.Test
	public void testCS2() {
		SnakeCamelUtil util=new SnakeCamelUtil();
		String Case= util.camelToSnakecase("AbcDef");
		String expected="abc_def";
		assertThat(Case,is(expected));
	}
	@org.junit.Test
	public void testCS3() {
		SnakeCamelUtil util=new SnakeCamelUtil();
		String Case= util.camelToSnakecase("AbcDefGh");
		String expected="abc_def_gh";
		assertThat(Case,is(expected));
	}

}
