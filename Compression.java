package case1;

public class Compression implements DataSource {
	private DataSource datasource;
	
	@Override
	public String read(String filePath) {
		String compressedContent=datasource.read(filePath);
		return compressedContent;
	}

	@Override
	public void write(String filePath, String content) {
		String compressedContent=compressContent(content);
		datasource.write(filePath, compressedContent);

	}

	private String compressContent(String content) {
		return content;
	}

}
