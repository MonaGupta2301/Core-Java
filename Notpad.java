import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Notpad
{
    Notpad()
    {
        Frame f = new Frame();
        f.setBounds(200,30,1200,1200);
		f.setVisible(true);
		
		f.setLayout(null);
		//ssf.setDefaultCloseOperation();
        MenuBar m = new MenuBar();
        Menu File=new Menu("File");
        Menu Edit = new Menu("Edit");
        Menu Help = new Menu("Help");
        MenuItem Save = new MenuItem("Save");
        MenuItem Open = new MenuItem("Open");
        MenuItem Save_As = new MenuItem("Save As");
        
        MenuItem Font = new MenuItem("Font");
        MenuItem help = new MenuItem("Help");
        
        File.add(Save);
        File.add(Save_As);
        File.add(Open);
        Edit.add(Font);
		Help.add(help);
        
        m.add(File);
        m.add(Edit);
		m.add(Help);
        f.setMenuBar(m);

        //FileDialog f = new FileDialog();
         		
    }
    public static void main(String[] args)
    {
        Notpad n = new Notpad();
    }
    
}
