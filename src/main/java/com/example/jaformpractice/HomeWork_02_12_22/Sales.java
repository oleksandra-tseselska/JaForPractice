package com.example.jaformpractice.HomeWork_02_12_22;

public class Sales{

    public void Sales() {};
    private User findUserByName(String name){
        User temp = new User("Temp");
        for(User user: User.users){
            if(user.getName().equals(name)){
                temp = user;
            }
        }

        return temp;
    }

    public void newSale(String name, Double acquisition){
        User user = findUserByName(name);
        if(user.getBalance() >= acquisition){
            user.setAcquisition(acquisition);
            user.setBalance(user.getBalance() - acquisition);
        }else {
            System.out.println("\nPlease, check your balance\n");
        }
    }
}
