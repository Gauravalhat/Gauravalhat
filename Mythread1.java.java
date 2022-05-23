import java.lang.;
import java.awt.*;
import java.lang.*;


class GauravFrame 
{
    public Frame fobj;

    public GauravFrame(String name)
    {
        fobj=new Frame(name);
        fobj.setSize(600,600);
        fobj.steVisible(true);

        fobj.addWindowListener(new GauravListener());
    }

}
class GauravListener impliments ActionListener
{
    public void windowDeactivated(WindowEvent obj){}
    public void windowActivated(WindowEvent obj){}
    public void windowDeiconifide(WindowEvent obj){}
    public void windowIctivated(WindowEvent obj){}
    public void windowClosed(WindowEvent obj){}
    public void windowClosing(WindowEvent obj){}
    public void windowOpened(WindowEvent obj){}
}
class FrameDemo3
{
    public static void main(String arg[])
    {
        System.out.println("Print the data on console");

        GauravFrame gobj=new GauravFrame("PPA");
    }
}