package com.amaljoyc.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "block")
public class Block {
	
	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "name")
	private String name;

	@Column(name = "sort_order")
	private Integer sortOrder;

	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="block")
    private List<Flow> flows;

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

	public Integer getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public List<Flow> getFlows() {
		return flows;
	}

	public void setFlows(List<Flow> flows) {
		this.flows = flows;
	}

}