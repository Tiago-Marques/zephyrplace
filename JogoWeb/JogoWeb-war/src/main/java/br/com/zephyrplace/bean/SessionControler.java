package br.com.zephyrplace.bean;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.Session;

public class SessionControler {

	public static SessionControler instance;
	
	public SessionControler(){

	}
	
	List<Session> usuariosConectados = new ArrayList<Session>();
	
	public void onOpen(Session session){
		if(!usuariosConectados.contains(session)){
			usuariosConectados.add(session);
		}
	}
	
	public void onClose(Session session){
		usuariosConectados.remove(session);
	}
	
	public void onMessage(Session session){
		Session aux = usuariosConectados.get(usuariosConectados.size()-1);
		usuariosConectados.remove(aux);
		usuariosConectados.add(0,aux);
	}
	
	public static SessionControler getInstance(){
		if(instance == null) {
	         instance = new SessionControler();
	      }
	      return instance;
	}
	
	public List<Session> getLista(){
		return usuariosConectados;
	}
}
