package ie.cit.tutjpamvc.entity;

import java.io.File;

public class Upload {

	public Upload() {
		// TODO Auto-generated constructor stub
	}

	private long id;
	private String content;
	private File file;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
}
