package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 
 * @author 000001523
 * 动态访问路径演示
 *
 */
@Controller
@RequestMapping("rest")
public class DynamicUrlController {

	@RequestMapping(value="/{id}/get")
	public String search(@PathVariable String id, Model model) {
		model.addAttribute("id", "hello," + id + "!");
		return "rest/state";
	}
}
