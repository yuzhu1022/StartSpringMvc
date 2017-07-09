package hanson.springmvc.web.controller;
import hanson.springmvc.pojo.Items;

import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 

import org.springframework.web.servlet.ModelAndView; 
import org.springframework.web.servlet.mvc.Controller; 
/** 
 * @ClassName: ItemsController1 
 * @Description: TODO(简单的处理器适配器支持执行实现Controller接口的处理器) 
 * @author: Hanson 
 * @date: 2016年1月14日 下午11:59:06 
 **/ 
public class ItemsController1 implements Controller{ 
	@Override 
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception { 
		return null; 
		} 
	@Override 
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception { 
		// 商品列表 List<Items> itemsList = new ArrayList<Items>(); 
		Items items_2 = new Items(); 
		items_2.setName("苹果手机");
		items_2.setPrice(6088f); 
		items_2.setDetail("iphone6s苹果手机！"); 
		itemsList.add(items_2); 
		// 创建modelAndView：填充数据、设置视图 ModelAndView modelAndView = new ModelAndView(); 
		// 填充数据 modelAndView.addObject("itemsList", itemsList);
		// 类似request.setAttribute("","") 
		// 视图:逻辑名称 modelAndView.setViewName("jsp/itemsList");
		// request.getRequestDispatcher("url").forward(request, response); 
		return modelAndView; 
		}
	}
		
	}
