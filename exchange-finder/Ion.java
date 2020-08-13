import java.util.List;

public class Ion {
	private double x_pos_relative;
	private double x_pos_absolute;
	
	private double y_pos_relative;
	private double y_pos_absolute;
	
	private double z_pos_relative;
	private double z_pos_absolute;
	
	private int parent_cell;
	
	private int type;
	
	private int id;
	
	public Ion(double x_rel, double y_rel, double z_rel, int type_given, int parent_cell_given, int id_given) {
		this.x_pos_relative = x_rel;
		this.y_pos_relative = y_rel;
		this.z_pos_relative = z_rel;
		this.type = type_given;
		this.id = id_given;
		this.parent_cell = parent_cell_given;
		this.setAbsoulteParameters();
		
	}
	
	public void getInfo() {
		System.out.println("Relative x position:\t" + this.x_pos_relative);
		System.out.println("Absolute x position:\t" + this.x_pos_absolute);
		
		System.out.println("Relative y position:\t" + this.y_pos_relative);
		System.out.println("Absolute y position:\t" + this.y_pos_absolute);
		
		System.out.println("Relative y position:\t" + this.z_pos_relative);
		System.out.println("Absolute y position:\t" + this.z_pos_absolute);
		System.out.println("Type:\t" + this.type);
	}
	
	private void setAbsoulteParameters() {
		switch(this.parent_cell) {
			/* Middle Layer */
			case 10:
				this.x_pos_absolute = this.x_pos_relative - 1;
				this.y_pos_absolute = this.y_pos_relative - 1;
				this.z_pos_absolute = this.z_pos_relative;
				return;
			case 11:
				this.x_pos_absolute = this.x_pos_relative - 1;
				this.y_pos_absolute = this.y_pos_relative;
				this.z_pos_absolute = this.z_pos_relative;
				return;
			case 12:
				this.x_pos_absolute = this.x_pos_relative - 1;
				this.y_pos_absolute = this.y_pos_relative + 1;
				this.z_pos_absolute = this.z_pos_relative;
				return;
			case 13:
				this.x_pos_absolute = this.x_pos_relative;
				this.y_pos_absolute = this.y_pos_relative - 1;
				this.z_pos_absolute = this.z_pos_relative;
				return;
			case 14:
				this.x_pos_absolute = this.x_pos_relative;
				this.y_pos_absolute = this.y_pos_relative;
				this.z_pos_absolute = this.z_pos_relative;
				return;
			case 15:
				this.x_pos_absolute = this.x_pos_relative;
				this.y_pos_absolute = this.y_pos_relative + 1;
				this.z_pos_absolute = this.z_pos_relative;
				return;
			case 16:
				this.x_pos_absolute = this.x_pos_relative + 1;
				this.y_pos_absolute = this.y_pos_relative - 1;
				this.z_pos_absolute = this.z_pos_relative;
				return;
			case 17:
				this.x_pos_absolute = this.x_pos_relative + 1;
				this.y_pos_absolute = this.y_pos_relative;
				this.z_pos_absolute = this.z_pos_relative;
				return;
			case 18:
				this.x_pos_absolute = this.x_pos_relative + 1;
				this.y_pos_absolute = this.y_pos_relative + 1;
				this.z_pos_absolute = this.z_pos_relative;
				return;
			/* Bottom Layer */
			case 1:
				this.x_pos_absolute = this.x_pos_relative - 1;
				this.y_pos_absolute = this.y_pos_relative - 1;
				this.z_pos_absolute = this.z_pos_relative - 1;
				return;
			case 2:
				this.x_pos_absolute = this.x_pos_relative - 1;
				this.y_pos_absolute = this.y_pos_relative;
				this.z_pos_absolute = this.z_pos_relative - 1;
				return;
			case 3:
				this.x_pos_absolute = this.x_pos_relative - 1;
				this.y_pos_absolute = this.y_pos_relative + 1;
				this.z_pos_absolute = this.z_pos_relative - 1;
				return;
			case 4:
				this.x_pos_absolute = this.x_pos_relative;
				this.y_pos_absolute = this.y_pos_relative - 1;
				this.z_pos_absolute = this.z_pos_relative - 1;
				return;
			case 5:
				this.x_pos_absolute = this.x_pos_relative;
				this.y_pos_absolute = this.y_pos_relative;
				this.z_pos_absolute = this.z_pos_relative - 1;
				return;
			case 6:
				this.x_pos_absolute = this.x_pos_relative;
				this.y_pos_absolute = this.y_pos_relative + 1;
				this.z_pos_absolute = this.z_pos_relative - 1;
				return;
			case 7:
				this.x_pos_absolute = this.x_pos_relative + 1;
				this.y_pos_absolute = this.y_pos_relative - 1;
				this.z_pos_absolute = this.z_pos_relative - 1;
				return;
			case 8:
				this.x_pos_absolute = this.x_pos_relative + 1;
				this.y_pos_absolute = this.y_pos_relative;
				this.z_pos_absolute = this.z_pos_relative - 1;
				return;
			case 9:
				this.x_pos_absolute = this.x_pos_relative + 1;
				this.y_pos_absolute = this.y_pos_relative + 1;
				this.z_pos_absolute = this.z_pos_relative - 1;
				return;
			/* Top Layer */
			case 19:
				this.x_pos_absolute = this.x_pos_relative - 1;
				this.y_pos_absolute = this.y_pos_relative - 1;
				this.z_pos_absolute = this.z_pos_relative + 1;
				return;
			case 20:
				this.x_pos_absolute = this.x_pos_relative - 1;
				this.y_pos_absolute = this.y_pos_relative;
				this.z_pos_absolute = this.z_pos_relative + 1;
				return;
			case 21:
				this.x_pos_absolute = this.x_pos_relative - 1;
				this.y_pos_absolute = this.y_pos_relative + 1;
				this.z_pos_absolute = this.z_pos_relative + 1;
				return;
			case 22:
				this.x_pos_absolute = this.x_pos_relative;
				this.y_pos_absolute = this.y_pos_relative - 1;
				this.z_pos_absolute = this.z_pos_relative + 1;
				return;
			case 23:
				this.x_pos_absolute = this.x_pos_relative;
				this.y_pos_absolute = this.y_pos_relative;
				this.z_pos_absolute = this.z_pos_relative + 1;
				return;
			case 24:
				this.x_pos_absolute = this.x_pos_relative;
				this.y_pos_absolute = this.y_pos_relative + 1;
				this.z_pos_absolute = this.z_pos_relative + 1;
				return;
			case 25:
				this.x_pos_absolute = this.x_pos_relative + 1;
				this.y_pos_absolute = this.y_pos_relative - 1;
				this.z_pos_absolute = this.z_pos_relative + 1;
				return;
			case 26:
				this.x_pos_absolute = this.x_pos_relative + 1;
				this.y_pos_absolute = this.y_pos_relative;
				this.z_pos_absolute = this.z_pos_relative + 1;
				return;
			case 27:
				this.x_pos_absolute = this.x_pos_relative + 1;
				this.y_pos_absolute = this.y_pos_relative + 1;
				this.z_pos_absolute = this.z_pos_relative + 1;
				return;
		}//end of switch
	}//end of setAbsoluteParameters
	
