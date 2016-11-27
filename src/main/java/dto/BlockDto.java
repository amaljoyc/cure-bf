package dto;

public class BlockDto {

	private String name;
	private Integer sortOrder;
	private FlowDto flow;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public FlowDto getFlow() {
		return flow;
	}

	public void setFlow(FlowDto flow) {
		this.flow = flow;
	}
	
	
}
