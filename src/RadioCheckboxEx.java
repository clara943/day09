import java.awt.*;

public class RadioCheckboxEx {

	public static void main(String[] args) {
		Frame f = new Frame("CheckBox");

		Panel p = new Panel();

		CheckboxGroup group = new CheckboxGroup();
		Checkbox radio1 = new Checkbox("a", group, true);
		Checkbox radio2 = new Checkbox("b", group, false);
		Checkbox radio3 = new Checkbox("c", group, false);

		p.add(radio1);
		p.add(radio2);
		p.add(radio3);

		f.add(p);

		f.setSize(300, 100);
		f.setVisible(true);
	}

}