	public static double getDistance(Ion I1, Ion I2) {
		double dist;
		double xdiff = I1.x_pos_absolute - I2.x_pos_absolute;
		double ydiff = I1.y_pos_absolute - I2.y_pos_absolute;
		double zdiff = I1.z_pos_absolute - I2.z_pos_absolute;
		dist = Math.sqrt(xdiff*xdiff + ydiff*ydiff + zdiff*zdiff);
		return dist;
	}// end of getDistance
	
	public Ion clone(int target_cell) {
		Ion clone = new Ion(this.x_pos_relative, this.y_pos_relative, this.z_pos_relative, this.type, target_cell, this.id);
		return clone;
	}// end of clone
	
	public static void cloneToEverywhere(List<Ion> ionList) {
		for(int i=0; i<ionList.size(); i++) {
			if (ionList.get(i).parent_cell == 14){
				
				for(int j=1; j<=27; j++) {
					if(j!=14)
						ionList.add(  ionList.get(i).clone(j)  );
				}// generate a clone in the surrounding cells
				
				
			}// select the ones in the middle (14)
		}// Iterate through all elements present in list
	}// end of cloneToEverywhere
	
	public static double nDistance(List<Ion> ionList) {
		double n = 999;
		double currentDistance = 0;
		
		for(int i=0; i<ionList.size(); i++) {
			for(int j=i+1; j<ionList.size(); j++) {
				if(ionList.get(i).parent_cell != 14)
					continue;
				else {
					currentDistance = getDistance(ionList.get(i), ionList.get(j));
					if (currentDistance<=n) {
						n = currentDistance;
					}
				}
			}// Iterate every pair index 2
		}//Iterate every pair index 1
	
		return n;
	}// nearest neighbor
	
	public static double nnDistance(List<Ion> ionList) {
		double n = nDistance(ionList);
		double nn = 999;
		double currentDistance = 0;
		
		for(int i=0; i<ionList.size(); i++) {
			for(int j=i+1; j<ionList.size(); j++) {
				if(ionList.get(i).parent_cell != 14)
					continue;
				else {
					currentDistance = getDistance(ionList.get(i), ionList.get(j));
					if (currentDistance<=nn && currentDistance > n) {
						nn = currentDistance;
					}
				}
			}// Iterate every pair index 2
		}//Iterate every pair index 1
	
		return nn;
	}// nearest neighbor
	
