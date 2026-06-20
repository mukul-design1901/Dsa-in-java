import java.applet.*;
import java.awt.*;
public class student extends Applet
{
	String name,branch,college;
	int roll;
	public void init()
	{
		name="Hemendra Singh";
		branch="CSE";
		college="CTAE,Udaipur";
		roll=62;
		setBackground(Color.BLUE);
		setForeground(Color.BLACK);
	}
	public void paint(Graphics gr)
	{ Font f = new Font("Arial", Font.BOLD, 20);
        gr.setFont(f);
		gr.drawString("Name: "+name,200,150);
		gr.drawString("Branch: "+branch,200,200);
		gr.drawString("College: "+college,200,250);
		gr.drawString("Roll No.: "+roll,200,300);
	}
}
@student.html
<html>
<head>
Student Details 
</head>
<body>
<applet code="student.java"height=500 width =700>
</applet>
</body>
</html>
