package com.omnipotent.page;

/**
 * 分页参数封装
 * 
 * @author zhangtb
 * @date 2016-7-10 19:53:42
 * @since 1.0.0
 */
public class PageParam {

	private int pageFirst = 0;// 每页第一条
	private int pageNum = 1; // 当前页
	private int pageSize = 10; // 每页显示条数
	private int totalCount = 0; // 总条数
	private int totalPage = 0; // 总页数

	public PageParam() {
		super();
	}

	public PageParam(int pageFirst, int pageNum, int pageSize, int totalCount, int totalPage) {
		super();
		this.pageFirst = pageFirst;
		this.pageNum = pageNum;
		this.pageSize = pageSize;
		this.totalCount = totalCount;
		this.totalPage = totalPage;
	}

	public int getPageFirst() {
		return pageFirst;
	}

	public void setPageFirst(int pageFirst) {
		this.pageFirst = pageFirst;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

}
