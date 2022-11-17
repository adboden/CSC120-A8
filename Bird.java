public class Bird implements Contract{

    String name;
    int position;
    boolean normalSize;

    public Bird(String n){
        this.name = n;
        this.position = 0;
        this.normalSize = true;
    }

    public void displayBird(){
        System.out.println("   \\\\");
        System.out.println("   (o>");
        System.out.println("\\\\_//)");
        System.out.println(" \\_/_)");
        System.out.println("  _|_ ");
    }

    public void grab(String item){
        System.out.println("   \\\\");
        System.out.println("   (o> " + item);
        System.out.println("\\\\_//)_/");
        System.out.println(" \\_/_)");
        System.out.println("  _|_ ");
    }

    public String drop(String item){
        System.out.println("   \\\\");
        System.out.println("   (o>");
        System.out.println("\\\\_//)");
        System.out.println(" \\_/_)");
        System.out.println("  _|_ ");
        return this.name + "has dropped" + item;
    }

    public void examine(String item){
        System.out.println("       /￣￣￣￣￣￣￣￣￣￣￣￣￣\\");
        System.out.println("      | Hmmm... very interesting! |");
        System.out.println("       \\__________________________/   ");
        System.out.println("   \\\\   ∨ ");
        System.out.println(   "   (-> " + item);
        System.out.println("\\\\_//)_/");
        System.out.println(" \\_/_)");
        System.out.println("  _|_ ");
    }

    public void use(String item){
        System.out.println("       /￣￣￣￣￣￣￣￣￣￣￣\\");
        System.out.println("      | I'm using " + item +"! ");
        System.out.println("       \\_______________________/   ");
        System.out.println("   \\\\   ∨ ");
        System.out.println("   (o>");
        System.out.println("\\\\_//)");
        System.out.println(" \\_/_)");
        System.out.println("  _|_ ");
    }

    public boolean walk(String direction){
        if(direction.equals("right")){
            position++;
            for(int i = 0; i <= position; i++){System.out.print(" ");}
            System.out.println("   \\\\");
            for(int i = 0; i <= position; i++){System.out.print(" ");}
            System.out.println("   (o>");
            for(int i = 0; i <= position; i++){System.out.print(" ");}
            System.out.println("\\\\_//)");
            for(int i = 0; i <= position; i++){System.out.print(" ");}
            System.out.println(" \\_/_)");
            for(int i = 0; i <= position; i++){System.out.print(" ");}
            System.out.println("  _|_ ");
            return true;
        }
        else if(direction.equals("left")){
            if(position == 0){
                throw new RuntimeException(this.name + "is already the as far left possible.");
            }
            else{
                position--;
                for(int i = 0; i <= position; i++){System.out.print(" ");}
                System.out.println("   \\\\");
                for(int i = 0; i <= position; i++){System.out.print(" ");}
                System.out.println("   (o>");
                for(int i = 0; i <= position; i++){System.out.print(" ");}
                System.out.println("\\\\_//)");
                for(int i = 0; i <= position; i++){System.out.print(" ");}
                System.out.println(" \\_/_)");
                for(int i = 0; i <= position; i++){System.out.print(" ");}
                System.out.println("  _|_ ");
                return true;
            }
        }
        else{
            throw new RuntimeException(direction + "is not a valid direction. Please enter \"left\" or \"right\"");
        }
    } 

    public boolean fly(int x, int y){
        for(int i = 0; i <= x; i++){System.out.print(" ");}
        System.out.println("   \\\\");
        for(int i = 0; i <= x; i++){System.out.print(" ");}
        System.out.println("   (o>");
        for(int i = 0; i <= x; i++){System.out.print(" ");}
        System.out.println("\\\\_//)");
        for(int i = 0; i <= x; i++){System.out.print(" ");}
        System.out.println(" \\_/_)");
        for(int i = 0; i <= x; i++){System.out.print(" ");}
        System.out.println("  _|_ ");

        for(int i = 0; i <= y; i++){
            System.out.println();
        }

        return true;
    }

    public Number shrink(){
        if(normalSize){
            throw new RuntimeException(name + "is already at it's smallest size.");
        }
        else{
            System.out.println("   \\\\");
            System.out.println("   (o>");
            System.out.println("\\\\_//)");
            System.out.println(" \\_/_)");
            System.out.println("  _|_ ");
            normalSize = true;
            return 100;
        }
    }
    
    public Number grow(){
        if(normalSize){
            System.out.println("   \\\\");
            System.out.println("    \\\\");
            System.out.println("    (o>");
            System.out.println("\\\\__//)");
            System.out.println(" \\\\_// ) ");
            System.out.println("  \\_/_)");
            System.out.println("    |");
            System.out.println("  __|__ ");
            normalSize = false;
            return 200;
        }
        else{
            throw new RuntimeException(name + " is already at largest size");
        }
    }

    /* puts bird to sleep */
    public void rest(){
        System.out.println("\n( ˘⊖˘)" + name + " is sleeping! He is eepy.");
    }

    /* Resets bird to original position */
    public void undo(){
        System.out.println("   \\\\");
        System.out.println("   (o>");
        System.out.println("\\\\_//)");
        System.out.println(" \\_/_)");
        System.out.println("  _|_ ");
    }


    public static void main(String[] args){

        Bird george = new Bird("George");
        george.displayBird();
        george.grab("pear");
        george.examine("pear");
        george.drop("apple");
        george.walk("right");
        george.grow();
        george.fly(10,20);
        george.use("pear");
        george.rest();

    }

}