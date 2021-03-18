public class CerealRunner {
    
    public static void main(String[] args) {
        Cereal cocoaPuffs = new Cereal("Cocoa Puffs", 100);

        System.out.println(cocoaPuffs.getName());
        System.out.println(cocoaPuffs.getCalories());
        System.out.println(cocoaPuffs.toString());
    
    }
}

