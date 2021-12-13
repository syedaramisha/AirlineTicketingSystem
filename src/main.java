
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

class Filing {

    String user;
    String email;
    String pass;
    String fn;
    String ln;
    String passno;
    String cnic;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getLn() {
        return ln;
    }

    public void setLn(String ln) {
        this.ln = ln;
    }

    public String getPassno() {
        return passno;
    }

    public void setPassno(String passno) {
        this.passno = passno;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }
}

class UserDetails extends Filing {

    void Savefile() {
        try {
            FileWriter Writer = new FileWriter("UserDetails.txt", true);
            Writer.write(getUser() + "," + getPass() + "," + getEmail() + "," + getFn() + "," + getLn() + "," + getPassno() + "," + getCnic() + "\n");
            //Writer.write(user + "," + pass + "," + email + "," + fn + "," + ln + "," + passno + "," + cnic + "\n");
            Writer.close();
        } catch (IOException ex) {
        }

    }

}

class CurrentUser extends Filing {
   
    void Savefile() {
        try {
            FileWriter Writer = new FileWriter("CurrentUser.txt", false);
            Writer.write(getUser() + "," + getPass() + "," + getEmail() + "," + getFn() + "," + getLn() + "," + getPassno() + "," + getCnic() + "\n");
            //Writer.write(user + "," + pass + "," + email + "," + fn + "," + ln + "," + passno + "," + cnic + "\n");
            Writer.close();
        } catch (IOException ex) {
        }

    }

}
public class main{
    public static void main(String[] args) {
        
    }
}