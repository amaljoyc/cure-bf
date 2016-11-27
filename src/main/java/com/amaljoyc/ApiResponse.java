package com.amaljoyc;

import java.util.List;

import dto.BlockDto;
import dto.FlowDto;

public class ApiResponse {
	
	private List<BlockDto> blocks;

	public List<BlockDto> getBlocks() {
		return blocks;
	}

	public void setBlocks(List<BlockDto> blocks) {
		this.blocks = blocks;
	}
	
}
