import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Exit extends WindowAdapter { // Adapter클래스 상속받는 클래스 새로 생성해서
	public void windowClosing(WindowEvent e) { // 내가 쓸 것만 오버라이딩
		System.exit(0);
	}

}

public class ActionEventEx extends Frame {

	// Panel p;
	// Button input, exit;
	// TextArea ta;

	public ActionEventEx() {
		super("WindowEvent Test");

		Label exit = new Label("program exit");
		// p = new Panel();
		// input = new Button("input");
		// exit = new Button("exit");
		// ta = new TextArea();

		// input.addActionListener(this); // 이벤트소스와 이벤트 핸들러 연결
		// exit.addActionListener(this); // 이벤트소스와 이벤트 핸들러 연결

		// add(input);
		add(exit);
		// add(p, BorderLayout.NORTH);
		// add(ta, BorderLayout.CENTER);

		setBounds(300, 300, 300, 200);
		setVisible(true);

		addWindowListener(new Exit());
	}

	public static void main(String[] args) {
		new ActionEventEx();

	}

}
