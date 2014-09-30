package br.com.zephyrplace.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

@Named("sessionBean")
@ManagedBean(name = "sessionBean")
public class SessionBeanImpl {

	public void efetuarLogout() throws Exception{  
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
    	HttpServletRequest session = (HttpServletRequest) ec.getRequest();
    	session.getSession().invalidate();
	    ec.redirect(ec.getRequestContextPath() + "/paginas/index.xhtml");
    }
}
