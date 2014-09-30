package br.com.zephyrplace.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.zephyrplace.facade.PerfilFacade;
import br.com.zephyrplace.hibernate.Perfil;


@Named("perfilBean")
@RequestScoped
public class PerfilBeanImpl {


	private Perfil perfil;
	private String perfilLogado = "";
	private String resposta = "Bem vindo a Rede Social";

	public PerfilBeanImpl(){
		perfil = new Perfil();
	}
	
	@Inject
	private PerfilFacade perfilFacade;

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public String getPerfilLogado() {
		return this.perfilLogado;
	}

	public void setPerfilLogado(String usuarioLogado) {
		this.perfilLogado = usuarioLogado;
	}

	
	public String receber() {
		try {
			setPerfilLogado(perfilFacade.consultarPerfil(getPerfil()).getNome());
			perfil = new Perfil();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (perfilLogado.equals("")) {
			setResposta("Perfil ou Senha incorretos.");
		} else {
			setResposta("");
		}
		
		return "/paginas/index";
	}

	public String exibirData() {
		Date date = new Date();
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		return formatador.format(date);
	}
	
	public String telaCadastro(){
		return "/admin/admin";
	}
	
	public String telaIndex(){
		return "/paginas/index";
	}

	public void inserir() throws Exception {
		perfilFacade.inserirPerfil(perfil);
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	
	
}
