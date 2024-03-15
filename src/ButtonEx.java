import java.awt.*;

public class ButtonEx {

	public static void main(String[] args) {
		Frame f = new Frame("ButtonTest");
		
		Panel p = new Panel();
		
		Button b1 = new Button();
		Button b2 = new Button("Button2");
		Button b3 = new Button("Button3");
		Button b4 = new Button("Button4");
		
		b1.setLabel("Button1");
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		f.add(p);
		
		f.setLocation(300,300);
		f.setSize(300,100);
		f.setVisible(true);

	}

}
