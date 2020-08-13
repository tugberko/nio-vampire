import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Ion> rubik = new ArrayList<Ion>();
		
		// z=0.00 layer
		Ion I0 = new Ion(0.00, 0.00, 0.00, 1, 14, 0);
		Ion I2 = new Ion(0.00, 0.50, 0.00, -1, 14, 2);
		Ion I5 = new Ion(0.25, 0.25, 0.00, 1, 14, 5);
		Ion I7 = new Ion(0.25, 0.75, 0.00, -1, 14, 7);
		Ion I8 = new Ion(0.50, 0.00, 0.00, -1, 14, 8);
		Ion I10 = new Ion(0.50, 0.50, 0.00, 1, 14, 10);
		Ion I13 = new Ion(0.75, 0.25, 0.00, -1, 14, 13);
		Ion I15 = new Ion(0.75, 0.75, 0.00, 1, 14, 15);
		
		rubik.add(I0);
		rubik.add(I2);
		rubik.add(I5);
		rubik.add(I7);
		rubik.add(I8);
		rubik.add(I10);
		rubik.add(I13);
		rubik.add(I15);
		
		
		// z=0.25 layer
		Ion I17 = new Ion(0.00, 0.25, 0.25, 1, 14, 17);
		Ion I19 = new Ion(0.00, 0.75, 0.25, -1, 14, 19);
		Ion I20 = new Ion(0.25, 0.00, 0.25, -1, 14, 20);
		Ion I22 = new Ion(0.25, 0.50, 0.25, 1, 14, 22);
		Ion I25 = new Ion(0.50, 0.25, 0.25, -1, 14, 25);
		Ion I27 = new Ion(0.50, 0.75, 0.25, 1, 14, 27);
		Ion I28 = new Ion(0.75, 0.00, 0.25, 1, 14, 28);
		Ion I30 = new Ion(0.75, 0.50, 0.25, -1, 14, 30);
		
		rubik.add(I17);
		rubik.add(I19);
		rubik.add(I20);
		rubik.add(I22);
		rubik.add(I25);
		rubik.add(I27);
		rubik.add(I28);
		rubik.add(I30);
		
		// z =0.50 layer
		Ion I32 = new Ion(0.00, 0.00, 0.50, -1, 14, 32);
		Ion I34 = new Ion(0.00, 0.50, 0.50, 1, 14, 34);
		Ion I37 = new Ion(0.25, 0.25, 0.50, -1, 14, 37);
		Ion I39 = new Ion(0.25, 0.75, 0.50, 1, 14, 39);
		Ion I40 = new Ion(0.50, 0.00, 0.50, 1, 14, 40);
		Ion I42 = new Ion(0.50, 0.50, 0.50, -1, 14, 42);
		Ion I45 = new Ion(0.75, 0.25, 0.50, 1, 14, 45);
		Ion I47 = new Ion(0.75, 0.75, 0.50, -1, 14, 47);
		
		rubik.add(I32);
		rubik.add(I34);
		rubik.add(I37);
		rubik.add(I39);
		rubik.add(I40);
		rubik.add(I42);
		rubik.add(I45);
		rubik.add(I47);
		
		// z=0.75 layer
		Ion I49 = new Ion(0.00, 0.25, 0.75, -1, 14, 49);
		Ion I51 = new Ion(0.00, 0.75, 0.75, 1, 14, 51);
		Ion I52 = new Ion(0.25, 0.00, 0.75, 1, 14, 52);
		Ion I54 = new Ion(0.25, 0.50, 0.75, -1, 14, 54);
		Ion I57 = new Ion(0.50, 0.25, 0.75, 1, 14, 57);
		Ion I59 = new Ion(0.50, 0.75, 0.75, -1, 14, 59);
		Ion I60 = new Ion(0.75, 0.00, 0.75, -1, 14, 60);
		Ion I62 = new Ion(0.75, 0.50, 0.75, 1, 14, 62);
		
		rubik.add(I49);
		rubik.add(I51);
		rubik.add(I52);
		rubik.add(I54);
		rubik.add(I57);
		rubik.add(I59);
		rubik.add(I60);
		rubik.add(I62);
		
		
		System.out.println(rubik.size() + " Ions are present right now.");
		
		Ion.cloneToEverywhere(rubik);
		
		System.out.println(rubik.size() + " Ions are present right now.");
		
		double nearest = Ion.nDistance(rubik);
		double next_nearest = Ion.nnDistance(rubik);
		
		System.out.println("Nearest neighbor distance:\t" + nearest);
		System.out.println("Next nearest neighbor distance:\t" + next_nearest);
		
		//Ion.listInteractions(rubik);
		
		Ion.listInteractionsCompact(rubik);
		
	}// end of main

}// end of class
