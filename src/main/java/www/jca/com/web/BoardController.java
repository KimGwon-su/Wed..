    package www.jca.com.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

public interface BoardController<T> {
	public ModelAndView getListView(ModelAndView mv, T model);
	public ModelAndView getDetailView(ModelAndView mv, T model);
	public ModelAndView getEditView(ModelAndView mv, T model, HttpServletRequest request);
	public ModelAndView getWriteView(ModelAndView mv, T model, HttpServletRequest request, Integer type);
	public String write(T model);
	public ModelAndView edit(T model, ModelAndView mv);
	public String delete(T model);
}
