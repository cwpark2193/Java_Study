package Q8;

class Job extends Thread {
	private String name;
	
    public Job(String name) {
		super();
		this.name = name;
		
	}
    
	public void run() {
		 byte n = 0;
          while(true)
        	  System.out.println(name+n++);
               //System.out.println(""+n++);
    }
}