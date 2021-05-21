package Exercise;

enum Direction{ east,south,west, north}

public class Ex3 {

	public static void main(String[] args) {
		Direction d1 =  Direction.east;
		Direction d2 = Direction.valueOf("west");
		Direction d3 = Enum.valueOf(Direction.class, "east");
		
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		System.out.println("d3="+d3);
		
		
		System.out.println(d1 == d2);
		System.out.println(d1 == d3);
		System.out.println(d1.equals(d3));
		System.out.println(d1.compareTo(d3));
		System.out.println(d1.compareTo(d2));
		
		switch(d1) {
		case east:
			System.out.println("the direction is east");
			break;
		case south:
			System.out.println("the direction is south");
			break;
		case west:
			System.out.println("the direction is west");
			break;
		case north:
			System.out.println("the direction is north");
			break;
		default:
			System.out.println("Invalid directon");
			break;
		}
		Direction[] dArr = Direction.values();
		for(Direction d: dArr) {
			System.out.println(d.name()+","+d.ordinal());
		}
		
	}

}
