import java.applet.*;
import java.awt.*;
//<Applet Code=Smile height=500 width=500></Applet>
public class Smile extends Applet{
public void paint(Graphics g){
Font f=new Font("Helvetica",Font.BOLD,20);
g.setFont(f);
g.drawString("Keep Smiling!!!", 100, 30);
g.setColor(Color.yellow);  
g.fillOval(60,60,200,200);

g.setColor(Color.black);
g.drawOval(60,60,200,200);

g.setColor(Color.black);
g.fillOval(85,120,50,20);
g.fillOval(185,120,50,20);

g.setColor(Color.red);
g.fillOval(95,125,30,10);
g.fillOval(195,125,30,10);

g.setColor(Color.black);
g.fillOval(150,150,20,40);
g.drawArc(115,135,95,95,-30,-120);

g.drawLine(90,40,80,100);
g.drawLine(90,40,105,75);

g.drawLine(230,40,215,75);
g.drawLine(230,40,240,100);

g.drawLine(160,260,160,400);

g.drawLine(160,400,100,450);
g.drawLine(160,400,220,450);

g.drawLine(160,300,100,350);
g.drawLine(160,300,220,350);

}}