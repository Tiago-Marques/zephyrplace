package br.com.zephyrplace.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@Named("sessionBean")
@SessionScoped 
public class SessionBeanImpl implements Serializable{  
  
    public void efetuarLogout(){  
        FacesContext fc = FacesContext.getCurrentInstance();  
        HttpSession session = (HttpSession) fc.getExternalContext().getSession(false);  
        session.invalidate();  
    }  
}  