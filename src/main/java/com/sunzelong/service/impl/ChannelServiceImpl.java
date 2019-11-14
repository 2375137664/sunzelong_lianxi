package com.sunzelong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunzelong.bean.Channel;
import com.sunzelong.mapper.ChannelMapper;
import com.sunzelong.service.ChannelService;

/**
 * 
 * @author zhuzg
 *
 */

@Service
public class ChannelServiceImpl  implements ChannelService{
	
	@Autowired
	ChannelMapper channelMapper;

	@Override
	public List<Channel> list() {
		// TODO Auto-generated method stub
		return channelMapper.list();
	}

}
