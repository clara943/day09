import java.awt.*;

public class CheckBoxEx {

	public static void main(String[] args) {

		Frame f = new Frame("CheckBox");
		
		Panel p = new Panel();
		
		Checkbox ck1 = new Checkbox("a", true);
		Checkbox ck2 = new Checkbox("b");
		Checkbox ck3 = new Checkbox("c");
		
		p.add(ck1);
		p.add(ck2);
		p.add(ck3);
		
		f.add(p);
		
		f.setSize(300,100);
		f.setVisible(true);
		
		}

}
