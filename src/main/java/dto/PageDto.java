package dto;

import java.util.List;

public class PageDto {
	
	private Long id;
	private String name;
	private String state;
	private String view;
	private Long previousPageId;
	private List<Long> nextPageIds;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getView() {
		return view;
	}
	public void setView(String view) {
		this.view = view;
	}
	public Long getPreviousPageId() {
		return previousPageId;
	}
	public void setPreviousPageId(Long previousPageId) {
		this.previousPageId = previousPageId;
	}
	public List<Long> getNextPageIds() {
		return nextPageIds;
	}
	public void setNextPageIds(List<Long> nextPageIds) {
		this.nextPageIds = nextPageIds;
	}
}
