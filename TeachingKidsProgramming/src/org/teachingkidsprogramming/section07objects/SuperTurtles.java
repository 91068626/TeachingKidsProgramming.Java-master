package org.teachingkidsprogramming.section07objects;

import org.teachingextensions.WindowUtils.MultiTurtleWindow;
import org.teachingextensions.logo.Turtle;

public class SuperTurtles
{
  public MultiTurtleWindow mtw = new MultiTurtleWindow();
  public SuperTurtles()
  {
    showSomeTurtles();
  }
  public static void main(String[] args)
  {
    new SuperTurtles();
  }
  private void showSomeTurtles()
  {
    makeSpeedyTurtle();
    makeSlowTurtle();
    makeCrazyTurtle();
  }
  private void makeCrazyTurtle()
  {
    Turtle crazyTurtle = new Turtle();
    mtw.addAndShowTurtle(crazyTurtle);
    //crazyTurtle.drawLightning(55);
    crazyBolt(crazyTurtle);
  }
  private int crazyBolt(Turtle crazyTurtle)
  {
    int length = 50;
    crazyTurtle.setX(50);
    crazyTurtle.setY(350);
    crazyTurtle.setSpeed(10);
    for (int i = 1; i < 5; i++)
    {
      crazyTurtle.setPenWidth(i * 4);
      crazyTurtle.turn(65 + i);
      crazyTurtle.move(length);
      crazyTurtle.turn(-65);
      crazyTurtle.move(length);
    }
    return length;
  }
  private void makeSlowTurtle()
  {
    Turtle slowTurtle = new Turtle();
    mtw.addAndShowTurtle(slowTurtle);
    //slowTurtle.drawTriangle(-50);
    mySlowTriangle(slowTurtle);
  }
  private void mySlowTriangle(Turtle slowTurtle)
  {
    for (int i = 0; i < 3; i++)
    {
      slowTurtle.turn(120.0);
      slowTurtle.move(-50);
    }
  }
  private void makeSpeedyTurtle()
  {
    Turtle speedyTurtle = new Turtle();
    mtw.addAndShowTurtle(speedyTurtle);
    speedyTurtle.setSpeed(10);
    //speedyTurtle.drawTriangle(100);\
    mySpeedyTriangle(speedyTurtle);
  }
  private void mySpeedyTriangle(Turtle speedyTurtle)
  {
    for (int i = 0; i < 3; i++)
    {
      speedyTurtle.turn(120.0);
      speedyTurtle.move(100);
    }
  }
}
