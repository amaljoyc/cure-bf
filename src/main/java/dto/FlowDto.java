package dto;

import java.util.List;

public class FlowDto {

	private String name;
	private Long firstPageId;
	private List<PageDto> pages;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getFirstPageId() {
		return firstPageId;
	}
	public void setFirstPageId(Long firstPageId) {
		this.firstPageId = firstPageId;
	}
	public List<PageDto> getPages() {
		return pages;
	}
	public void setPages(List<PageDto> pages) {
		this.pages = pages;
	}
}
