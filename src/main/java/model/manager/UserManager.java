package model.manager;


import model.dao.UserDao;
import model.vo.Usuario;
import utils.Utils;

public class UserManager {

	UserDao ud = new UserDao();
	Usuario u = new Usuario();
	
	/**
     * Método para insertar objeto de usuario que recibe los parametros de correo y contrasena y mediante los 
     * DAO del usuario inserta el objeto y devuelve un JSON con este.
     * @param correo
     * @param contrasena
     * @return Devuelve un JSON armado con los parametros del objeto ingresado
     */
    public String insertUser(String correo, String contrasena){        
        
    	u.setCorreo(correo);
    	u.setContrasena(contrasena);
        ud.insertObject(u);
        return Utils.toJson(u); 
    }
	  
    /**
     * Método para buscar objeto de usuario que recibe los parametros de correo y contraseña
     * @param correo
     * @param contrasena
     * @return Devuelve un JSON armado con los parametros del objeto ingresado
     */
	public boolean findUser(String correo, String contrasena) {
		
		u.setCorreo(correo);
		u.setContrasena(contrasena);
		if(ud.findObject(u) == true) {
			return true;
		}else return false;
	
	}
    
	
	 /**
     * Método para buscar objeto de usuario que recibe un usuario
     * @param correo
     * @param contrasena
     * @return Devuelve un JSON armado con los parametros del objeto ingresado
     */
	
public boolean findUser1(Usuario u) {
		
		if(ud.findObject(u) == true) {
			return true;
		}else return false;
	
	}
    
}
