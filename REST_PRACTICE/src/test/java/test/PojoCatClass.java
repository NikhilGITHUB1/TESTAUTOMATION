package test;

import java.util.List;

public class PojoCatClass {
	
	private int id;
	private String name;
	private String status;
	private List<String> photoUrls;
	private Category category;
	private List<Tags> tags;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<String> getPhotoUrls() {
		return photoUrls;
	}
	public void setPhotoUrls(List<String> photoUrls) {
		this.photoUrls = photoUrls;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public List<Tags> getTags() {
		return tags;
	}
	public void setTags(List<Tags> tags) {
		this.tags = tags;
	}

}
