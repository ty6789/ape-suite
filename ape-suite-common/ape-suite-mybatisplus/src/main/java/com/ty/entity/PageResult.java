package com.ty.entity;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.Data;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

@Data
public class PageResult<T> implements Serializable {

    private Long total;

    private Long size;

    private Long current;

    private Long pages;

    private List<T> records = Collections.emptyList();

    public void loadData(IPage<T> pageData) {
        this.setTotal(pageData.getTotal());
        this.setSize(pageData.getSize());
        this.setCurrent(pageData.getCurrent());
        this.setPages(pageData.getPages());
        this.setRecords(pageData.getRecords());
    }

}
