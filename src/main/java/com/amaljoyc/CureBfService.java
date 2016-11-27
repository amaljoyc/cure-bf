package com.amaljoyc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amaljoyc.models.Block;
import com.amaljoyc.models.Flow;
import com.amaljoyc.models.Page;
import com.amaljoyc.repos.BlockRepo;
import com.amaljoyc.repos.FlowRepo;
import com.amaljoyc.repos.PageRepo;

import dto.FlowDto;
import dto.PageDto;

@Service
public class CureBfService {
	
	@Autowired
	private BlockRepo blockRepo;
	
	@Autowired
	private FlowRepo flowRepo;
	
	@Autowired
	private PageRepo pageRepo;
	
	public List<ApiResponse> buildResponseList() {
		List<ApiResponse> responseList = new ArrayList();
		List<Block> blocks = blockRepo.findAll();
		for (Block block : blocks) {
			ApiResponse response = new ApiResponse();
			String blockName = block.getName();
			response.setBlock(blockName);
			List<Flow> flows = block.getFlows();
			
			if(flows.size() == 1) {
				response.setFlow(formatFlow(flows.get(0)));
			} else {
				for(Flow flow : flows) {
					String flowName = flow.getName();
					if(blockName.equals("DOC") && flowName.equals("MIXED")) {
						response.setFlow(formatFlow(flow));
						break;
					} else if(blockName.equals("IDENT") && flowName.equals("OFF_ONLY")) {
						response.setFlow(formatFlow(flow));
						break;
					}
				}
			}
			
			responseList.add(response);
		}
		return responseList;
	}
	
	private FlowDto formatFlow(Flow flow) {
		FlowDto flowDto = new FlowDto();
		flowDto.setName(flow.getName());
		flowDto.setFirstPageId(flow.getFirstPageId());
		flowDto.setPages(formatPages(flow.getPages()));
		return flowDto;
	}
	
	private List<PageDto> formatPages(List<Page> pages) {
		List<PageDto> pageDtos = new ArrayList();
		for(Page page : pages) {
			PageDto pageDto = new PageDto();
			pageDto.setId(page.getId());
			pageDto.setName(page.getName());
			pageDto.setState(page.getState());
			pageDto.setView(page.getView());
			pageDto.setPreviousPageId(page.getPreviousPageId());
			pageDto.setNextPageIds(formatNextPages(page.getNextPages()));
			pageDtos.add(pageDto);
		}
		return pageDtos;
	}
	
	private List<Long> formatNextPages(List<Page> nextPages) {
		List<Long> nextPageIds = new ArrayList();
		for (Page page : nextPages) {
			nextPageIds.add(page.getId());
		}
		return nextPageIds;
	}

}
