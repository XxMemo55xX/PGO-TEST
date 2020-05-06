public class Main {
    public static void main(String[] args) {

        Policeman p1 = new Policeman(false, "John","Kowalski","JKowalski",1000);
        Policeman p2 = new Policeman(false, "Frank","Klasi","JKlasi",1000);
        Policeman p3 = new Policeman(false, "Michael","Kalsk","JKalsk",1000);
        Policeman p4 = new Policeman(false, "Simon","Kalski","JKalski",1000);
        Policeman p5 = new Policeman(false, "Jacob","Kowki","JKowki",1000);
        Policeman p6 = new Policeman(false, "Bob","Kowal","JKowal",1000);

        Partners partner1 = new Partners();
        Partners partner2 = new Partners();

        PoliceOffice o1 = new PoliceOffice();

        partner1.addPartner(p1);
        partner2.addPartner(p1);
        partner1.addPartner(p2);
        partner2.addPartner(p3);

        o1.addPoliceman(p1);
        o1.addPoliceman(p2);
        o1.addPoliceman(p3);
        o1.addPoliceman(p4);
        o1.addPoliceman(p5);
        o1.addPoliceman(p6);

        p1.ChangeActivity(true);
        p2.ChangeActivity(true);
        p3.ChangeActivity(true);
        p4.ChangeActivity(true);
        p5.ChangeActivity(true);

        

        System.out.println("Number of policeman: "+o1.numberOfPoliceman());
        System.out.println("Number of active policeman: "+o1.numberOfActivePolicemen());


        System.out.println("Policeman Data: "+ p1.getfName() + "/" + p1.getlName() + "/" + p1.getLogin() + "/" + p1.getID());
        System.out.println("Policeman Data: "+ p2.getfName() + "/" + p2.getlName() + "/" + p2.getLogin() + "/" + p2.getID());
        System.out.println("Policeman Data: "+ p3.getfName() + "/" + p3.getlName() + "/" + p3.getLogin() + "/" + p3.getID());
        System.out.println("Policeman Data: "+ p4.getfName() + "/" + p4.getlName() + "/" + p4.getLogin() + "/" + p4.getID());
        System.out.println("Policeman Data: "+ p5.getfName() + "/" + p5.getlName() + "/" + p5.getLogin() + "/" + p5.getID());
        System.out.println("Policeman Data: "+ p6.getfName() + "/" + p6.getlName() + "/" + p6.getLogin() + "/" + p6.getID());
    }
}
