package ja0730;

public class Circle extends Shape{
	String sname = "Circle";
	// 원형그리기 - 원점, 반지름
	Point center; // Point 객체 - x,y
	int r;
	
	// 기본생성자
	Circle() {
		this(new Point(0,0),100);
	}
	Circle(Point center, int r){
		this.center = center;
		this.r = r;
	}

}
