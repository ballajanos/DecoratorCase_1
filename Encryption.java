package case1;

public class Encryption implements DataSource {
	private DataSource datasource;

	@Override
	public String read(String filePath) {
		String encryptedContent=datasource.read(filePath);
		return encryptedContent;
	}

	@Override
	public void write(String filePath, String content) {
		String encryptedContent=encryptContent(content);
		datasource.write(filePath, encryptedContent);
	}

	private String encryptContent(String content) {
		return content;
	}
}
