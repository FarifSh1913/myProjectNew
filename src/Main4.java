public class Main4 {
    public static void main(String[] args) {
        printAlcoholAppruve("Кирилл",23);
        printAlcoholAppruve("Фариф", 17);
    }
    public static void printAlcoholAppruve (String name,int age){
        if (age > 18) {
            System.out.println(name + "," + age + " - " + "Можно пить");
        } else
        {
            System.out.println(name + "," + age + " - " + "Пить нельзя");
        }
    }

}
