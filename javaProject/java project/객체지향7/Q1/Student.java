package Q1;

	class Student {
       private int number;
       public String name;
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Student(int number, String name) {
			super();
			this.number = number;
			this.name = name;
		}
	}
