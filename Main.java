public class Main {

    public static void main(String[] args) {
	    ManageTaskList tasks_to_do = ManageTaskList.getInstance();
	    tasks_to_do.addCommand(new PaintDo
	    	("House");
	    tasks_to_do.addCommand(new PaintDo
	    	("Door"));
	    tasks_to_do.addCommand(new RunDo
	    	("Fast");
	    tasks_to_do.addCommand(new RunDo
	    	("Flash"));
	    tasks_to_do.addCommand(new WashDo
	    	("Laundry"));
	    tasks_to_do.addCommand(new WashDo
	    	("Dog"));
	    tasks_to_do.addCommand(new CarryDo
	    	("Bags"));
	    tasks_to_do.addCommand(new CarryDo
	    	("Boxes"));
		tasks_to_do.addCommand(new CleanDo
			("Stoff");
		tasks_to_do.addCommand(new CleanDo
			("Room"));
		tasks_to_do.addCommand(new CookDo
			("Lasaña");
		tasks_to_do.addCommand(new CookDo
			("Cereal"));


        Robot r1 = new Robot("Android 16");
		Robot r2 = new Robot("Android 17");
		Robot r3 = new Robot("Cell")
    }
}