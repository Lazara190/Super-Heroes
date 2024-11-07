public class HeroSearch
            {
                public static void main(String[] args)
                {
                    Hero[] heroes ={
                        new Hero("Vuperion","Reverce","89"){
                        new Hero("Carapace","Protection","50");
                        new Hero("Pegasus","Teletransportation","70");}
                        
                        String searchName = "Monarc";
                        boolean found = false;

                        for (Hero; hero : heroes){
                            if(hero.name.equalsIgnoreCase(searchName))
                            {
                                System.out.println(hero);
                                found = true;
                                break;

                                if (!found) 
                                {
                                    System.out.println("Hero Not Found");
                                }
                            }
                        }
                    }
                }
            }

    
