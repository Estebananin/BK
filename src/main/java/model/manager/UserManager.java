package model.manager;


import model.dao.UserDao;
import model.vo.Usuario;
import utils.Utils;

public class UserManager {

	/**
     * Método para insertar objeto de usuario que recibe los parametros de correo y contraseña
     * @param correo
     * @param contrasena
     * @return Devuelve un JSON armado con los parametros del objeto ingresado
     */
    public String insertUser(Usuario u){        
        
        UserDao ud = new UserDao();
        ud.insertObject(u);
        return Utils.toJson(u); 
    }
	
	public boolean findUser(Usuario u) {
		
		
		
		return true;
	}
    
    
    
}
