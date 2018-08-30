package sample;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="helloWorld", eager=true)
@SessionScoped
public class HelloWorld {
	public String getMessage() {
		return "Kalokohan!";
	}
}
