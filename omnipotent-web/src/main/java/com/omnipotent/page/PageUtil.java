package com.omnipotent.page;

/**
 * 分页信息计算
 * 
 * @author zhangtb
 * @date 2016-7-10 19:53:47
 * @since 1.0.0
 */
public class PageUtil {

	/**
	 * 分页信息计算
	 * 
	 * @param pageNum 当前页数
	 * @param pageSize 每页最多显示条数
	 * @return
	 */
	public static PageParam get(int pageNum, int pageSize) {
		if (pageNum < 1) pageNum = 1;
		PageParam p = new PageParam();
		int pageFirst = (pageNum - 1) * pageSize;
		p.setPageFirst(pageFirst);
		p.setPageNum(pageNum);
		p.setPageSize(pageSize);
		return p;
	}

	/**
	 * 分页信息计算
	 * 
	 * @param pageNum 当前页数
	 * @param pageSize 每页最多显示条数
	 * @param totalCount 总记录条数
	 * @return
	 */
	public static PageParam get(int pageNum, int pageSize, int totalCount) {
		int pageFirst = (pageNum - 1) * pageSize;
		int totalPage = (totalCount - 1) / pageSize + 1;
		PageParam p = new PageParam();
		p.setPageFirst(pageFirst);
		p.setPageNum(pageNum);
		p.setPageSize(pageSize);
		p.setTotalCount(totalCount);
		p.setTotalPage(totalPage);
		return p;
	}

}
