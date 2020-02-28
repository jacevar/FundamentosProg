/**
 * Write a description of class EjecutarRegistroArea here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class EjecutarRegistroArea {

    public static void main(String []args) {
	Scanner scan = new Scanner(System.in);

	float x1,y1,x2,y2;
	// Area1
	x1 = scan.nextFloat();
	y1 = scan.nextFloat();
	x2 = scan.nextFloat();
	y2 = scan.nextFloat();
	Area area1 = new Area(x1,y1,x2,y2);

	// Area2
	x1 = scan.nextFloat();
	y1 = scan.nextFloat();
	x2 = scan.nextFloat();
	y2 = scan.nextFloat();
	Area area2 = new Area(x1,y1,x2,y2);

	// Area3
	x1 = scan.nextFloat();
	y1 = scan.nextFloat();
	x2 = scan.nextFloat();
	y2 = scan.nextFloat();
	Area area3 = new Area(x1,y1,x2,y2);

	// Lee una secuencia de puntos
	while (scan.hasNextFloat()) {
	    x1 = scan.nextFloat();
	    y1 = scan.nextFloat();
	    area1.golpear(x1,y1);
	    area2.golpear(x1,y1);
	    area3.golpear(x1,y1);
	}

	System.out.println(area1.obtTotalGolpes());
	System.out.println(area2.obtTotalGolpes());
	System.out.println(area3.obtTotalGolpes());
    }
}
