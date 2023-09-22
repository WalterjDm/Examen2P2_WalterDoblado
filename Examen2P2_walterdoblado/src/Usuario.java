
/**
 *
 * @author walter
 */
public class Usuario {

    private String UserName;
    private String contra;
    private int edad;

    public Usuario() {
    }

    public Usuario(String UserName, String contra, int edad) {
        this.UserName = UserName;
        this.contra = contra;
        this.edad = edad;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "UserName=" + UserName + ", contra=" + contra + ", edad=" + edad + '}';
    }

    
    
}
