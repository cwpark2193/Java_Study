package Q6;

class Animal
{
       String name;
       public Animal()     {
             name = "UNKNOWN";
             System.out.println("동물입니다:" + name);
       }
       public Animal(String name) {
             this.name = name;
             System.out.println("동물입니다:" + name);
       }
}