package com.mangxiao.vue.backend.sample.util;

public class Pages {
    /** 第几页 */
    private int pageNo;
    /** 每页多少条 */
    private int pageSize;

    public Pages() {
        // todo ...
    }

    public Pages(int pageNo, int pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
