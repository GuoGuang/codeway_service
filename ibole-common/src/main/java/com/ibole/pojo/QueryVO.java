package com.ibole.pojo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;

/**
 * 封装的查询参数类
 **/

@Getter
@Setter
public class QueryVO implements Serializable {
    /*
        private long pageNum = 1;

        private long pageSize = 10000;*/
    private Pageable pageable;

	private String searchValue;
	private String searchSort;

	/*排序*/
	private Boolean orderBy;
	private String fieldSort;

	private String sortType;


}