	public static void listInteractions(List<Ion> ionList) {
		Ion source;
		Ion target;
		
		int nearest  = 0;
		int nNearest = 0;
		
		double n = nDistance(ionList);
		double nn = nnDistance(ionList);
		
		for(int i=0; i<ionList.size(); i++) {
			
			if (ionList.get(i).parent_cell != 14)
				continue;
			
			for(int j=0; j<ionList.size(); j++) {
					source = ionList.get(i);
					target = ionList.get(j);
					if (getDistance(source, target) == n) {
						System.out.println("## Nearest Neighbour Interaction Found ##");
						System.out.println("Source ion ID:\t\t" + source.id);
						System.out.println("Source ion type:\t" + source.type);
						System.out.println("Target ion cell:\t" + target.parent_cell);
						System.out.println("Target ion ID:\t\t" + target.id);
						System.out.println("Target ion type:\t" + target.type + "\n");
						nearest++;
					} else if (getDistance(source, target) == nn) {
						System.out.println("## Next-Nearest Neighbour Interaction Found ##");
						System.out.println("Source ion ID:\t\t" + source.id);
						System.out.println("Source ion type:\t" + source.type);
						System.out.println("Target ion cell:\t" + target.parent_cell);
						System.out.println("Target ion ID:\t\t" + target.id);
						System.out.println("Target ion type:\t" + target.type + "\n");
						nNearest++;
					}
					else
						continue;
			}// end of source (14th cell)
		}// end of target (everywhere)
		System.out.println("Number of nearest neighbour interactions:\t" + nearest);
		System.out.println("Number of next-nearest neighbour interactions:\t" + nNearest);
	}// end of listInteractions
	
	public static void listInteractionsCompact(List<Ion> ionList) {
		Ion source;
		Ion target;
		
		int IID = 0;
		
		double n = nDistance(ionList);
		double nn = nnDistance(ionList);
		
		for(int i=0; i<ionList.size(); i++) {
			
			if (ionList.get(i).parent_cell != 14)
				continue;
			
			for(int j=0; j<ionList.size(); j++) {
					source = ionList.get(i);
					target = ionList.get(j);
					if (getDistance(source, target) == n || getDistance(source, target) == nn) {
						String output = "";
						String cell = "";
						output = output + IID + " ";
						output = output + source.id + " ";
						output = output + target.id + " ";
						switch(target.parent_cell){
							case 1:
								cell = "-1 -1 -1 ";
								 break;
							case 2:
								cell = "-1 0 -1 ";
								 break;
							case 3:
								cell = "-1 1 -1 ";
								 break;
							case 4:
								cell = "0 -1 -1 ";
								 break;
							case 5:
								cell = "0 0 -1 ";
								 break;
							case 6:
								cell = "0 1 -1 ";
								 break;
							case 7:
								cell = "1 -1 -1 ";
								 break;
							case 8:
								cell = "1 0 -1 ";
								 break;
							case 9:
								cell = "1 1 -1 ";
								 break;
								
							case 10:
								cell = "-1 -1 0 ";
								 break;
							case 11:
								cell = "-1 0 0 ";
								 break;
							case 12:
								cell = "-1 1 0 ";
								 break;
							case 13:
								cell = "0 -1 0 ";
								 break;
							case 14:
								cell = "0 0 0 ";
								 break;
							case 15:
								cell = "0 1 0 ";
								 break;
							case 16:
								cell = "1 -1 0 ";
								 break;
							case 17:
								cell = "1 0 0 ";
								 break;
							case 18:
								cell = "1 1 0 ";
								 break;
								
							case 19:
								cell = "-1 -1 1 ";
								 break;
							case 20:
								cell = "-1 0 1 ";
								 break;
							case 21:
								cell = "-1 1 1 ";
								 break;
							case 22:
								cell = "0 -1 1 ";
								 break;
							case 23:
								cell = "0 0 1 ";
								 break;
							case 24:
								cell = "0 1 1 ";
								 break;
							case 25:
								cell = "1 -1 1 ";
								 break;
							case 26:
								cell = "1 0 1 ";
								 break;
							case 27:
								cell = "1 1 1 ";
								 break;
						}// end of switch
						
						output = output + cell;
						output = output + "1";
						System.out.println(output);
						IID++;
					} 
					else
						continue;
			}// end of source (14th cell)
		}// end of target (everywhere)
	}// end of listInteractions
	
}// end of class
