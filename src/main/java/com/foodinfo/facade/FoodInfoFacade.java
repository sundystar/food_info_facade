package com.foodinfo.facade;

import com.foodinfo.base.APIRequest;
import com.foodinfo.base.APIResult;
/**
 * 
 * @author sly
 * 
 * @desc 粮食控制类
 * 
 *
 */
public interface FoodInfoFacade {

	/**
	 * 
	 * @param apiRequest
	 * 
	 * @desc 查询列表
	 * @return
	 */
	APIResult foodList(APIRequest apiRequest);

	/**
	 * 
	 * 添加
	 * @param apiRequest
	 * @return
	 */
	APIResult addFood(APIRequest apiRequest);

}
