package hanson.springmvc.web.controller;
import hanson.springmvc.pojo.Items;

import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 

import org.springframework.web.servlet.ModelAndView; 
import org.springframework.web.servlet.mvc.Controller; 
/** 
 * @ClassName: ItemsController1 
 * @Description: TODO(�򵥵Ĵ�����������֧��ִ��ʵ��Controller�ӿڵĴ�����) 
 * @author: Hanson 
 * @date: 2016��1��14�� ����11:59:06 
 **/ 
public class ItemsController1 implements Controller{ 
	@Override 
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception { 
		return null; 
		} 
	@Override 
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception { 
		// ��Ʒ�б� List<Items> itemsList = new ArrayList<Items>(); 
		Items items_2 = new Items(); 
		items_2.setName("ƻ���ֻ�");
		items_2.setPrice(6088f); 
		items_2.setDetail("iphone6sƻ���ֻ���"); 
		itemsList.add(items_2); 
		// ����modelAndView��������ݡ�������ͼ ModelAndView modelAndView = new ModelAndView(); 
		// ������� modelAndView.addObject("itemsList", itemsList);
		// ����request.setAttribute("","") 
		// ��ͼ:�߼����� modelAndView.setViewName("jsp/itemsList");
		// request.getRequestDispatcher("url").forward(request, response); 
		return modelAndView; 
		}
	}
		
	}
