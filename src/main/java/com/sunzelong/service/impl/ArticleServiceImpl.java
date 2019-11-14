package com.sunzelong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sunzelong.bean.Article;
import com.sunzelong.common.ConstantClass;
import com.sunzelong.mapper.ArticleMapper;
import com.sunzelong.service.ArticleService;

/**
 * 
 * @author zhuzg
 *
 */
@Service
public class ArticleServiceImpl  implements ArticleService{
	
	@Autowired
	ArticleMapper articleMapper;
	

	@Override
	public List<Article> getNewArticles(int i) {
		// TODO Auto-generated method stub
		return articleMapper.newList(i);
	}

	@Override
	public PageInfo<Article> hotList(int page) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, ConstantClass.PAGE_SIZE);
		return new PageInfo<Article>(articleMapper.hostList());
		
	}

}
