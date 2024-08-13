package agilambal;

class Circle{
private double radius;
public Circle(double radius){
this.radius=radius;
}
public double getRadius(){
return radius;
}
public void setRadius(double radius){
this.radius=radius;
}
public double calArea(){
return Math.PI * radius*radius;
}
public double calCircum(){
return 2* Math.PI*radius;
}
public static void main(String args[]){
Circle myCircle=new Circle(5.0);
System.out.println("Radius:"+myCircle.getRadius());
System.out.println("Area:"+myCircle.calArea());
System.out.println("Circumference:"+myCircle.calCircum());

myCircle.setRadius(7.0);
System.out.println("Updated Radius:"+myCircle.getRadius());
System.out.println("Updated Area:"+myCircle.calArea());
System.out.println("Updated Circumference:"+myCircle.calCircum());
}
}
