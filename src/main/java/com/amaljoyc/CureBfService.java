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

import dto.BlockDto;
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
	
	public ApiResponse buildApiResponse() {
		ApiResponse apiResponse = new ApiResponse();
		List<BlockDto> blockDtos = new ArrayList();
		
		List<Block> blocks = blockRepo.findAll();
		for (Block block : blocks) {
			BlockDto blockDto = new BlockDto();
			String blockName = block.getName();
			blockDto.setName(blockName);
			blockDto.setSortOrder(block.getSortOrder());
			List<Flow> flows = block.getFlows();
			
			if(flows.size() == 1) {
				blockDto.setFlow(formatFlow(flows.get(0)));
			} else {
				for(Flow flow : flows) {
					String flowType = flow.getType();
					if(blockName.equals("DOC") && flowType.equals("MIXED")) {
						blockDto.setFlow(formatFlow(flow));
						break;
					} else if(blockName.equals("IDENT") && flowType.equals("OFF_ONLY")) {
						blockDto.setFlow(formatFlow(flow));
						break;
					}
				}
			}

			blockDtos.add(blockDto);
		}

		apiResponse.setBlocks(blockDtos);
		return apiResponse;
	}
	
	private FlowDto formatFlow(Flow flow) {
		FlowDto flowDto = new FlowDto();
		flowDto.setName(flow.getName());
		flowDto.setType(flow.getType());
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
