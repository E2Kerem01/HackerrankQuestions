package questions;


public class JavaMethodOverriding{

    public static void main(String []args){

        abstract class Sports{
            String getName(){
                return "Generic Sports";
            }
            void getNumberOfTeamMembers(){
                System.out.println( "Each team has n players in " + getName() );
            }

            abstract void getNumberOfTeamMembers(int n);
        }

        class Soccer extends Sports{
            @Override
            String getName(){
                return "Soccer Class";
            }

            @Override
            void getNumberOfTeamMembers(int n){
                System.out.println( "Each team has " + n + " players in " + getName() );
            }

        }

        Sports c1 = new Sports() {
            void getNumberOfTeamMembers(int n) {

            }
        };
        Soccer c2 = new Soccer();

        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers(11);


    }
}
