package br.com.a2dm.brcli.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.a2dm.brcmn.entity.Usuario;
import br.com.a2dm.brcmn.service.UsuarioService;
import br.com.a2dm.brcmn.util.jsf.AbstractBean;


@RequestScoped
@ManagedBean
public class PrincipalBean extends AbstractBean<Usuario, UsuarioService>
{
	public PrincipalBean()
	{
		super(UsuarioService.getInstancia());
		this.ACTION_SEARCH = "principal";
		this.pageTitle = "Dashboard"; 
	}
}
