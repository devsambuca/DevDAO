package net.devsambuca;

/**
 * @author Fominykh Vladimir
 */
public class DeveloperApp {

    public static void main(String[] args) {

        DeveloperDAO d1 = new DeveloperDAO();


        d1.create(1l,"aeao","uoeuo","oeuoeu",23.2);

   //     d1.save(de);

        System.out.println();
       d1.getById(1l);
      System.out.println();
//        d1.remove(5l);
//        System.out.println();
        d1.deleteById(2l);
//        d1.getById(2l);
//        System.out.println();
//        d1.update(developer);
        d1.getAll();

    }
}
