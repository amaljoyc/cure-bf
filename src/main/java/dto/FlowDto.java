package dto;

import java.util.List;

public class FlowDto {

	private String name;
	private String type;
	private Long firstPageId;
	private Long currentPageId;
	private List<PageDto> pages;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getFirstPageId() {
		return firstPageId;
	}

	public void setFirstPageId(Long firstPageId) {
		this.firstPageId = firstPageId;
	}

	public Long getCurrentPageId() {
		return currentPageId;
	}

	public void setCurrentPageId(Long currentPageId) {
		this.currentPageId = currentPageId;
	}

	public List<PageDto> getPages() {
		return pages;
	}

	public void setPages(List<PageDto> pages) {
		this.pages = pages;
	}
}
