package com.amaljoyc.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "page")
public class Page {
	
	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "view")
	private String view;

	@Column(name = "previous_page_id")
	private Long previousPageId;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="flow_id")
    private Flow flow;
	
	@ManyToMany
	@JoinTable(name = "next_pages",
    joinColumns = @JoinColumn(name = "page_id"),
    inverseJoinColumns = @JoinColumn(name = "next_page_id"))
	private List<Page> nextPages;

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

	public Flow getFlow() {
		return flow;
	}

	public void setFlow(Flow flow) {
		this.flow = flow;
	}

	public List<Page> getNextPages() {
		return nextPages;
	}

	public void setNextPages(List<Page> nextPages) {
		this.nextPages = nextPages;
	}
    
}