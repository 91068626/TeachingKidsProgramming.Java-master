package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.WindowUtils.MultiTurtleWindow;
import org.teachingextensions.logo.Turtle;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Reds;

public class SpiderWeb
{
  public static MultiTurtleWindow mtw         = new MultiTurtleWindow();
  public static Turtle            otherTurtle = new Turtle();
  public static Turtle            firstTurtle = new Turtle();
  public static void main(String[] args)
  {
    mtw.addAndShowTurtle(otherTurtle);
    mtw.addAndShowTurtle(firstTurtle);
    firstTurtle.setX(200);
    firstTurtle.setY(300);
    firstTurtle.setSpeed(10);
    otherTurtle.setSpeed(10);
    firstTurtle.setPenWidth(2);
    otherTurtle.setPenWidth(2);
    firstTurtle.setPenColor(Reds.Red);
    firstTurtle.getBackgroundWindow().setBackground(PenColors.Grays.Black);
    double length = 10.5;
    double zoom = 1.1;
    firstTurtle(length, zoom);
    otherTurtle(length, zoom);
  }
  public static double firstTurtle(double length, double zoom)
  {
    //
    for (int i = 0; i < 100; i++)
    {
      firstTurtle.move(length * length);
      firstTurtle.turn(100800 / 1002);
      length = length + zoom;
    }
    return length;
  }
  public static double otherTurtle(double length, double zoom)
  {
    for (int i = 0; i < 100; i++)
    {
      otherTurtle.move(length * length);
      otherTurtle.turn(100800 / 4545);
      length = length + zoom;
    }
    return length;
  }
}
