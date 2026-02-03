package com.syndo.project.industry.zbgzjs.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.syndo.project.industry.sjsb.domain.Flml;
import com.syndo.project.industry.zbgzjs.domain.Zbfl;
import com.syndo.project.industry.zbgzjs.service.IZbkglService;
import com.syndo.project.industry.zbgzjs.service.ZbGzkService;


/**
 * 指标库管理
 * 
 * @author hry
 *
 */
@Controller
@RequestMapping("/module/industry/zbkgl")
public class ZbkglController {

	private String prefix = "industry/zbgzjs/zbkgl";
	@Autowired
	IZbkglService service;

	@GetMapping()
	public String view() throws ParseException {
		return prefix + "/view";
	}

//	/**
//	 * 获取指标库指标分类
//	 * 
//	 * @return
//	 */
//	@ResponseBody
//	@PostMapping("/SelectPermissions")
//	public List<Object> listFileDirectory() throws Exception {
//		List<Zbfl> fileDirectories = service.GetZbkZbfm(); // 查询所有目录数据
//		List<Object> list = new ArrayList<>();
//		try {
//			for (Zbfl fd : fileDirectories) {
//				if (fd.getPID().equals("0")) { // 获取根节点目录，在数据库中加第一行数据，即根目录的数据，pid设为0
//					JSONObject treeObj = new JSONObject();
//					treeObj.put("id", fd.getID());
//					treeObj.put("title", fd.getMLMC());
//					treeObj.put("pid", fd.getPID());
//					treeObj.put("spread", true); // 设置默认展开
//					treeObj.put("children", getChildren(fd.getID(), fileDirectories)); // 查询叶子节点		
//				//	treeObj.put("disabled", true); // 不可选中
//					
//					list.add(treeObj);
//				}
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.print("--------------------------------****--------------------");
//			e.printStackTrace();
//		}
//		return list;
//	}
//
//	/**
//	 * 获取叶子节点目录，递归遍历
//	 */
//	public List<Object> getChildren(String Id, List<Zbfl> fileDirectories) {
//		List<Object> list = new ArrayList<>();
//		for (Zbfl f : fileDirectories) {
//			if (f.getPID().equals(Id)) {
//				
//				JSONObject obj = new JSONObject();
//				obj.put("id", f.getID());
//				obj.put("title", f.getMLMC());
//				obj.put("pid", f.getPID());
//				/*
//				 * if(f.getPID().equals("6")) { obj.put("disabled", true); // 不可选中 }
//				 */
//				obj.put("children", getChildren(f.getID(), fileDirectories));
//				list.add(obj);
//			}
//		}
//		return list;
//	}
//
//	/**
//	 * 新增
//	 * 
//	 * @throws Exception
//	 */
//	@ResponseBody
//	@PostMapping("/saveDirectory")
//	public Object saveFileDirectory(Zbfl fileDirectory) throws Exception {
//		fileDirectory.setID(UUID.randomUUID().toString().replace("-", "").toUpperCase());	
//		fileDirectory.setLX("zbk");
//		service.saveFileDirectory(fileDirectory);
//		return 1;
//	}
//	
//
//    /**
//     * 修改文件目录名称
//     * */
//    @ResponseBody
//    @PostMapping("/updateDirectory")
//    public void updateFileDirectory(Zbfl fileDirectory){
//        fileDirectory.setMLMC(fileDirectory.getMLMC());
//       service.updateFileDirectory(fileDirectory);
//    }
//    
//    /**
//     * 删除文件目录,同时删除该目录下所有节点目录
//     * */
//    @ResponseBody
//    @PostMapping("/delDirectory")
//    public void delFileDirectory(String id) throws Exception{
//    	service.delFileDirectory(id);
//    }
    
    @Autowired
	private ZbGzkService zbGzkService;

	/**
	 * 新增指标
	 */
	@GetMapping("/add")
	public String add(ModelMap model, String flmlid) {
		model.put("FLMLID", flmlid);
		Flml flml = zbGzkService.selectFlmlById(flmlid);
		model.put("FLMC", flml!=null?flml.getMlmc():"");
		return prefix + "/add";
	}
}
