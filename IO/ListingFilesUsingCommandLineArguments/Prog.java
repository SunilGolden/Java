/*
This program lists file and directory names using Command Line Argument 

java Prog [directory] [attribute]
  attrbutes:
	-f		Lists all file names
	-d 		Lists all directory names
	/? 		Shows instruction
-> Use current working directory, if it is not specified.	 
*/

import java.io.File;

class Prog {

	public static void main(String[] args) {

		try {

			String directory;
			String attribute;

			// If directory is not specified, use current working directory
			if (args.length < 2 ) {
				directory = System.getProperty("user.dir");
				attribute = args[0]; 
			}
			else {
				directory = args[0];
				attribute = args[1];
			}

			File file = new File(directory);

			switch(attribute) {

				case "-f":
					String[] files = file.list();
					for (String i: files) {
						System.out.println(i);
					}
					break;

				case "-d":
					File[] dir = file.listFiles();
					for (File i: dir) {
						System.out.println(i);
					}
					break;

				case "/?":
					System.out.println("\nDisplays files and sub-directories in a directory");
					System.out.println("java Prog [directory] [attribute]");
					System.out.println("attribute :");
					System.out.println("  -f  To list file names");
					System.out.println("  -d  To list directories");
					break;
				
				default:
					System.out.println("Please enter a valid attribute: -f or -d");
				break;	
			}
		}

		catch(Exception e) {
			System.out.println(e);
		}
	}
}	 
