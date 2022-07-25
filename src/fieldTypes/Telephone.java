package fieldTypes;

public class Telephone {

public String number;

public static int quantity;

public static double total;

static {
    quantity = 250;
    total = 15658.92;
}

public void setNumber(String number){
this.number = number;
}

public String getNumber(){
    return  this.number;
}

    public static void main(String[] args) {
        System.out.println("telephone.total = " +Telephone.total);
        Telephone telephone = new Telephone();
        System.out.println("After ObjectTelephone.total = " +Telephone.total);

        telephone.setNumber("555-436768");
        System.out.println("telephone.getNumber() =" +telephone.getNumber());




    }




}
