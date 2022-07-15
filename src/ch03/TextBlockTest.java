package ch03;

public class TextBlockTest {
	public static void main(String[] args) {
		//14이상 업버전 지원
		String textBlocks = """
				Hello,
				hi,
				how ru """;
		System.out.println(textBlocks);
		System.out.println(getBlockOfHtml());
	}
	
	public static String getBlockOfHtml() {
	return """
			<html>
				<body>
				<span>example text</span>
			</html>""";
	}
}
